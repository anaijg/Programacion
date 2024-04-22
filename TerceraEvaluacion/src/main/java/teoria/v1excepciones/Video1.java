package teoria.v1excepciones;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Video1 {
    public static void main(String[] args) {

        // EXCEPCIONES NO VERIFICADAS:
        // AritmeticException
        try {
            int dividendo = 10;
            int divisor = 0;
            int cociente = dividendo / divisor; // esto es una .ArithmeticException: / by zero
        } catch (ArithmeticException exceptionA) {
            System.out.println("Ha petado.");
            System.out.println(exceptionA.getMessage());
        }

        System.out.println("Hemos pasado la excepción aritmética.");

        // ArrayIndexOutOfBoundsException
        try {
            int[] array = new int[3]; // array de tamaño 4; indice va 0 a 3
            int numero = array[3]; // ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
        } catch (ArrayIndexOutOfBoundsException excepcionLimiteArray) {
            System.out.println("Te has salido del array");
            System.out.println(excepcionLimiteArray.getMessage());
            System.out.println(excepcionLimiteArray.getStackTrace());
        }

        System.out.println("Hemos pasado la excepción del array");

        // NullPointerException
        try {
            String cadena = null;
            System.out.println(cadena.toLowerCase()); // NullPointerException: Cannot invoke "String.toLowerCase()" because "cadena" is null
        } catch (NullPointerException excepcionNull) {
            System.out.println("Tienes que inicializar la cadena con algún valor.");
        }

        System.out.println("hemos pasado el null pointer exception");
        // NumberFormatException

        try {
            int numero = Integer.parseInt("cochinillo"); // NumberFormatException: For input string: "cochinillo"
        } catch (NumberFormatException e) {
            System.out.println("Cochinillo no es un numerillo");
        }

        System.out.println("Hemos pasado el number format exception");

        // EXCEPCIONES VERIFICADAS
        try {
            FileReader fr = new FileReader("archivo.txt");
        } catch (FileNotFoundException e) {
            System.out.println("No se encuentra el fichero");
        }
        System.out.println("Y la vida sigue...");

    }
}
