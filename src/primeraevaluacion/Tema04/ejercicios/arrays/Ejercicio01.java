package primeraevaluacion.Tema04.ejercicios.arrays;

import java.util.Arrays;
import java.util.Scanner;

/*
Haz un programa que lea 5 números decimales por teclado, los guarde en un array y los muestre en el mismo orden introducido.
 */
public class Ejercicio01 {
    public static void main(String[] args) {
        // Haz un programa que lea 5 números decimales por teclado
        double[] numerosDecimales = new double[5]; // creo un array de números decimales de tamaño 5

        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < numerosDecimales.length; i++) {
            double numero = teclado.nextDouble();
            //  los guarde en un array --> tengo que tener creado ANTES el array
            numerosDecimales[i] = numero;
        }

        // y los muestre en el mismo orden introducido.
        System.out.println(Arrays.toString(numerosDecimales));
    }
}
