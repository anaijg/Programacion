package PrimeraEvaluacion.Tema02.ejercicios.ejerciciosOperadores;

import java.util.Scanner;

public class Ejercicio29 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int n1 = teclado.nextInt();
        int n2 = teclado.nextInt();
        int n3 = teclado.nextInt();

        // si todos son diferentes entre sí, imprime true
        // false en cualquier otro caso
        boolean todosDiferentes = (n1 != n2) && (n1 != n3) && (n2 != n3);
        System.out.println(todosDiferentes);

    }

}
