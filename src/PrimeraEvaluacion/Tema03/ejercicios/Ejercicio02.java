package PrimeraEvaluacion.Tema03.ejercicios;

import java.util.Scanner;

/*
Escribe un programa que pida dos números e indique si el primero es mayor que el segundo o no.
 */
public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int número1 = teclado.nextInt();
        System.out.print("Introduce otro número entero: ");
        int número2 = teclado.nextInt();
        if (número1 > número2) {
            System.out.println(número1 + " es mayor que " + número2);
        } else {
            System.out.println(número1 + " es menor o igual que " + número2);

        }
    }
}
