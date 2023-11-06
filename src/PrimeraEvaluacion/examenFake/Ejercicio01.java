package PrimeraEvaluacion.examenFake;

import java.util.Scanner;

/**
 * @author Ana
 *
 * Realiza un programa que calcule la nota (mostrada con dos decimales) de la primera evaluación del módulo de Programación.
 * La nota se compone de un 30% de la nota de prácticas y un 70% de la nota del examen. La nota de las prácticas es la media de lo obtenido en cada una de las prácticas. A lo largo de la evaluación se han realizado dos prácticas.
 * El programa debe pedir al usuario la nota de las prácticas y la nota del examen, y mostrar la nota de la evaluación.
 */
public class Ejercicio01 {
    public static void main(String[] args) {
        // Pedimos datos
        Scanner teclado = new Scanner(System.in);
        System.out.print("Nota de la P01: ");
        int p01 = teclado.nextInt();
        System.out.print("Nota de la P02: ");
        int p02 = teclado.nextInt();
        System.out.print("Nota del examen: ");
        int examen = teclado.nextInt();

        // calculamos la nota
        double notaPrácticas = (p01 + p02) / 2.0;
        double nota = notaPrácticas * 30.0/100.0 + examen * 70.0 / 100.0;
        System.out.print("=================");
        System.out.printf("\nNota 1ª evaluación: %.2f", nota);

    }
}
