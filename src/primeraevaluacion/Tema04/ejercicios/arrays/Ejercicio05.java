package primeraevaluacion.Tema04.ejercicios.arrays;

import java.util.Arrays;
import java.util.Random;

/*
Hacer un programa que inicialice una lista de números con valores aleatorios (10 valores),
y los muestre ordenados de menor a mayor.
 */
public class Ejercicio05 {
    public static void main(String[] args) {
        int[] array = new int[10];

        Random generador = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = generador.nextInt(1, 11);
        }
        System.out.println(Arrays.toString(array));

        // y los muestre ordenados de menor a mayor.
        Arrays.sort(array); // el método sort de la clase Array ordena los arrays de menor a mayor
        System.out.println(Arrays.toString(array));

        // ¿y si lo queremos ordenar al revés, es decir, de mayor a menor?
        int[] inverso = new int[array.length];
        for (int i = array.length - 1; i >= 0 ; i--) {
            inverso[i] = array[array.length - 1 - i];
        }
        System.out.println(Arrays.toString(inverso));
    }
}
