package PrimeraEvaluacion.Tema02.ejercicios.ejerciciosOperadores;

import java.util.Scanner;

/*
Escribe un programa que pida un número de dos cifras y muestre sus cifras invertidas.. Ejemplo, si se introduce 23 que muestre 32.
 */
public class Ejercicio08 {
    public static void main(String[] args) {
        // Escribe un programa que pida un número de dos cifras
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número de dos cifras: ");
        int numero = teclado.nextInt();
        // muestre sus cifras invertidas..
        int decenas = numero / 10;
        int unidades = numero % 10;
        // ahora los mostramos en el orden inverso, es decir, primero las unidades y luego las decenas
        System.out.println(unidades + "" + decenas);
    }
}
