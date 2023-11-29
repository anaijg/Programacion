package primeraevaluacion.tema04.ejercicios.string;

import java.util.Scanner;

/*
Pide una cadena y un carácter por teclado y muestra cuantas veces aparece el carácter en la cadena.

 */
public class Ejercicio15 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce cadena: ");
        String cadena = teclado.nextLine();
        System.out.println("introduce caracter: ");
        String caracter = teclado.next();
        int contador = 0;

        // Con String
        for (int i = 0; i <cadena.length() ; i++) {
            if (cadena.substring(i, i + 1).equals(caracter)){
                contador++;
            }
        }
        System.out.println(contador);


    }
}