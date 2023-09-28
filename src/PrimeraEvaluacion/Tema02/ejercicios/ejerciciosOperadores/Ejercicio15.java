package PrimeraEvaluacion.Tema02.ejercicios.ejerciciosOperadores;

import java.util.Scanner;

/*
Hacer un programa que lea una temperatura en grados centígrados y la visualice en las escalas reamur, Fahrenheit y kelvin, teniendo en cuenta que
		Reamur = Centígrados x 0.8
        Fahenheit = (Centígrados * 9/5)+32
        Kelvin = Centígrados + 273
 */
public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double gradosC = teclado.nextDouble();
        double gradosR = gradosC * 0.8;
        double gradosF = (gradosC * 9/5) + 32;
        double gradosK = gradosC + 273;
        System.out.printf("Reamur = %.3f \n", gradosR);
        System.out.println("Farenheit = " + gradosF);
        System.out.println("Kelvin = " + gradosK);
    }
}
