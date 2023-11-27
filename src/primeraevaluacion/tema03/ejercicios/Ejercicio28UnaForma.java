package primeraevaluacion.tema03.ejercicios;

import java.util.Scanner;

/*
Hacer un programa que imprima todos los números múltiplos de 5 entre 1 y n, siendo n un número introducido por el usuario.
 */
public class Ejercicio28UnaForma {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();

        // recorremos con un for todos los enteros entre 0 y n
        // vamos a considerar que incluimos n
        for (int i = 1; i <= n; i++) {
            // si i es múltiplo de 5 (al dividirlo por 5, el resto da 0, lo  imprimo
            if (i % 5 == 0) {
                System.out.print(i + " ");
            }
        }




    }
}
