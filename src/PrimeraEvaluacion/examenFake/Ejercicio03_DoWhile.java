package PrimeraEvaluacion.examenFake;

import java.util.Scanner;

/**
 * @author Ana
 *
 * Realiza un programa que comience solicitando al usuario dos números enteros cualesquiera diferentes entre sí.
 * A continuación, el programa mostrará la secuencia de números entre el menor y el mayor (ambos inclusive) de los que ha introducido el usuario, pero sólo mostrará los impares.
 * Si los dos números introducidos son iguales, se debe indicar el error cometido y pedir al usuario que vuelva a intentarlo.
 */
public class Ejercicio03_DoWhile {
    public static void main(String[] args) {
        // solicitamos datos
        Scanner teclado = new Scanner(System.in);
        int n1 = 0, n2 = 0;
        do {
            System.out.println("Introduce dos números diferentes entre sí: ");
            n1 = teclado.nextInt();
            n2 = teclado.nextInt();
            teclado.nextLine();

            // si los dos números son iguales, se debe indicar el error cometido y pedir al usuario que vuelva a intentarlo
            if (n1 == n2) {
                System.out.println("Error: los números introducidos deben ser diferentes.\nVuelve a intentarlo.");
                System.out.println("Introduce dos números diferentes entre sí: ");
                n1 = teclado.nextInt();
                n2 = teclado.nextInt();
                teclado.nextLine();
            }
        } while (n1 == n2);

            // el programa mostrará la secuencia de números entre el menor y el mayor (ambos inclusive) de los que ha introducido el usuario
            int mayor = 0, menor = 0;

            if (n1 > n2) {
                mayor = n1;
                menor = n2;
            } else {
                mayor = n2;
                menor = n1;
            }

        for (int i = menor; i <= mayor; i++) {
            //, pero sólo mostrará los impares.
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        }
    }

