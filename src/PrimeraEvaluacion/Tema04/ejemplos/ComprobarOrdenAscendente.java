package PrimeraEvaluacion.Tema04.ejemplos;

import java.util.Arrays;

public class ComprobarOrdenAscendente {
    public static void main(String[] args) {
        int[] array1 = new int[5];
        for (int i = 0; i < array1.length; i++) {
            if (i % 2 == 0) {
                array1[i] = i + 2 * i;
            } else {
                array1[i] = i - 2 * i;
            }
        }
        System.out.println(Arrays.toString(array1));

        int[] array2 = {-5, 10, 16, 18, 100};

        // imaginemos que no sabemos lo que contiene el array
        // queremos averiguar si está ordenado de forma ascendente
        boolean ordenAscendente = true;
        // truco: si está ordenado ascendentemente, cada elemento tiene que ser menor o igual que el siguiente
        // y tendría que recorrer todo el array comparando los elementos dos a dos
        // es más corto pensar así: si no está ordenado, basta que un elemento sea mayor que el siguiente
        for (int i = 0; i < 5; i++) {
            if (array1[i] > array1[i + 1]) { // con una vez que se cumpla esto, ya está desordenado
                ordenAscendente = false;
                break; // nos saca fuera de for
            }
        }
        System.out.println("Array 1: " + ordenAscendente);

        // comprobamos el segundo array
        ordenAscendente = true;
        for (int i = 0; i < 4; i++) { // si el array está ordenado, para no salirnos con i+1 tenemos que quedarnos en el penúltimo índice
            if (array2[i] > array2[i + 1]) { // con una vez que se cumpla esto, ya está desordenado
                ordenAscendente = false;
                break; // nos saca fuera de for
            }
        }
        System.out.println("Array 2: " + ordenAscendente);

        //
    }
}
