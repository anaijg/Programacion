package primeraevaluacion.tema03.masEjercicios;

import java.util.Scanner;

/*
Realiza un programa que lea y acepte únicamente aquellos que sean mayores que el último dado.
La introducción de números finaliza con la introducción de un 0.
Al final se mostrará: El total de números introducidos, excluido el 0. El total de números fallados.

@author Ainara
 */
public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int contadorfallo = 0; // necesitamos ir contando los fallos y los números tanto si son fallo como si no
        int contador = 0;
        int n = 1; // lo inicializamos a 1 porque si fuera a 0 no entraríamos en el while
        System.out.println("Dime un número inicial: ");
        int referencia = teclado.nextInt(); // este es el número inicial que vamos a considerar
        while (n != 0){ // mientras no introzucamos un 0, seguiremos
            System.out.println("Dime un número: ");
            n = teclado.nextInt(); // pido un número
            if (n < referencia && n != 0){ // si es menor y no es 0, tenemos que aumentar el contador de fallos
                System.out.println("Fallo es menor.");
                contadorfallo++;

            }
            referencia = n; // el último número introducido es la referencia para el siguiente
            contador++; // en cualquier caso incrementamos el contador
        }
        System.out.println("Total números introducidos: " + contador);
        System.out.println("El número de fallos: " + contadorfallo);
    }
}
