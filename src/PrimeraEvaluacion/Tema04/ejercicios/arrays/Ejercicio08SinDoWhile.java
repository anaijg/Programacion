package PrimeraEvaluacion.Tema04.ejercicios.arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
Realizar un programa que pida un tamaño de array por teclado y a continuación cree un array formado por elementos aleatorios pares entre 1 y 50.

 */
public class Ejercicio08SinDoWhile {
    public static void main(String[] args) {
        // pido tamaño
        Scanner teclado = new Scanner(System.in);
        int tamaño = teclado.nextInt();

        // creo el array de ese tamaño
        int[] array = new int[tamaño];
        int numero = 0;
        Random generador = new Random();
        for (int i = 0; i < tamaño; i++) {
            // genero un número aleatorio
                numero = generador.nextInt(1, 51);

            if (numero % 2 == 0) {
                // guardo el número
                array[i] = numero;
            } else {
                i--; // hago retroceder la i para que cuando se incremente en el for no "avance" en la posición del array
            }
                     // es posible que meta un número impar, pero lo machacaré cuando tenga uno par
                // no salgo de aquí hasta que no haya generado
        }
        System.out.println(Arrays.toString(array));
    }
}
