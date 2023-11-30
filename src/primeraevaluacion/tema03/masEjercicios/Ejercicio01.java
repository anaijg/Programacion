package primeraevaluacion.tema03.masEjercicios;

import java.util.Scanner;

/*
Realiza un programa en java que pida un número entero positivo y nos diga si es primo o no.
 */
public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();


        boolean esPrimo = true; // empiezo suponiendo que es primo; si entro en el if del for, lo tendré que cambiar
        if (numero == 0 || numero == 1) {
            System.out.println("No es primo. Ni siquiera entra en consideración.");
        } else {
            for (int i = 2; i < numero; i++) {
                if(numero % i == 0) { // si al dividir numero por cualquier otro menor da de resto 0, no es primo
                    esPrimo = false;
                    break; // basta que encuentre un divisor para decir que no es primo y que salte fuera
                }
            }

            // solamente sabemos si es primo cuando hemos todo el for y no hemos entrado en el if
            if(esPrimo) {
                System.out.println("Es primo");
            } else {
                System.out.println("No es primo.");
            }
        }
    }
}
