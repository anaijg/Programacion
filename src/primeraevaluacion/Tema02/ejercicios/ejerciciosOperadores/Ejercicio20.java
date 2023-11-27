package primeraevaluacion.Tema02.ejercicios.ejerciciosOperadores;

/*
Realiza un programa que pida un número y un porcentaje, y
Calcule y muestre ese número incrementado en ese porcentaje.
Calcule y muestre ese número decrementado en ese porcentaje.
	Por ejemplo: si se introduce 10 y 20, el resultado es 12 y 8.

 */

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        // Realiza un programa que pida un número y un porcentaje
        Scanner teclado = new Scanner(System.in);
        System.out.println("Número: ");
        double número = teclado.nextDouble();
        System.out.println("Porcentaje: (por ejemplo, 20)");
        double porcentaje = teclado.nextDouble();

        // calculamos ese porcentaje así: número * porcentaje / 100
        double porcentajeCalculado = número * porcentaje / 100;
        System.out.println("El " + porcentaje + "% de " + número + " es " + porcentajeCalculado);

        //Calcule y muestre ese número incrementado en ese porcentaje -> sumamos al número el porcentaje calculado
        double númeroIncrementado = número + porcentajeCalculado;
        System.out.println(número + " incrementado un " + porcentaje + "% es " + númeroIncrementado);

        //Calcule y muestre ese número decrementado en ese porcentaje.
        double númeroDecrementado = número - porcentajeCalculado;
        System.out.println(número + " decrementado un " + porcentaje + "% es " + númeroDecrementado);
    }
}
