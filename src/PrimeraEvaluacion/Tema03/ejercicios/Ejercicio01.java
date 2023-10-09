package PrimeraEvaluacion.Tema03.ejercicios;

import java.util.Scanner;

/*
Escribe un programa que pida un número e indique si es par o impar (un número es par si al dividirlo entre 2 el resto es 0).
 */
public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int número = teclado.nextInt();
        if (número % 2 == 0) {
            System.out.println("El número introducido es par.");
        } else {
            System.out.println("El número introducido es impar.");
        }

    }
}
