package PrimeraEvaluacion.Tema02.ejercicios.ejerciciosOperadores;

import java.util.Scanner;

/*
Realiza un programa que reciba una cantidad de minutos y muestre por pantalla a cuantas horas y minutos corresponde. Por ejemplo: 1000 minutos son 16 horas y 40 minutos.
 */
public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int minutos = teclado.nextInt();
        System.out.print(minutos + " minutos se corresponden con ");
        int horas = minutos / 60;
        minutos = minutos % 60;
        System.out.print( horas + " horas " + " y " + minutos + " minutos");
    }
}
