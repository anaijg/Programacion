package segundaevaluacion.poo.clasesyobjetos.ejercicios.ejercito;

public class Caballero {
    // Atributos: nombre, caballeros (int, estático)
    private String nombre;
    static int caballeros;
    // Constructor: recibe un nombre para el objeto creado e incrementa cada vez el número de caballeros.

    public Caballero(String nombre) {
        this.nombre = nombre;
        caballeros++;
    }
}
