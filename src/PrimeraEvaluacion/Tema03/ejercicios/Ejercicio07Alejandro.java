package PrimeraEvaluacion.Tema03.ejercicios;
import java.util.Scanner;
public class Ejercicio07Alejandro {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el numero de tazas de mantequilla de cacahuete que hay: ");
        int tazas = teclado.nextInt();
        System.out.println("Introduce el dia de la semana: "); // se introducen los números de 1 a 7
        int diaSemana= teclado.nextInt();

        boolean findeExitoso = diaSemana>5 && diaSemana<=7 && tazas>=15 && tazas<=25; // éxito en finde
        if (diaSemana > 5 && diaSemana <= 7) {
            System.out.println("Éxito en fin de semana: "+ findeExitoso);
        }

        boolean entreSemanaExitoso =diaSemana>=1 && diaSemana<=5 && tazas>=10 && tazas<=20;
        if (diaSemana>= 1 && diaSemana <= 5) {
            System.out.println("Éxito de la fiesta entre semana: "+ entreSemanaExitoso);
        }
    }
}
