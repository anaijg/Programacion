package ejercicios.lambda.ejercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ejercicio1Main {
    public static void main(String[] args) {
        // 01.- Crea una lista de Strings y utiliza una expresión lambda para imprimir cada elemento de la lista.
        List<String> lista = new ArrayList<>();
        lista.add("uno");
        lista.add("dos");
        lista.add("tres");
        lista.add("cuatro");
        lista.add("cinco");
        lista.add("veinticuatro");

        System.out.println("Ejercicio 1:\n============");
        Ejercicio1 e1 = lista1 -> {
            for (String elemento : lista1) {
                System.out.println(elemento);
            }
        };

        e1.imprimeLista(lista);



        //02.- Crea una lista de Strings y utiliza una expresión lambda para contar cuántas palabras tienen más de 5 caracteres.
        System.out.println("\nEjercicdio 2:\n============");
        Ejercicio2 e2 = lista2 -> {
            int contador = 0;
            for (String elemento: lista2) {
                if (elemento.length() > 5) {
                    contador++;
                }
            }
            return contador;
        };

        System.out.println(e2.palabrasConMasDe5Caracteres(lista));


        //03.- Crea una lista de números enteros y utiliza una expresión lambda para encontrar el número mayor.
        List<Integer> numeros = new ArrayList<>();
        // la relleno con 20 números aleatorios entre 0 y 1000
        Random generador = new Random();
        for (int i = 0; i < 20; i++) {
            numeros.add(generador.nextInt(0,1001));
        }
        //System.out.print(numeros + " ");

        System.out.println("\nEjercicio 3:\n============");
        Ejercicio3 e3 = lista3 -> {
            int mayor = lista3.get(0);
            for (int i = 1; i < lista3.size(); i++) {
                // si encuentro un número mayor al que tengo, lo sustituyo
                if (lista3.get(i) > mayor) {
                    mayor = lista3.get(i);
                }
            }
            return mayor;
        };
        System.out.println(e3.numeroMayor(numeros));


        //04.- Crea una lista de números enteros y utiliza una expresión lambda para encontrar la suma de los números pares.
        System.out.println("\nEjercicio 4:\n============");
        Ejercicio4 e4 = lista12 -> {
            int suma = 0;
            for (Integer numero: lista12) {
                if (numero % 2 == 0) {
                    suma += numero;
                }
            }
            return suma;
        };

        System.out.println("\nEjercicio 4:\n============");
        System.out.println(e4.sumaPares(numeros));


        //05.- Crea una lista de objetos de tipo Persona (con atributos nombre y edad) y utiliza una expresión lambda para encontrar a la persona más joven.
        System.out.println("\nEjercicio 5:\n============");
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Carlos", 29));
        personas.add(new Persona("Óscar", 15));
        personas.add(new Persona("Kamilly", 18));
        personas.add(new Persona("Sergio",  13));
        personas.add(new Persona("Ana",  8));
        personas.add(new Persona("Alejandro",  55));
        System.out.println("Recién creada la lista: ");
        System.out.println(personas);

        // 1) Ordenamos por edades de menor a mayor
        // además, por primera vez vamos a utilizar la versión más corta posible
        System.out.println("01");
        personas.sort((p1, p2) -> p1.getEdad() - p2.getEdad());
        System.out.println("\nOrdenados por edad (de menor a mayor)");
        //System.out.println(personas);

        // si quisiéramos ordenar de mayor a menor
        //personas.sort((p1, p2) -> p2.getEdad() - p1.getEdad());
        //System.out.println("\n\n" + personas);

        // 2) Cogemos el que haya quedado primero
        System.out.println("\n02");
        System.out.println("Persona más joven: " + personas.get(0));

        // si nos pidieran, sin volver a ordenar, el último elemento de la lista
        //System.out.println(personas.get(personas.size() - 1));

        System.out.println("\nEjercicio 6:\n============");
        //06.- Crea una lista de objetos de tipo Persona (con atributos nombre y edad) y utiliza una expresión lambda para ordenar la lista por edad, de menor a mayor

        // hecho en el ejercicio anterior
        personas.sort((p1, p2) -> p1.getEdad() - p2.getEdad());
        System.out.println(personas);

        //07.- Crea una lista de objetos de tipo Persona y utiliza una expresión lambda para filtrar las personas que tienen una edad mayor a 30.
        System.out.println("\nEjercicio 7:\n============");
        // volveremos cuando sepamos cómo se hace un predicado
        personas.stream()
                .filter(persona -> persona.getEdad() > 30)
                .forEach(persona -> System.out.println(persona));

        //08.- Crea una lista de objetos de tipo Producto (con atributos nombre y precio) y utiliza una expresión lambda para calcular el precio total de la lista.
        System.out.println("\nEjercicio 8:\n============");
            List<Producto> productos = new ArrayList<>();
            productos.add(new Producto("Pan", 0.99));
            productos.add(new Producto("Leche", 1.1));
            productos.add(new Producto("Jamón", 1));
            productos.add(new Producto("Estropajo", 2.15));
            productos.add(new Producto("Donuts", 1.5));
            productos.add(new Producto("Doritos", 1.25));
            productos.add(new Producto("Coca-cola", 1.25));
            productos.add(new Producto("Aceite", 10.5));

            // hemos creado una interfaz funcional con un único método abstracto
            Ejercicio8 e8 = lista8 -> {
                double total = 0;
                for (Producto item : lista8) {
                    total = total + item.getPrecio();
                }
                return total;
            };
            // ahora tengo que llamar al método que me hace el cálculo pasándole la lista de productos
            double resultado = e8.calcularTotal(productos);
        System.out.printf("Total: %.2f\n", resultado);

        // otra forma de hacerlo mucho más corto es con stream - map - sum
        resultado =  productos.stream()
                            .mapToDouble(producto -> producto.getPrecio())
                            .sum();
        System.out.printf("Otra forma: %.2f\n", resultado);

        //09.- Crea una lista de objetos de tipo Producto y utiliza una expresión lambda para ordenar la lista por precio, de mayor a menor.
        // no hay que hacer una interfaz funcional, sino que aprovechamos la que tiene Java: Comparator
        System.out.println("\nEjercicio 9:\n============");
        productos.sort((p1, p2) -> (int) (p2.getPrecio() * 100 - p1.getPrecio() * 100)); // REGLA/TRUCO: cuando lo que hay que ordenar son números decimales multiplicamos por 100 (o por 1000 si son 3 decimales, etc)
        productos.forEach(producto -> System.out.println(producto));


        //10.- Crea una lista de objetos de tipo Producto y utiliza una expresión lambda para filtrar los productos que tienen un precio menor a 10
        System.out.println("\nEjercicio 10:\n============");
        productos.stream()
                .filter(producto -> producto.getPrecio() < 10)
                .forEach(producto -> System.out.println(producto));


    }
}
