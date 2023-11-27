package primeraevaluacion.Tema02.ejercicios.ejerciciosBasicos;

import java.util.Scanner;

/*
Escribe un programa que lea tres cadenas de texto y las muestre en orden inverso, cada una en una nueva línea.
Entrada:
Java
Programación
Idioma
Salida:
Idioma
Programación
Java

 */
public class Ejercicio07 {
    public static void main(String[] args) {
        // para introducir datos por teclado siempre escribimos esta instrucción:
        Scanner teclado = new Scanner(System.in);
        // ahora guardamos en variables los datos que metemos, línea a línea:
        String palabra1 = teclado.nextLine();
        String palabra2 = teclado.nextLine();
        String palabra3 = teclado.nextLine();

        System.out.println();
        // mostramos lo que tenemos guardado en las variables, en el orden que indica el enunciado
        System.out.println(palabra3);
        System.out.println(palabra2);
        System.out.println(palabra1);
    }
}
