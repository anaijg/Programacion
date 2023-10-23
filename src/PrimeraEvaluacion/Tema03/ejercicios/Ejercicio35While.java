package PrimeraEvaluacion.Tema03.ejercicios;

import java.util.Scanner;

/*
Dada una secuencia de números enteros (que finaliza con el número 0), encuentra el elemento más grande de la secuencia. El número 0 no está incluido en la secuencia, sólo se utiliza para finalizar el programa. Los números son introducidos por teclado.
 */
public class Ejercicio35While {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt(); // pido el primer número por teclado
        // creo una variable para guardar el número que sea mayor hasta el momento
        int mayor = n; // el primer número es el mayor hasta el momento
        // y ahora vamos a ir pidiendo números, siempre que el introducido no sea 0
        while (n != 0) { // si el primer número introducido es 0, nunca entraría en el bucle, lo cual es perfecto en este caso
            n = teclado.nextInt();
            // cada número que entra, lo comparo con el mayor hasta ese momento
            if (n > mayor && n != 0) { // metemos el n != 0 por si metemos todos los números negativos
                mayor = n;
            }
        }
        // antes de que finalice el programa, imprimo el número mayor
        System.out.println(mayor);
    }
}
