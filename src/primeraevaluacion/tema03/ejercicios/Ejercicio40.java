package primeraevaluacion.tema03.ejercicios;

import java.util.Random;
import java.util.Scanner;

/*
Escribe un programa que pida números al usuario entre 1 al 100 hasta que éste adivine un número que el programa ha elegido al azar. El programa debe ir dando pistas sobre si el número que tiene que adivinar es mayor o es menor que el introducido. El juego termina cuando te rindes (pulsando 0) o adivinas el número. Si se introduce un número fuera del intervalo debe dar un mensaje de error.
 */
public class Ejercicio40 {
    public static void main(String[] args) {
        // creamos número aleatorio entre 1 y 100 que luego el usuario tendrá que adivinar
        Random generador = new Random();
        int bingo = generador.nextInt(1, 101);

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número entre 1 y 100. Si te rindes, pulsa 0");
        int intento = teclado.nextInt();
        // casos:
        while (intento != 0 && intento != bingo) {
            if (intento < 1 || intento > 100) {
                System.out.println("Mal. Te has salido.");
            } else if (intento < bingo) {
                System.out.println(intento + " es menor que el número a adivinar.");
            } else if (intento > bingo) {
                System.out.println(intento + " es mayor que el número a adivinar.");
            }
            // antes de salir tenemos que hacer un nuevo intento
            System.out.println("Intenta de nuevo. 0 para rendirte.");
            intento = teclado.nextInt();
            if (intento == bingo) {
                System.out.println("¡Bingo!");
            }
        }

    }
}
