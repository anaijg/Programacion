package PrimeraEvaluacion.Tema02.ejemplos.variables;

import java.util.Scanner;
/*
Variables de tipo char
 */
public class Ejemplo05 {
    public static void main(String[] args) {
        // la variable char sirve para guardar un único carácter
        // y se indica con comillas SIMPLES (comillas dobles son para String)
        char letra = 'a';
        System.out.println(letra);
        char número = '7';
        System.out.println(número);
        // para introducir valores char por teclado
        Scanner teclado = new Scanner(System.in);
        char carácter = teclado.nextLine().charAt(0); // cuando necesitamos introducir un char por teclado, añadir siempre el método charAt(0);

    }
}
