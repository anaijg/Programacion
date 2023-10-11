package PrimeraEvaluacion.Tema03.ejercicios;

import java.util.Scanner;

/*
Hacer un programa que pida dos números a y b, enteros, por teclado (se asume que a es menor que b siempre), e imprima la suma de todos los números enteros desde a hasta b, ambos inclusive.
 */
public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("a: ");
        int a = teclado.nextInt();
        System.out.print("b: ");
        int b = teclado.nextInt();

        int suma = 0;
        for (int i = a; i <= b; i++) {
            suma = suma + i;
            System.out.print(i + " " + suma + "\n");
        }
        System.out.println("\n\nLa suma de todos los números desde " + a + " hasta " + b + " es " + suma);

    }
}
