package primeraevaluacion.Tema02.ejercicios.ejerciciosOperadores;

import java.util.Scanner;

/*
Realiza un programa que calcule la longitud de una circunferencia si nos dan el radio por teclado.

 */
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el radio de la circunferencia: ");
        double radio = teclado.nextDouble();
        // fórmula: 2 * pi * r
        double longitud = 2 * Math.PI * radio;
        System.out.printf("Longitud de la circunferencia: %.2f", longitud);
    }
}
