package PrimeraEvaluacion.Tema02.ejercicios.ejerciciosOperadores;

import java.util.Scanner;

/*
Un vendedor recibe un sueldo base mas un 10% de comisión por comisión sobre el total de las ventas que realice. El vendedor realiza tres ventas este mes y quiere saber cuánto dinero obtendrá por concepto de comisiones y el total que cobrará. Todos los datos que se desconocen se piden por teclado.
 */
public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Sueldo base: ");
        double sueldo = teclado.nextDouble();
        System.out.print("Importe de la venta 1: ");
        double venta1 = teclado.nextDouble();
        System.out.print("Importe de la venta 2: ");
        double venta2 = teclado.nextDouble();
        System.out.print("Importe de la venta 3: ");
        double venta3 = teclado.nextDouble();

        // Calculamos la comisión por ventas
        double comision = (venta1 + venta2 + venta3) * 10.0 / 100.0;
        System.out.printf("\nObtiene por comisiones: %.2f", comision);
        System.out.printf("\nObtiene en total: %.2f", (sueldo + comision));
    }
}
