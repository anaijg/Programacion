package PrimeraEvaluacion.Tema02.ejercicios.ejerciciosOperadores;

import java.util.Scanner;

/*
Pide al usuario dos pares de números x1,y1 y x2,y2,
que representen dos puntos en el plano. Calcula y muestra la distancia entre ellos.
 */
public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("x1: ");
        double x1 = teclado.nextDouble();
        System.out.print("y1: ");
        double y1 = teclado.nextDouble();
        System.out.print("x2: ");
        double x2 = teclado.nextDouble();
        System.out.print("y2: ");
        double y2 = teclado.nextDouble();

        double distancia = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
        //System.out.println("La distancia entre (" + x1 + ", " + y1 + ") y (" + x2 + ", " + y2 + ") es " + distancia);
        System.out.printf("La distancia entre (%.2f, %.2f) y (%.2f, %.2f) es %.2f", x1, y1, x2, y2, distancia);
    }
}
