package PrimeraEvaluacion.Tema02.ejercicios.ejerciciosOperadores;

import java.util.Scanner;

/*
Escribe un programa que lea un valor entero y verifique si es menor que 10 y mayor que 0. El programa debe imprimir un booleano (true o false).
 */
public class Ejercicio27 {
    public static void main(String[] args) {
        // Escribe un programa que lea un valor entero
        Scanner teclado = new Scanner(System.in);
        int valor = teclado.nextInt();
        // verifique si es menor que 10 y mayor que 0.
        // vamos a escribir la expresión y guardar el resultado en un boolean
        boolean menorQue10YMayorQue0 = valor < 10 && valor > 0; // 0 < valor < 10 --> no se puede poner así
        System.out.println("Es menor que 10 y mayor que 0: " + menorQue10YMayorQue0);
    }
}
