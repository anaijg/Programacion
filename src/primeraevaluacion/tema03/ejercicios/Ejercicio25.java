package primeraevaluacion.tema03.ejercicios;

import java.util.Scanner;

/*
Hacer un programa que introduzca un número entero, positivo, y calcule su tabla de multiplicar, hasta llegar a él. (Nota: para  que los números queden alineados en columnas puedes usar el tabulador \t).
 */
public class Ejercicio25 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        for (int i = 1; i <= n; i++) { // la tabla tiene que tener tantas filas como n
            System.out.print("Tabla del " + i + ": ");
            for (int j = 1; j < 11; j++) {
                System.out.print((i * j) + "\t");
            }
            System.out.println();
        }
    }
}
