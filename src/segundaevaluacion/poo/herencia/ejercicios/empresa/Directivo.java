package segundaevaluacion.poo.herencia.ejercicios.empresa;

import java.time.LocalDate;

/**
 * Clase Directivo, que
 * hereda de Empleado.
 * Tiene el atributo categoría, que es un tipo enumerado cuyos valores obtendremos de la siguiente URL: https://economipedia.com/definiciones/directivo.html
 * También sobreescribe el método mostrar con los valores de todos los atributos heredados más el atributo categoría.
 * Su constructor recibe todos los atributos como parámetros
 */

public class Directivo extends Empleado{
    private Categoria categoria;

    public Directivo(String nombre, LocalDate fechaNacimiento, double sueldoBruto, Categoria categoria) {
        super(nombre, fechaNacimiento, sueldoBruto);
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Directivo{" +
                "categoria=" + categoria +
                '}';
    }


}
