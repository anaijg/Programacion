package segundaevaluacion.poo.herencia.ejercicios.empresa;

import java.util.ArrayList;

/**
 * Clase Empresa;
 * tiene el atributo nombre y además empleados y clientes, que representaremos con sendos ArrayList que añadiremos también como atributos.
 * Su constructor recibe todos los atributos como parámetros.
 * Añade un método mostrar(), que mostrará el resultado del método toString()
 */

public class Empresa {
    private String nombre;
    private ArrayList<Empleado> empleados;
    private ArrayList<Cliente> clientes;

    public Empresa(String nombre, ArrayList<Empleado> empleados, ArrayList<Cliente> clientes) {
        this.nombre = nombre;
        this.empleados = empleados;
        this.clientes = clientes;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nombre='" + nombre + '\'' +
                ", empleados=" + empleados +
                ", clientes=" + clientes +
                '}';
    }

    public void mostrar() {
        System.out.println(toString());
    }
}
