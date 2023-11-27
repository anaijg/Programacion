package primeraevaluacion.Tema02.ejercicios.ejerciciosOperadores;

import java.util.Scanner;

/*
Escribe un programa que lea un valor entero n de la entrada estándar y muestre el resultado de la siguiente expresión aritmética:
((n + 1) * n + 2) * n + 3

 */
public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        // podría crear una variable para guardar el valor de la expresión, o ponerla directamente en el sout
        System.out.println("((n + 1) * n + 2) * n + 3 = " + (((n + 1) * n + 2) * n + 3)); // introduciendo esta expresión entre paréntesis y SIN COMILLAS, se calcula directamente
    }
}
