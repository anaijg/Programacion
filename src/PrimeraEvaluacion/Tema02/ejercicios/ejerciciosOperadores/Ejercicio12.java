package PrimeraEvaluacion.Tema02.ejercicios.ejerciciosOperadores;

import java.util.Scanner;

/*
Realiza un programa que calcule el área de una circunferencia introduciendo el radio por teclado.
 */
public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el radio de la circunferencia: ");
        double radio = teclado.nextDouble();
        // fórmula: pi * r^2
        double área = Math.PI * Math.pow(radio, 2); // radio al cuadrado lo vamos a hacer con  Math.pow(base, exponente)
        System.out.printf("Área de la circunferencia: %.2f", área);
    }
}
