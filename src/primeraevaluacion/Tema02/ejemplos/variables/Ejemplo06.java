package primeraevaluacion.Tema02.ejemplos.variables;

import java.util.Scanner;

/*
variables de tipo boolean
 */
public class Ejemplo06 {
    public static void main(String[] args) {
        // son variables que sólo pueden tomar dos valores: true, false
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce edad: ");
        int edad = teclado.nextInt(); teclado.nextLine();

        boolean mayorDeEdad = edad >= 18; // si edad es >=18, guardará true; si no, false
        System.out.print("Eres mayor de edad: " + mayorDeEdad);

    }
}
