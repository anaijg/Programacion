package PrimeraEvaluacion.Tema03.ejercicios;

import java.util.Scanner;

/*
Hacer un programa que calcule el factorial de un número pedido por teclado. (Ejemplo: el factorial de 5 sería 5 * 4 * 3 * 2 * 1; el de 4 sería 4* 3 * 2 * 1, etc.)
 */
public class Ejercicio27 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();

        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        System.out.println("El factorial de " + n + " es " + factorial);
    }
}
