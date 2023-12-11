package primeraevaluacion.examen;

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();

        // Variables que vamos a necesitar
        int digitos = 0;
        int millares = 0;
        int centenas = 0;
        int decenas = 0;
        int unidades = 0;
        int resto = 0;
        int suma = 0;

        if (numero < 10) {
            digitos = 1;
        } else if (numero < 100) {
            digitos = 2;
            decenas = numero / 10;
            unidades = numero % 10;
        } else if (numero < 1000) {
            digitos = 3;
            centenas = numero / 100;
            resto = numero % 100; // aquí tenemos las decenas y las unidades
            decenas = resto / 10;
            unidades = resto % 10;
        } else {
            digitos = 4;
            millares = numero / 1000;
            resto = numero % 1000;
            centenas = resto / 100;
            resto = numero % 100;
            decenas = resto / 10;
            unidades = resto % 10;
        }

        suma = millares + centenas + decenas + unidades;

        System.out.println("Dígitos: " + digitos);
        System.out.print("Suma: ");
        switch (digitos) {
            case 1:
                System.out.println(numero);
                break;
            case 2:
                System.out.println(decenas + " + " + unidades + " = " + suma);
                break;
            case 3:
                System.out.println(centenas + " + " + decenas + " + " + unidades + " = " + suma);
                break;
            case 4:
                System.out.println(millares + " + " + centenas + " + " + decenas + " + " + unidades + " = " + suma);
                break;
            default:
        }

        boolean esPrimo = true;
        if (numero == 0 || numero == 1) {
            System.out.println("No forma parte de la tabla de números primos.");
        } else {
            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
        }

        if (numero == 0 || numero == 1) {

        } else if (esPrimo) {
            System.out.println("Es primo");
        } else {
            System.out.println("No es primo.");
        }

    }
}
