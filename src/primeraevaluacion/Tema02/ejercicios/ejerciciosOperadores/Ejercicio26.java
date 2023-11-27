package primeraevaluacion.Tema02.ejercicios.ejerciciosOperadores;

import java.util.Scanner;

/*
Escribe un programa que lea un valor por teclado y verifique si es menor que 10. El programa debe imprimir un booleano (true o false).
 */
public class Ejercicio26 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();
        System.out.println("Primera forma: ");
        boolean menorQue10 = numero < 10;
        System.out.println("¿Es menor que 10? " + menorQue10);
        System.out.println("Segunda forma: con el operador ternario");
        menorQue10 = numero < 10 ? true : false;
        System.out.println("¿Es menor que 10? " + menorQue10);
    }
}
