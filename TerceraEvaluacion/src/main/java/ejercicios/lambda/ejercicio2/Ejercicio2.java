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


    }
}
