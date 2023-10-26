package PrimeraEvaluacion.Tema03.ejercicios;

import java.util.Scanner;

/*
Escribe un programa que reciba dos valores enteros por teclado, a y b, y dibuje un rectángulo en que la base sea el número mayor y la altura el número menor, con un carácter también introducido por teclado.

 */
public class Ejercicio24OtraForma {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("a: ");
        int a = teclado.nextInt();
        System.out.print("b: ");
        int b = teclado.nextInt();teclado.nextLine();
        System.out.print("Carácter:");
        char c = teclado.nextLine().charAt(0);
        // tengo que ver cuál es el mayor para tomarlo como base
        int base = 0;
        int altura = 0;
        if (a < b) {
            // a es la altura (i) y b es la base (j)
            altura = a;
            base = b;
        } else {
            // a es la base (j) y b es la altura (i)
           altura = b;
           base = a;
        }
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                System.out.print(c + "\t");
            }
            System.out.println();
        }
    }
}
