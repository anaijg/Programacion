package segundaevaluacion.poo.herencia.teoria.empresateleco;

import java.time.LocalDate;
import java.util.Arrays;

public class Programador extends Empleado {
    protected String[] lenguajes;

    public Programador(String nombre, int añoNacimiento, String dirección, LocalDate fechaInicio, Long salario, String[] lenguajes) {
        super(nombre, añoNacimiento, dirección, fechaInicio, salario);
        this.lenguajes = lenguajes;
    }

    public Programador() {
        super("", 0, "", LocalDate.of(2000, 1,1), 0L);
    }

    public String[] getLenguajes() {
        return lenguajes;
    }

    public void setLenguajes(String[] lenguajes) {
        this. lenguajes = lenguajes;
    }

    @Override
    public String toString() {
        return "Programador{" +
                "lenguajes=" + Arrays.toString(lenguajes) +
                ", fechaInicio=" + fechaInicio +
                ", salario=" + salario +
                ", nombre='" + nombre + '\'' +
                ", añoNacimiento=" + añoNacimiento +
                ", dirección='" + dirección + '\'' +
                '}';
    }
}
