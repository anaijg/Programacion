package PrimeraEvaluacion.Tema02.ejercicios.ejerciciosOperadores;

import java.util.Scanner;

/*
Unas ardillas encuentran unas nueces y deciden dividirlas equitativamente. Escribe un programa que pregunte por el número de ardillas y nueces, y, a continuación, calcule (y muestre) cuántas nueces corresponden a cada ardilla y cuántas sobrarán tras el reparto.
 */
public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el número de ardillas: ");
        int ardillas = teclado.nextInt();
        System.out.print("Introduce el número de nueces: ");
        int nueces = teclado.nextInt();

        int cociente = nueces / ardillas;
        int resto = nueces % ardillas;

        System.out.println("A cada ardilla le corresponden " + cociente + " nueces y sobran " + resto + ".");

    }
}
