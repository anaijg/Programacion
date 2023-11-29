package primeraevaluacion.tema04.ejercicios.arrays.bidimensionales;

import java.util.Random;

/*
Haz un programa que realice lo siguiente:
Crea un array bidimensional de 5x5 enteros y rellénalo con valores numéricos.
Suma todos los elementos de cada fila y todos los elementos de cada columna visualizando los resultados en pantalla.

 */
public class Ejercicio19 {
    public static void main(String[] args) {
        // Crea un array bidimensional de 5x5 enteros y rellénalo con valores numéricos.
        int[][] numeros = new int[5][5];
        Random generador = new Random();
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                numeros[i][j] = generador.nextInt(1,11); // lo rellenamos con números entre 1 y 10
            }
        }

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print(numeros[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
