package PrimeraEvaluacion.Tema02.ejercicios.ejerciciosOperadores;

import java.util.Scanner;

/*
Escribe un programa que lea los números a, b y c y compruebe si existe algún par de ellos que sumen exactamente 20. El programa debe imprimir un booleano (true o false).
 */
public class Ejercicio30 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n1 = teclado.nextInt();
        int n2 = teclado.nextInt();
        int n3 = teclado.nextInt();

        if ((n1 + n2 == 20) || (n1 + n3 == 20) || (n2 + n3 == 20)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
