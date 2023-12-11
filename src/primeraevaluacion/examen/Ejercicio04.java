package primeraevaluacion.examen;

import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
//String cadena = "Lorem ipsum dolor sit amet, consectetur adipiscing elit";
        //String cadena = "Praesent mattis dictum lobortis";

        Scanner teclado = new Scanner(System.in);
        String cadena = teclado.nextLine();

        String[] palabras = cadena.split(" ");
        int mayor = palabras[0].length();

        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].length() > mayor) {
                mayor = palabras[i].length();
            }
        }

        System.out.println("La palabra más larga tiene " + mayor + " caracteres:");
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].length() == mayor) {
                System.out.println(palabras[i]);
            }
        }

    }
}
