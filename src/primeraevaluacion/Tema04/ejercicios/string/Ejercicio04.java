package primeraevaluacion.Tema04.ejercicios.string;

import java.util.Scanner;

/*
Escribe un programa que lea el nombre de una ciudad y compruebe si el nombre termina con “burgo”. El programa debe imprimir true o false.
 */
public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el nombre de una ciudad:"); //
        String ciudad = teclado.nextLine();
        // y compruebe si el nombre termina con “burgo”
        System.out.println(ciudad.endsWith("burgo")); // Johanesburgo, Edimburgo, Estrasburgo -> true  ; Madrid, San Fernando -> false,
    }
}
