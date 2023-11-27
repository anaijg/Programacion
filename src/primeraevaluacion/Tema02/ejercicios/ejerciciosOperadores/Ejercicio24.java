package primeraevaluacion.Tema02.ejercicios.ejerciciosOperadores;

import java.util.Scanner;

/*
Un alumno desea saber cual será su nota final en un módulo. Dicha calificación se compone de los siguientes porcentajes:
El 55% se obtiene del promedio de la nota de las tres evaluaciones..
El 30% se obtiene de la nota en un examen final.
El 15% se obtiene de de la calificación de un trabajo final.

 */
public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Nota 1ª evaluación: ");
        double n1 = teclado.nextDouble();
        System.out.print("Nota 2ª evaluación: ");
        double n2 = teclado.nextDouble();
        System.out.print("Nota 3ª evaluación: ");
        double n3 = teclado.nextDouble();
        System.out.print("Nota examen: ");
        double examen = teclado.nextDouble();
        System.out.print("Nota trabajo: ");
        double trabajo = teclado.nextDouble();


        double notaFinal = ((n1 + n2 + n3) / 3.0) * 55.0 / 100.0 +
                + examen * 30.0 / 100.0 +
                + trabajo * 15.0 / 100.0;
    }
}
