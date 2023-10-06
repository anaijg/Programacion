package PrimeraEvaluacion.Tema03.ejercicios;

/*
Harry Potter necesita ayuda para identificar lo que significa cada casa.
Lee una cadena que represente una casa (puedes asociarla a un número para hacer más fácil la entrada por teclado)
y que obtenga lo siguiente:
si es "gryffindor" , salida "valentía" ;
si es "hufflepuff" , salida "lealtad" ;
si es "slytherin" , salida "astucia" ;
si es "ravenclaw" , salida "intelecto" ;
de lo contrario, se muestra "no es una casa válida" .
 */

import java.util.Scanner;

public class Ejercicio12Switch {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // Mostramos un menú para elegir la casa
        System.out.println("Elige una casa: ");
        System.out.println("1. gryffindor");
        System.out.println("2. hufflepuff");
        System.out.println("3. slytherin");
        System.out.println("4. ravenclaw");
        int casa = teclado.nextInt();;

        // con los menús de este tipo, se suele utilizar más switch que if
        switch (casa) {
            case 1: // si casa == 1, escribe
                System.out.println("Valentía");
                break;
            case 2:
                System.out.println("Lealtad");
                break;
            case 3:
                System.out.println("Astucia");
                break;
            case 4:
                System.out.println("Intelecto");
                break;
            default:
                System.out.println("No es una casa válida");
        }
        System.out.println("Después del switch");
    }
}
