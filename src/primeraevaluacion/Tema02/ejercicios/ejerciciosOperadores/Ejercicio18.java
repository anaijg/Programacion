package primeraevaluacion.Tema02.ejercicios.ejerciciosOperadores;

import java.util.Scanner;

/*
Realiza un programa que pida las notas de las tres evaluaciones del módulo Programación y muestre la nota final (la nota final es la media de las tres evaluaciones) con un decimal.
 */
public class Ejercicio18 {
    public static void main(String[] args) {
        // Realiza un programa que pida las notas de las tres evaluaciones del módulo Programación
        Scanner teclado = new Scanner(System.in);
        System.out.print("Primera evaluación: ");
        int eval1 = teclado.nextInt();
        System.out.print("Segunda evaluación: ");
        int eval2 = teclado.nextInt();
        System.out.print("Tercera evaluación: ");
        int eval3 = teclado.nextInt();
        //y muestre la nota final (la nota final es la media de las tres evaluaciones) con un decimal.
        double suma = eval1 + eval2 + eval3;
        double media = suma / 3.0;
        System.out.printf("Nota final: %.1f", media);
    }
}
