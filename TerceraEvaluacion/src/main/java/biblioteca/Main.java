package biblioteca;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Socio socio1 = new Socio("Caleb", "Calvo", LocalDate.of(2000, 12, 1));
        Socio socio2 = new Socio("Blas", "Blez", LocalDate.of(2010, 12, 1));
        Socio socio3 = new Socio("Fermín", "Fez", LocalDate.of(1999, 1, 1));
        Socio socio4 = new Socio("Alba", "Álvarez", LocalDate.of(2005, 10, 10));

        // los añadimos a un arraylist
        ArrayList<Socio> socios = new ArrayList<>();
        socios.add(socio1);
        socios.add(socio2);
        socios.add(socio3);
        socios.add(socio4);

        // ordenamos el arraylist
        //Collections.sort(socios);

        // e imprimimos el arraylist; se supone que tienen que aparecer ordenados por fecha de nacimiento, porque eso es lo que hemos indicado en el método compareTo
        for (Socio socio: socios) {
            System.out.println(socio);
        }
        // efectivamente, se han ordenado por fecha de nacimiento, de más reciente a más antiguo

        // ahora vamos a probar esta nueva clase
        // antes, debemos desordenar el arraylist. Para eso tenemos el método shuffle

        // comprobamos que está desordenado
        System.out.println("\nOrden natural");
        for (Socio socio: socios) {
            System.out.println(socio);
        }
        // ahora para ordenar utilizando comparator debemos crear un objeto de la clase comparadora
       CompararFechasNacimiento comparador = new CompararFechasNacimiento();
        // y para ordenar volvemos a llamar a Collections.sort pero pasándole esta vez la lista y el comparador
        socios.sort(comparador);
        // volvemos a imprimir
        System.out.println("\nOrdenados por fecha de nacimiento");
        for (Socio socio: socios) {
            System.out.println(socio);
        }

        // ahora ordenamos en orden inverso
        socios.sort(comparador.reversed());

        System.out.println("\nOrden inverso:");
        imprimirSocios(socios);

        socios.sort(new CompararApellidos());
        System.out.println("\nOrden alfabético de apellidos");
        imprimirSocios(socios);

    }

    public static void imprimirSocios(ArrayList<Socio> socios) {
        for (Socio socio: socios) {
            System.out.println(socio);
        }
    }
}
