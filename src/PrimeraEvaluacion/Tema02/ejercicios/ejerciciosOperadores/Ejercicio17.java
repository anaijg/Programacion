package PrimeraEvaluacion.Tema02.ejercicios.ejerciciosOperadores;

import java.util.Scanner;

/*
Realizar un programa que lea cuatro valores numéricos e imprima su suma y su media. Ten en cuenta que la media puede contener decimales.
 */
public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1 = teclado.nextInt();
        int num2 = teclado.nextInt();
        int num3 = teclado.nextInt();
        int num4 = teclado.nextInt();
        int suma = num1 + num2 + num3 + num4;
        System.out.println("Suma = " + suma);
        // ahora calculamos la media: suma dividida por el número de valores que hemos sumado
        // las medias suelen tener decimales para que tengan sentido, entonces siempre declaramos esa variable como double (o float)
        double media = suma / 4.0; // si ponemos simplemente 4, hará la división entre dos números enteros ; para que tenga en cuenta los decimales, al menos uno de los dos valores debe ser double o decimal (al poner 4.0, Java ya considera que es una división entre números decimales). Otra opción podría haber sido declarar la suma como double
        System.out.println("Media = " + media);
    }
}
