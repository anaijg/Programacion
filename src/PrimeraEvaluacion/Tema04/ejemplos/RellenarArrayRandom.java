package PrimeraEvaluacion.Tema04.ejemplos;

import java.util.Arrays;
import java.util.Random;

public class RellenarArrayRandom {
    public static void main(String[] args) {
        int[] números = new int[100];

        int max = 1000;
        int min = -1000;

        // quiero rellenar los 100 elementos del array con números aleatorios entre -1000 y 1000
        Random generador = new Random();
        for (int i = 0; i < números.length; i++) {
            números[i] = generador.nextInt(min, max + 1);
        }

        System.out.println(Arrays.toString(números));
        // lo ordeno para ver más claramente cuál es el número menor y mayor que ha generado
        Arrays.sort(números);
        System.out.println(Arrays.toString(números));

    }
}
