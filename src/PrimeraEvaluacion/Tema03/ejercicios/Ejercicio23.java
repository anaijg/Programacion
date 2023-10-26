package PrimeraEvaluacion.Tema03.ejercicios;

import java.util.Scanner;

/*
Escribe un programa que, dado un número n introducido por teclado, dibuje un cuadrado de dimensiones n * n, con un carácter también introducido por teclado.
 */
public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Número: ");
        int n = teclado.nextInt(); teclado.nextLine(); // para que funcione el siguiente nextLine()
        System.out.print("Carácter:");
        char c = teclado.nextLine().charAt(0);
        // ahora dibujamos el cuadrado
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) { // este for me imprime una fila
                System.out.print(c + "\t");
            }
            // cada vez que termino una fila, hago un salto de línea antes de empezar la siguiente
            System.out.println();
        }

    }
}
