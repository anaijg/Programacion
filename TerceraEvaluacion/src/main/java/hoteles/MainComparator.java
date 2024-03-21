package hoteles;

import java.util.ArrayList;
import java.util.Collections;

public class MainComparator {
    public static void main(String[] args) {
        // aquí creamos los objetos
        Hotel hotel1 = new Hotel(1, Zona.PLAYA, 100);
        Hotel hotel2 = new Hotel(2, Zona.PLAYA, 75);
        Hotel hotel3 = new Hotel(3, Zona.MONTAÑA, 90);
        Hotel hotel4 = new Hotel(4, Zona.MONTAÑA, 85);

        // metemos los hoteles en un arraylist
        ArrayList<Hotel> hoteles = new ArrayList<>();
        hoteles.add(hotel1);
        hoteles.add(hotel2);
        hoteles.add(hotel3);
        hoteles.add(hotel4);

        System.out.println("Orden tal cual entran  en el arraylist");
        imprimirHoteles(hoteles);

        // ahora los ordenamos por precio
        System.out.println("\nOrdenados por precio de mayor a menor");
        CompararPrecio compararPrecio = new CompararPrecio();
        hoteles.sort(compararPrecio);
        imprimirHoteles(hoteles);

        System.out.println("\nOrdenados por precio de menor a mayor");
        hoteles.sort(compararPrecio.reversed());
        imprimirHoteles(hoteles);

        System.out.println("\nOrdenados por idHotel de menor a mayor");
        CompararIdHotel compararIdHotel = new CompararIdHotel();
        hoteles.sort(compararIdHotel);
        imprimirHoteles(hoteles);

        System.out.println("\nOrdenados por idHotel de mayor a mayor");
        hoteles.sort(compararIdHotel.reversed());
        imprimirHoteles(hoteles);



    }

    public static void imprimirHoteles(ArrayList<Hotel> hoteles) {
        for (Hotel hotel: hoteles) {
            System.out.println(hotel);
        }
    }
}
