package segundaevaluacion.poo.clasesyobjetos.ejercicios.hoteles;

public class Main {
    public static void main(String[] args) {
        // aquí creamos los objetos
        Hotel hotel1 = new Hotel(1, Zona.PLAYA, 75);
        System.out.println(hotel1);
        hotel1.setPrecio(600);
        System.out.println(hotel1);
        hotel1.setPrecio(60);
        System.out.println(hotel1);

    }
}
