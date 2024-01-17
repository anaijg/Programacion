package segundaevaluacion.colecciones.ejercicios.ejercicio02rae;
/*
Implementar la clase Académico, cuyos atributos son el nombre y el año de ingreso
 */
public class Academico {
    // atributos
    private String nombre;
    private int añoIngreso;

    // constructor

    public Academico(String nombre, int añoIngreso) {
        this.nombre = nombre;
        this.añoIngreso = añoIngreso;
    }

    // getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAñoIngreso() {
        return añoIngreso;
    }

    public void setAñoIngreso(int añoIngreso) {
        this.añoIngreso = añoIngreso;
    }

    // toString

    @Override
    public String toString() {
        return "Academico{" +
                "nombre='" + nombre + '\'' +
                ", añoIngreso=" + añoIngreso +
                '}';
    }
}
