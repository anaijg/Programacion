package ejercicios.lambda.ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio2 {
    public static void main(String[] args) {
        Paciente paciente1 = new Paciente("Felipe R", 54,new String[]{"Nauseas", "Mareos"});
        Paciente paciente2 = new Paciente("Irene M", 32,new String[]{"Tos", "Cansancio", "Mareos"});
        Paciente paciente3 = new Paciente("Carmen C", 15,new String[]{"Ansiedad"});
        Paciente paciente4 = new Paciente("Santiago A", 8,new String[]{"Fractura de cadera"});
        Paciente paciente5 = new Paciente("Isabel A", 60,new String[]{"Tos", "Amnesia", "Fiebre", "Dolor"});

        List<Paciente> pacientes = new ArrayList<>();
        pacientes.add(paciente1);
        pacientes.add(paciente2);
        pacientes.add(paciente3);
        pacientes.add(paciente4);
        pacientes.add(paciente5);

        System.out.println("Según entran en la lista: ");
        System.out.println(pacientes);

        System.out.println("\nOrdenados por nombre (ascendente): ");
        pacientes.sort((p1, p2) -> p1.getNombre().compareTo(p2.getNombre())); // quédate con la copla: cuando son String se hace así
        System.out.println(pacientes);

        System.out.println("\nOrdenados por nombre (descendente): ");
        pacientes.sort((p1, p2) -> p2.getNombre().compareTo(p1.getNombre()));
        System.out.println(pacientes);

        System.out.println("\nOrdenados por edad (ascendente): ");
        pacientes.sort((p1, p2) -> p1.getEdad() - p2.getEdad());
        System.out.println(pacientes);

        System.out.println("\nOrdenados por edad (descendente): ");
        pacientes.sort((p1, p2) -> p2.getEdad() - p1.getEdad());
        System.out.println(pacientes);

        System.out.println("\nOrdenados por nº de síntomas (ascendente): ");
        pacientes.sort((p1, p2) -> p1.getSíntomas().length - p2.getSíntomas().length);
        System.out.println(pacientes);

        System.out.println("\nOrdenados por nº de síntomas (descendente): ");
        pacientes.sort((p1, p2) -> p2.getSíntomas().length - p1.getSíntomas().length);
        System.out.println(pacientes);

        // si lo consieras conveniente, puedes hacer un menú con seis opciones para seleccionar
    }
}
