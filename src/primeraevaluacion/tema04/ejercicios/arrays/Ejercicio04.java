package primeraevaluacion.tema04.ejercicios.arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
Haz un programa en el que se cree un array que lea por teclado la longitud que debe tener
y a continuación lo inicialice con números aleatorios comprendidos entre 1 y 10.
Mostrar la suma de todos los números que se guardan en el array.
 */
public class Ejercicio04 {
    public static void main(String[] args) {
        // se cree un array que lea por teclado la longitud que debe tener
        Scanner teclado = new Scanner(System.in);
        int tamaño = teclado.nextInt();
        int[] array = new int[tamaño];

        // y a continuación lo inicialice con números aleatorios comprendidos entre 1 y 10.
        Random generador = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = generador.nextInt(1, 11);
        }

        System.out.println(Arrays.toString(array));

        // Mostrar la suma de todos los números que se guardan en el array.
        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }
        System.out.println("Suma = " +  suma);
    }
}
