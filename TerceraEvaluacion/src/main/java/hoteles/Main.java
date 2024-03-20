package hoteles;

public class Main {
    public static void main(String[] args) {
        // aquí creamos los objetos
        Hotel hotel1 = new Hotel(1, Zona.PLAYA, 75);
        //System.out.println(hotel1);
        //hotel1.setPrecio(600);
        //System.out.println(hotel1);
        //hotel1.setPrecio(60);
        //System.out.println(hotel1);

        // creamos dos hoteles más: uno igual y otro distinto
        Hotel hotel2 = new Hotel(1, Zona.PLAYA, 75);
        Hotel hotel3 = new Hotel(1, Zona.MONTAÑA, 75);

        // comparamos los hoteles dos a dos
        System.out.println("Hotel 1 y hotel 2: " + hotel1.equals(hotel2));
        System.out.println("Hotel 1 y hotel 3: " + hotel1.equals(hotel3));
        System.out.println("Hotel 2 y hotel 3: " + hotel2.equals(hotel3));

    }
}
