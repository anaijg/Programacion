package PrimeraEvaluacion.Tema03.ejercicios;

import java.util.Scanner;

/*
[FOR ANIDADO] Hacer un programa que dibuje un triángulo rectángulo de n elementos de lado,
siendo n un número introducido por teclado, utilizando asteriscos (*).
Por ejemplo, para n = 5:
*****
****
***
*

n = 6 (nº líneas)

en un bucle, n - i
******  6 - 0
*****	6 - 1
****    6 - 2
***     6 - 3
**      6 - 4
*       6 - 5

 */
public class Ejercicio31 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();

        for (int i = 0; i < n; i++) { // de 0 a n porque tiene que imprimir n líneas
            for (int j = 0; j < n - i; j++) { // imprimo desde 0 hasta
                System.out.print("*\t");
            }
            System.out.println() ; // cada vez que imprimo una línea, hago un salto
        }
    }
}
