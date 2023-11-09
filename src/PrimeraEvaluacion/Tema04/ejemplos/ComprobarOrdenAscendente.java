package PrimeraEvaluacion.Tema04.ejemplos;

import java.util.Arrays;

public class ComprobarOrdenAscendente {
    public static void main(String[] args) {

        int[] array1 = {0, 1, 6, -3, 12}; // desordenado
        int[] array2 = {-5, 10, 16, 18, 100}; // orden ascendente
        int[] array3 = {8, 6, 3, -1, -5}; // orden descendente

        // imaginemos que no sabemos lo que contiene el array
        // queremos averiguar si está ordenado de forma ascendente
        boolean ordenAscendente = true;
        // truco: si está ordenado ascendentemente, cada elemento tiene que ser menor o igual que el siguiente
        // y tendría que recorrer todo el array comparando los elementos dos a dos
        // es más corto pensar así: si no está ordenado, basta que un elemento sea mayor que el siguiente
        for (int i = 0; i < 4; i++) { // si no pongo como límite la penúltima posición (4), se desbordará cuando llegue a i + 1
            if (array3[i] > array3[i + 1]) { // con una vez que se cumpla esto, ya está desordenado
                ordenAscendente = false;
                break; // nos saca fuera de for
            }
        }
        System.out.println("Array 1: " + ordenAscendente);

        if (ordenAscendente) {
            System.out.println("El array está ordenado de forma ascendente");
        }

        // hasta aquí hemos comprobado si está en orden ascendente

        //
    }
}
