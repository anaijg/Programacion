package primeraevaluacion.Tema02.ejercicios.ejerciciosOperadores;

import java.util.Scanner;

/*
Escribe un programa que lea un número de tres cifras y muestre el número invertido. Por ejemplo: si introducimos el número 320, el programa debe mostrar 23; si introducimos 976, el programa debe mostrar 679.
 */
public class Ejercicio09 {
    public static void main(String[] args) {
        // Escribe un programa que lea un número de tres cifras
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();

        // y muestre el número invertido
        int centenas = numero / 100;
        int resto = numero % 100; // en este resto tengo las decenas y las unidades; en el ejemplo 976, sería 76
        int decenas = resto / 10; // en el resto de esta división quedan las unidades
        int unidades = resto % 10;

        // mostramos los tres dígitos invertidos
        System.out.println(unidades + "" + decenas + "" + centenas);

    }
}
