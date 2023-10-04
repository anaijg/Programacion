package PrimeraEvaluacion.Tema02.ejercicios.ejerciciosOperadores;

import java.util.Scanner;

/*
Escribe un programa que lea tres números enteros e imprima true si el primer número está entre el segundo y el tercero (ambos inclusive). De lo contrario, debe imprimir false.
 */
public class Ejercicio28 {
    public static void main(String[] args) {
        // Escribe un programa que lea tres números enteros
        Scanner teclado = new Scanner(System.in);
        int num1 = teclado.nextInt();
        int num2 = teclado.nextInt();
        int num3 = teclado.nextInt();

        // e imprima true si
        // el primer número está entre el segundo y el tercero (ambos inclusive). De lo contrario, debe imprimir false.
        boolean resultado = (num1 >= num2) && (num1 <= num3) || (num1 <= num2) && (num1 >= num3);
        System.out.println(resultado);




    }

}
