package primeraevaluacion.Tema04.ejercicios.arrays;

import java.util.Arrays;
import java.util.Scanner;

/*
Se quiere realizar un programa que lea por teclado las 5 notas obtenidas por un alumno (comprendidas entre 0 y 10).
A continuación debe mostrar todas las notas, la nota media, la nota más alta que ha sacado y la menor.
 */
public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double[] notas = new double[5];
        // introduzco las notas por teclado y las voy guardando en el array
        for (int i = 0; i < notas.length; i++) {
            // si la nota no es válida, seguimos preguntando
            do {
                notas[i] = teclado.nextDouble();
                if (notas[i] < 0 || notas[i] > 10) {
                    System.out.println("No. Introduce otra.");
                }
            } while (notas[i] < 0.0 || notas[i] > 10.0);
        }
        // ordeno el array
        Arrays.sort(notas);

        // cojo la primera y la última notas
        double notaMasBaja = notas[0];
        double notaMasAlta = notas[4];

        // calculo la media
        double suma = 0;
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
        }

        double media = suma / notas.length;

        // muestro los datos
        System.out.println("Notas: " + Arrays.toString(notas));
        System.out.println("Nota más baja: " + notaMasBaja);
        System.out.println("Nota más alta: " + notaMasAlta);
        System.out.printf("Nota media: %.1f", media);



    }
}
