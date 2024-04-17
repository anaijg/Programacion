package ejercicios.stream.ejercicio3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MainEjercicio3 {
    public static void main(String[] args) {
        String animales = "Abadejo, Abejaruco, Abeja, Abejorro, Águila, Alacrán, Antílope, Babuino, Bacalao, Ballena, Barracuda, Bisonte, Búho, Caballo, Cebra, Chimpancé, Ciervo, Conejo, Cotorra, Coyote, Delfín, Dromedario, Elefante, Erizo, Foca, Gacela, Golondrina, Guepardo, Halcón, Hiena, Hormiga, Hurón, Iguana, Jabalí, Jirafa, Kiwi, Koala, Lagarto, Lince, Lobo, Mapache, Medusa, Mosca, Murciélago, Nutria, Ñu, Oso, Oveja, Paloma, Pantera, Perezoso, Reno, Ruiseñor, Salamandra, Sapo, Serpiente, Tiburón, Tigre, Tortuga, Urraca, Vaca, Yak, Zorro";

        // para separar los elementos entre sí utilizo el método split, que me los va a guardar en un array
        String[] arrayAnimales = animales.split(", ");
        //System.out.println(Arrays.toString(arrayAnimales));
        // creamos la lista
        ArrayList<String> listaAnimales = new ArrayList<>();

        // para añadir lo que tenemos en el array, hay varias formas
        /*for (String elemento: arrayAnimales) {
            listaAnimales.add(elemento);
        }*/

        // otra forma:
        listaAnimales.addAll(Arrays.asList(arrayAnimales)); // Arrays.asList -> te convierte el array que le pasas en una lista, y esa se la enchufamos al método addAll, que añade de golpe una lista entera a otra

        // Utilizando streams:

        //Muestra todos los animales que comiencen por una letra introducida por teclado.
        System.out.println("Animales que comienzan por una letra");
        Scanner teclado = new Scanner(System.in);
        System.out.print("Letra: ");
        String letra = teclado.nextLine().substring(0, 1).toLowerCase(); // por si meto más de una letra, que me coja la primera
        listaAnimales.stream().filter(animal -> animal.toLowerCase()
                .startsWith(letra)).forEach(System.out::println);

        //Muestra el animal que tenga el nombre más largo, y el que tenga el nombre más corto
        System.out.println("\nMuestra el animal que tenga el nombre más largo, y el que tenga el nombre más corto");
        System.out.println("El que tiene el nombre más largo: ");
        // listaAnimales.stream().sorted((a1, a2) -> a2.length() - a1.length()).forEach(System.out::println); -> no funciona, porque hay cuatro animales con la longitud máxima. Así que con max

        listaAnimales.stream().max((a1, a2) -> a2.length() - a1.length()).get();


        //Muestra el número de animales que contiene la lista.



    }
}
