package primeraevaluacion.tema03.ejercicios;

import java.util.Scanner;

/*
Hacer un programa que imprima todos los números múltiplos de 5 entre 1 y n, siendo n un número introducido por el usuario.
 */
public class Ejercicio28OtraForma {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();

        // recorremos con un for todos los enteros entre 0 y n
        // vamos a considerar que incluimos n
        for (int i = 5; i <= n; i = i + 5) { // hago que la i salte de 5 en 5
           System.out.print(i + " ");
        }
    }
}
