package primeraevaluacion.tema03.ejercicios;

import java.util.Scanner;

/*
Escribe un programa que lea un año e indique si es bisiesto.
Nota: un año es bisiesto si es divisible por 4, y no es divisible por 100, excepto que también sea divisible por 400.
 */
public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int año = teclado.nextInt();
        if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
            System.out.println("Bisiesto");
        } else {
            System.out.println("No bisiesto");
        }

    }
}
