package primeraevaluacion.examen;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        int[] array = new int[20];

        Random generador = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = generador.nextInt(1, 101);
        }

        System.out.println(Arrays.toString(array));

        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();
        double suma = 0;
        double contador = 0;
        for (int i = 1; i < array.length; i++) {
            if (i % numero == 0) {
                suma += array[i];
                contador++;
            }
        }
        double media = suma / contador;
        System.out.println(suma + " / " + contador + " = " + media);
    }
}
