package hoteles;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // aquí creamos los objetos
        Hotel hotel1 = new Hotel(1, Zona.PLAYA, 100);
        //System.out.println(hotel1);
        //hotel1.setPrecio(600);
        //System.out.println(hotel1);
        //hotel1.setPrecio(60);
        //System.out.println(hotel1);

        // creamos dos hoteles más: uno igual y otro distinto
        Hotel hotel2 = new Hotel(2, Zona.PLAYA, 75);
        Hotel hotel3 = new Hotel(3, Zona.MONTAÑA, 90);
        Hotel hotel4 = new Hotel(4, Zona.MONTAÑA, 85);

        // comparamos los hoteles dos a dos
        System.out.println("Hotel 1 y hotel 2: " + hotel1.equals(hotel2));
        System.out.println("Hotel 1 y hotel 3: " + hotel1.equals(hotel3));
        System.out.println("Hotel 2 y hotel 3: " + hotel2.equals(hotel3));

        // metemos los hoteles en un arraylist
        ArrayList<Hotel> hoteles = new ArrayList<>();
        hoteles.add(hotel1);
        hoteles.add(hotel2);
        hoteles.add(hotel3);
        hoteles.add(hotel4);

        System.out.println("Orden tal cual entran  en el arraylist");
        imprimirHoteles(hoteles);

        // ahora los ordenamos
        Collections.sort(hoteles);

        System.out.println("\nDespués de ordenar: ");
        imprimirHoteles(hoteles);



    }

    public static void imprimirHoteles(ArrayList<Hotel> hoteles) {
        for (Hotel hotel: hoteles) {
            System.out.println(hotel);
        }
    }
}
