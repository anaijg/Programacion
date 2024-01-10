package segundaevaluacion.poo.clasesyobjetos.ejercicios.hoteles;
/*
Crea una clase denominada Hotel con los atributos idHotel (int), zona(enum), y precio (double). Los valores para la zona podrán ser "playa","montaña" o "rural". El precio supondremos que es un dato en euros que podrá tomar valores entre 40 y 500.
Añade métodos para poder crear un hotel, para imprimir los datos de un hotel y para actualizar el precio de un hotel, controlando que el nuevo precio esté dentro de los valores establecidos.

 */
public class Hotel {
    // atributos
    private int idHotel;
    private Zona zona;
    private double precio;

    // constructor

    public Hotel(int idHotel, Zona zona, double precio) {
        this.idHotel = idHotel;
        this.zona = zona;
        this.precio = precio;
    }

    // getters y seters

    public int getIdHotel() {
        return idHotel;
    }

    public void setIdHotel(int idHotel) {
        this.idHotel = idHotel;
    }

    public Zona getZona() {
        return zona;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio >= 40 && precio <= 500) {
            this.precio = precio;
        } else {
            System.out.println("El precio debe estar entre 40€ y 500€");
        }
    }


    // toString

    @Override
    public String toString() {
        return idHotel + " - " + "\tUbicado en: " + zona + "\tPrecio por noche: " + precio + " €";
    }


    // métodos personalizados
}
