package segundaevaluacion.colecciones.ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

/*
Haz un programa que lea 5 números decimales por teclado, los guarde en un array y los muestre en el mismo orden introducido.
 */
public class Ejercicio01ArraysConArrayList {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Double> decimales = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            decimales.add(teclado.nextDouble()); // guardo directamente el número que entra por teclado
        }
        System.out.println(decimales);
    }
}
