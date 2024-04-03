package ejercicios.personascomparator;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Mario", 22, 187));
        personas.add(new Persona("Pepe", 52, 173));
        personas.add(new Persona("Manuel", 27, 158));
        personas.add(new Persona("David", 25, 164));
        personas.add(new Persona("Alberto", 80, 184));

        System.out.println("Orden según entran en el arraylist");
        imprimirPersonas(personas);

        System.out.println("\nOrdenados por altura: ");
        personas.sort(new CompararAltura()); // al método sort le pasamos una instancia (objeto) de la clase CompararAltura
        imprimirPersonas(personas);

        // por edad (de menor a mayor) después.
        System.out.println("\nOrdenados por edad: ");
        // pasamos a sort() una instancia de esta clase
        personas.sort(new CompararEdad());
        imprimirPersonas(personas);



    }

    // vamos a crear un método que imprima el arraylist
    public static void imprimirPersonas(ArrayList<Persona> personas) {
        for (Persona persona: personas) {
            System.out.println(persona);
        }
    }
}
