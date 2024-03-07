package segundaevaluacion.poo.herencia.banco;

public class Persona {
    // la clase Persona, la cual contendrá información
    //    //sobre el titular: nombre, apellidos y DNI
    String nombre;
    String apellido1;
    String apellido2;

    String dni;

    public Persona(String nombre, String apellido1, String apellido2, String dni) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido1='" + apellido1 + '\'' +
                ", apellido2='" + apellido2 + '\'' +
                ", dni='" + dni + '\'' +
                '}';
    }
}
