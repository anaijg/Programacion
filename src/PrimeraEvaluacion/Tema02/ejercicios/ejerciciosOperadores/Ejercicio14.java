package PrimeraEvaluacion.Tema02.ejercicios.ejerciciosOperadores;
/*
Realiza un programa que calcule el área de un triángulo. Pedimos la base y la altura por teclado.
 */

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Base: ");
        double base = teclado.nextDouble();
        System.out.print("Altura: ");
        double altura = teclado.nextDouble();
        double área = base * altura / 2;
        System.out.println("Área del triángulo = " + área);
    }
}
