package primeraevaluacion.tema03.ejercicios;

import java.util.Random;
import java.util.Scanner;

/*
Realizar un programa que pida números (al arrancar el programa se pedirá por teclado la cantidad de números a introducir).
El programa debe informar de cuántos números introducidos son mayores que 0, menores que 0 e iguales a 0.
 */
public class Ejercicio30 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt(); // voy a generar n números

        // en  vez de meter los números por teclado, los vamos a generar aleatoriamente entre -10 y 10
        Random generador = new Random();
        int número = 0;
        // creo tres contadores: uno para cada caso
        int contadorPositivos = 0;
        int contadorNegativos = 0;
        int contadorCeros = 0;
        for (int i = 0; i < n; i++) {
            número = generador.nextInt(-10, 11);
            System.out.print(número + " ");
            // tengo que ver si este número es > 0, ...
            if (número < 0) {
                contadorNegativos++;
            } else if (número == 0) {
                contadorCeros++;
            } else {
                contadorPositivos++;
            }
        }
        // una vez que salgo del for, muestro cuántos hay de cada tipo
        System.out.println("\nNúmeros < 0: " + contadorNegativos);
        System.out.println("Números = 0: " + contadorCeros);
        System.out.println("Números > 0: " + contadorPositivos);
    }
}
