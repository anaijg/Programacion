package ejercicios.stream.ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class MainEjercicio2 {
    public static void main(String[] args) {
        // creamos una lista
        List<Personaje> personajes = new ArrayList<>();

        // añadimos los personajes de la tabla
        personajes.add(new Personaje("Gandalf", Integer.MAX_VALUE, Arma.BASTON, false));
        personajes.add(new Personaje("Aragorn", 88, Arma.ESPADA, true));
        personajes.add(new Personaje("Gimli", 140, Arma.HACHA, false));
        personajes.add(new Personaje("Legolas", 2931, Arma.ARCO, false));
        personajes.add(new Personaje("Boromir", 41, Arma.ESPADA, true));
        personajes.add(new Personaje("Frodo", 51, Arma.ANILLO, false));
        personajes.add(new Personaje("Sam", 33, Arma.ESPADA, false));


        System.out.println("Filtrar los personajes que sean jóvenes (menos de 90 años) y lleven espada.");
        personajes.stream()
                .filter(p -> p.getEdad() < 90 && p.getArma().equals(Arma.ESPADA))
                .forEach(System.out::println);

        System.out.println("\nFiltrar los personajes que no usan espada.");
        personajes.stream()
                .filter(p -> !p.getArma().equals(Arma.ESPADA))
                .forEach(System.out::println);

        System.out.println("\nMuestra los personajes ordenados por orden alfabético.");
        personajes.stream()
                .sorted((p1, p2) -> p1.getNombre().compareTo(p2.getNombre()))
                .forEach(System.out::println);

        System.out.println("\nMuestra los personajes humanos.");
        personajes.stream().filter(p -> p.isHumano()).forEach(System.out::println);



        System.out.println("\nMuestra el personaje más viejo.");
        personajes.stream()
                .sorted((p1, p2) -> p2.getEdad() - p1.getEdad()) // ordeno de mayor a menor por edad
                .limit(1)                                // cojo el primero (igual que en bbdd)
                .forEach(System.out::println);

        System.out.println("\n otra forma");
        Personaje viejo = personajes.stream()
                .max((p1, p2) -> p1.getEdad() - p2.getEdad())
                .get();
        System.out.println(viejo);

    }
}
