package primeraevaluacion.tema03.ejercicios;

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

public class Ejercicio12If {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // Mostramos un menú para elegir la casa
        System.out.println("Elige una casa: ");
        System.out.println("1. gryffindor");
        System.out.println("2. hufflepuff");
        System.out.println("3. slytherin");
        System.out.println("4. ravenclaw");
        int casa = teclado.nextInt();;

        // una vez seleccionada una opción, escribimos una u otra cosa en función de esa opción
        if (casa == 1) { // si es "gryffindor" , salida "valentía" ;
            System.out.println("Valentía");
        } else if (casa == 2) { // si es "hufflepuff" , salida "lealtad" ;
            System.out.println("Lealtad");
        } else if (casa == 3) { // si es "slytherin" , salida "astucia" ;
            System.out.println("Astucia");
        } else if (casa == 4) { // si es "ravenclaw" , salida "intelecto" ;
            System.out.println("Intelecto");
        } else { // de lo contrario, se muestra "no es una casa válida" .
            System.out.println("No es una casa válida");
        }
    }
}
