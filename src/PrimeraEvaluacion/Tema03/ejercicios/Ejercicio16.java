package PrimeraEvaluacion.Tema03.ejercicios;

import java.util.Scanner;

/*
Escribe un programa que pida dos números enteros, y pida la operación que quiere realizar con estos (+, -, *, /). El programa debe realizar la operación pedida y visualizar el resultado. En caso de que el símbolo introducido no sea correcto, visualizar: operación incorrecta.
 */
public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // Escribe un programa que pida dos números enteros,
        System.out.println("Introduce dos números enteros: ");
        int n1 = teclado.nextInt();
        int n2 = teclado.nextInt();
        teclado.nextLine(); // para que funcione el siguiente nextLine()
        // y pida la operación que quiere realizar con estos (+, -, *, /).
        System.out.println("Operación a realizar: +, -, *, /");
        char operación = teclado.nextLine().charAt(0); // para meter un carácter por teclado utilizamos charAt(0)
        // El programa debe realizar la operación pedida y visualizar el resultado
        switch (operación) {
            case '+':
                System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
                break;
            case '-':
                System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
                break;
            case '*':
                System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
                break;
            case '/':
                System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
                break;
            default: //en caso de que el símbolo introducido no sea correcto, visualizar: operación incorrecta.
                System.out.println("Operación incorrecta");
        }
    }
}
