package PrimeraEvaluacion.Tema02.ejercicios.ejerciciosOperadores;

import java.util.Scanner;

/*
Realiza un programa que pida el precio de venta de un producto, la cantidad de productos comprados y el porcentaje de IVA aplicado.
El programa mostrará el importe total a abonar.
Además, aplicar un descuento del 15%
 */
public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Precio de venta del producto: ");
        double precio = teclado.nextDouble();
        System.out.print("Cantidad de productos comprados: ");
        int cantidadDeProductos = teclado.nextInt();
        System.out.print("Porcentaje de IVA: ");
        int iva = teclado.nextInt(); // podría ser perfectamente un double
        // para calcular el importe tenemos que saber el precio  total sin iva
        double precioSinIVA = precio * cantidadDeProductos;
        // calculamos el iva a sumar para este precio
        double ivaASumar = precioSinIVA * iva / 100.0;
        // añadimos el iva al precio
        double importeTotal = (precioSinIVA + ivaASumar);
        System.out.println("Importe total: " + importeTotal + " €");

        // aplicamos el descuento del 15%
        double cantidadADescontar = importeTotal * 15 / 100.0;
        System.out.println("Importe con descuento: " + (importeTotal - cantidadADescontar) + " €");


    }
}
