package primeraevaluacion.tema04.ejercicios.arrays;

import java.util.Arrays;
import java.util.Random;

/*
Escribe un programa en el que se crea un array de 60 elementos enteros.
Rellénalo con números aleatorios entre 1 y 5. Cuenta el número de 1, 2, 3, 4, 5 que contiene
 */
public class EjercicioHuelga {
    public static void main(String[] args) {
        // creamos un array de 60 enteros
        int[] n = new int[60];

        // creamos un contador para cada número
        int contador1 = 0;
        int contador2 = 0;
        int contador3 = 0;
        int contador4 = 0;
        int contador5 = 0;

        // lo rellenamos aleatorioamente
        Random generador = new Random();
        for (int i = 0; i < n.length; i++) {
            n[i] = generador.nextInt(1, 6);
            // según el número que tengamos, incrementamos un contador u otro
            if (n[i] == 1){
                contador1++;
            } else if (n[i] == 2) {
                contador2++;
            } else if (n[i] == 3) {
                contador3++;
            } else if (n[i] == 4) {
                contador4++;
            } else if (n[i] == 5) {
                contador5++;
            }
        }
        Arrays.sort(n);
        System.out.println(Arrays.toString(n));
        System.out.println("contador1: " + contador1);
        System.out.println("contador2: " + contador2);
        System.out.println("contador3: " + contador3);
        System.out.println("contador4: " + contador4);
        System.out.println("contador5: " + contador5);
    }
}

