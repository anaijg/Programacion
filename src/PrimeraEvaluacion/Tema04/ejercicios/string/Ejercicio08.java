package PrimeraEvaluacion.Tema04.ejercicios.string;

import java.util.Scanner;

/*
Escribe un programa que lea una cadena de texto que consista en un nombre y sus apellidos
y a continuación muestre las iniciales en mayúsculas.
"Felix Rodriguez de la Fuente"
Imprime: FRdlF
"Juan Sebastián Elcano"
Imprime: JSE
 */
public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre = teclado.nextLine();

        // tengo que extraer las iniciales
        // la primera va siempre:
        //String iniciales = nombre.charAt(0); // esto no me vale porque necesito String
        String iniciales = nombre.substring(0, 1);
        //System.out.println(iniciales);
        // a esta inicial vamos añadiendo las demás
        // vamos recorriendo carácter a carácter el nombre completo; cuando encontremos un " ", sabemos que lo siguiente es una inicial
        for (int i = 0; i < nombre.length() - 1; i++) { // pongo nombre.length() - 1 porque si no el i+1 que tengo en el substring me lo desbordaría
            if (nombre.substring(i, (i + 1)).equals(" ")) { // si el carácter que estoy mirando es un espacio
                // tengo que añadir el siguiente carácter a iniciales
                iniciales = iniciales + nombre.substring(i + 1, i + 2);
            }
        }
        System.out.println(iniciales.toUpperCase());
    }
}
