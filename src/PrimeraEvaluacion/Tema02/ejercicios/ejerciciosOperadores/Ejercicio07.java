package PrimeraEvaluacion.Tema02.ejercicios.ejerciciosOperadores;

import java.util.Scanner;

/*
Escribe un programa que pida un número de dos dígitos e imprima las decenas.
 */
public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número de dos dígitos: ");
        int número = teclado.nextInt();
        // sacamos las decenas dividiendo por 10
        int decenas = número / 10;
        System.out.println("Las decenas son: " + decenas);
    }
}
