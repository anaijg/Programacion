package PrimeraEvaluacion.Tema03.ejercicios;

import java.util.Scanner;

/*
Escribe un programa que, dados dos números, uno real (base) y un entero positivo (exponente), saque por pantalla el resultado de la potencia. No se puede utilizar el método  Math.pow().
 */
public class Ejercicio29 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double base = teclado.nextDouble();
        int exponente = teclado.nextInt();

        // Idea: suponemos base = 2 y exponente = 5
        // Resultado: 32 (saldría con Math.pow(2,5) pero no podemos
        //2^5 = 2 * 2 * 2 * 2 * 2
        //3^7 = 3 * 3 * .... * 3
        double potencia = 1;
        for (int i = 0; i < exponente; i++) {
            potencia = potencia * base;
        }
        System.out.println(base + " elevado a " + exponente + " = " + potencia);


    }
}
