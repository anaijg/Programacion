package primeraevaluacion.tema03.ejercicios;

import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n1 = teclado.nextInt();
        int n2 = teclado.nextInt();
        int n3 = teclado.nextInt();
        // casos
        // ¿n1 menor?
        if (n1 < n2 && n1 < n3) {
            if (n2 < n3) {  // n1, n2, n3
                System.out.println(n1 + " < " + n2 + " < " + n3);
            } else { // n1, n3, n2
                System.out.println(n1 + " < " + n3 + " < " + n2);
            }
        } else if (n2 < n1 && n2 < n3) { // ¿n2 menor?
            if (n1 < n3) { // n2, 1n, n3
                System.out.println(n2 + " < " + n1 + " < " + n3);
            } else { // n2, n3, n1
                System.out.println(n2 + " < " + n3 + " < " + n1);
            }
        } else { // si no es el menor n1 ni n2, necesariamente lo es n3
            if (n1 < n2) { // n3, n1, n2
                System.out.println(n3 + " < " + n1 + " < " + n2);
            } else {
                System.out.println(n3 + " < " + n2 + " < " + n1);
            }
        }
    }
}
