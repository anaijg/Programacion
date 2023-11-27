package primeraevaluacion.tema03.ejercicios;

import java.util.Scanner;

/*
Hacer un programa que pida caracteres e imprima ‘VOCAL’ si son vocales y ‘NO VOCAL’ en caso contrario, el programa termina cuando se introduce un espacio.

 */
public class Ejercicio38 {
    public static void main(String[] args) {
        // suponemos que sólo metemos letras
        Scanner teclado = new Scanner(System.in);
        char c = teclado.nextLine().charAt(0);
        while (c != ' ') { // si no es ' ', entramos en el bucle
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' ) {
                System.out.println("ES VOCAL");
            } else {
                System.out.println("NO VOCAL");
            }
            // antes de salir, pido otro carácter
            c = teclado.nextLine().charAt(0);
        }
    }
}
