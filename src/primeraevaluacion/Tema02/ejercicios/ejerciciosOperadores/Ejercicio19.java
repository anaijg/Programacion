package primeraevaluacion.Tema02.ejercicios.ejerciciosOperadores;

import java.util.Scanner;

/*
Realiza un programa que pida las notas finales de todos los módulos de 1º y muestre la nota final del curso. La nota final es la media de las notas de todos los módulos, redondeada a un número entero (por ejemplo, si la media es 7,5, la nota final es 8; si es 7,4, la nota final es 7).
 */
public class Ejercicio19 {
    public static void main(String[] args) {
        // INTRODUCIMOS LAS NOTAS:
        Scanner teclado = new Scanner(System.in);
        // FOL
        System.out.print("Nota de FOL:");
        double fol = teclado.nextDouble();
        // Sistemas Informáticos
        System.out.print("Nota de SI:");
        double sistemas = teclado.nextDouble();
        // Programación
        System.out.print("Nota de Programación:");
        double programacion =teclado.nextDouble();
        // Lenguajes de marcas
        System.out.print("Nota de Lenguajes de Marcas:");
        double marcas = teclado.nextDouble();
        // Bases de datos
        System.out.print("Nota de Bases de Datos:");
        double bbdd = teclado.nextDouble();
        // Entornos
        System.out.print("Nota de Entornos de Desarrollo:");
        double entornos = teclado.nextDouble();

        // Calculamos la media
        double notaFinal = (fol+ sistemas + programacion + marcas + bbdd + entornos) / 6;

        // Mostramos el resultado
        System.out.printf("Nota final: %.0f: ", notaFinal);
    }
}
