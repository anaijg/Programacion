package segundaevaluacion.poo.herencia.ejercicios.empresa;

import java.time.LocalDate;

/**
 * Clase Persona, con los atributos nombre y edad (con los modificadores de acceso adecuados teniendo en cuenta que va a ser la clase padre de una jerarquía de clases), y un método mostrar() que muestre sus valores al ser invocado. Su constructor recibe todos los atributos como parámetros.
 */


public class Persona {
    protected String nombre;
    // cambiamos edad por LocalDate
    protected LocalDate fechaNacimiento;
}
