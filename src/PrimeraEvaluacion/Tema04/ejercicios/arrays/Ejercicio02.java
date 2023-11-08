package PrimeraEvaluacion.Tema04.ejercicios.arrays;

import java.util.Scanner;

/*
Haz un programa que lea 5 números decimales por teclado, los guarde en un array y los muestre en el orden inverso al introducido.
 */
public class Ejercicio02 {
    public static void main(String[] args) {
        double[] numerosDecimales = new double[5]; // creo un array de números decimales de tamaño 5

        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < numerosDecimales.length; i++) {
            double numero = teclado.nextDouble();
            //  los guarde en un array --> tengo que tener creado ANTES el array
            numerosDecimales[i] = numero;
        }
        
        // y los muestre en el orden inverso al introducido.
        for (int i = numerosDecimales.length - 1; i >= 0 ; i--) { // recordemos que el último indice es 4
            System.out.print(numerosDecimales[i] + " "); // la i valdrá 4, 3, 2, 1, y 0
        }
    }
}
