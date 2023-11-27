package primeraevaluacion.Tema02.ejemplos.operadores;

import java.util.Scanner;

public class OperadoresAritméticosConEnteros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce dos números enteros: ");
        int numero1 = teclado.nextInt();
        int numero2 = teclado.nextInt();
        // suma
        int suma = numero1 + numero2;
        System.out.println(numero1 + " + " + numero2 + " = " + suma);

        // resta
        int resta = numero1 - numero2;
        System.out.println(numero1 + " - " + numero2 + " = " + resta);

        // multiplicación
        int producto = numero1 * numero2;
        System.out.println(numero1 + " · " + numero2 + " = " + producto);

        // división
        int cociente = numero1 / numero2;
        System.out.println(numero1 + " / " + numero2 + " = " + cociente);

        // resto de la división entera o módulo
        int resto = numero1 % numero2;
        System.out.println(numero1 + " % " + numero2 + " = " + resto);
    }
}
