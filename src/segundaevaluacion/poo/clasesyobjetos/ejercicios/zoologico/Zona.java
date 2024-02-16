package segundaevaluacion.poo.clasesyobjetos.ejercicios.zoologico;

import java.util.ArrayList;

/**
 * • El zoológico estará dividido en ZONAS. Cada zona tendrá un código identificativo, un
 * nombre y el número de metros cuadrados que ocupa.
 * Por ejemplo, la zona con código 01FEL, nombre “Felinos”, de 400 metros cuadrados.
 *
 * (y una zona tendrá varias instalaciones)
 */

public class Zona {
    private String codigo;
    private String nombre;
    private double metros2;

    private ArrayList<Instalacion> instalaciones;

    public Zona(String codigo, String nombre, double metros2) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.metros2 = metros2;
        // cada vez que creamos una zona reservamos memoria para añadir posteriormente las instalaciones
        this.instalaciones = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Zona{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", metros2=" + metros2 +
                '}';
    }
}
