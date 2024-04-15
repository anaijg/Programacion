package ejercicios.stream.ejercicio1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class MainEjercicio1 {
    public static void main(String[] args) {
        // Crea una lista de enteros con 20 elementos aleatorios entre 1 y 15.
        List<Integer> numeros = new ArrayList<>();

        Random generador = new Random();
        for (int i = 0; i < 20; i++) {
            numeros.add(generador.nextInt(1,16));
        }

        // Utilizando streams, haz lo siguiente:

        System.out.println("a. Imprime todos los elementos de la lista, sin ordenar.");
        numeros.forEach(n -> System.out.print(n + " "));

        System.out.println("\n\nb. Imprime todos los elementos de la lista, ordenados.");
        numeros.stream()
                .sorted().      // el método sorted funciona bien con números, de menor a mayor
                forEach(n -> System.out.print(n + " "));

        System.out.println("\n\nc. Imprime todos los elementos de la lista, sin repetir, ordenados.");
        numeros.stream()
                .distinct()         // el método distinct te seleccciona de la lista sólo los números que no se repiten
                .sorted()
                .forEach(n -> System.out.print(n + " "));

        System.out.println("\n\nd. Imprime sólo los mayores o iguales a 5 distintos entre sí.");
        numeros.stream()
                .filter(n -> n >= 5)
                .distinct()
                .forEach(n -> System.out.print(n + " "));

        System.out.println("\n\ne. Imprime sólo los mayores o iguales a 5 distintos entre sí,  ordenados.");
        numeros.stream()
                .filter(n -> n >= 5)
                .distinct()
                .sorted()
                .forEach(n -> System.out.print(n + " "));

        System.out.println("\n\nf. Imprime sólo los mayores o iguales a 5 distintos entre sí,  ordenados inversamente.");
        numeros.stream().filter(n -> n >= 5)
                        .distinct()
                        .sorted((n1, n2) -> n2 - n1)
                        .forEach(n -> System.out.print(n + " "));

        System.out.println("\nOtra forma: ");
        numeros.stream()
                .filter(n -> n >= 5)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .forEach(n -> System.out.print(n + " "));

        System.out.println("\n\ng. Suma todos los elementos de la lista e imprime el resultado.");
        int suma = numeros.stream()
                            .reduce(0, (n1, n2) -> n1 + n2);
        System.out.println(suma);

        System.out.println("\nOtra forma de sumar los elementos de una lista: ");
        suma = numeros.stream().mapToInt(n -> n).sum();
        System.out.println(suma);

        System.out.println("\nh. Suma todos los elementos mayores o iguales a 5 (también los que se repitan) e imprime el resultado.");
        suma = numeros.stream()
                .filter(n -> n >= 5)
                .reduce(0, (a, b) -> a + b);
        System.out.println(suma);

        // también saldría con filter -> mapToInt -> sum

        System.out.println("\ni. Calcula el promedio de todos los elementos de la lista (sin eliminar los repetidos) e imprime el resultado. \n");
        // lo podemos sacar con la suma por un lado, y el total de elementos de la lista, por otro lado (pero cuidadito con el int: hay que hacer casting a double antes de asignar)
        double promedio = (double) numeros.stream()
                                            .reduce(0, (n1, n2) -> n1 + n2)
                / (double) numeros.stream().count();
        System.out.println(promedio);

        System.out.println("\nOtra forma: con Optional");
        // la secuencia de métodos es muy parecida a la que nos lleva a sum(), pero en lugar de sum() elegimos average() y en vez de mapToInt, mapToDouble. O sea:
        promedio = numeros.stream()
                            .mapToDouble(n -> n)
                            .average() //el método average() devuelve un objeto de tipo OptionalDouble -> para convertirlo en un double hay que aplicar el método get()
                            .getAsDouble();
        System.out.println(promedio);



    }
}
