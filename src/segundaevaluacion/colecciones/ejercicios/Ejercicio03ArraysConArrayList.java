package segundaevaluacion.colecciones.ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

/*
Haz un programa que declare tres arrays (‘a1’, ‘a2’ y ‘a3’) de cinco enteros cada uno,
pida valores para ‘a1’ y ‘a2’
y calcule los elementos de a3 así: a3=a1+a2.
 */
public class Ejercicio03ArraysConArrayList {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Integer> a1 = new ArrayList<>();
        ArrayList<Integer> a2 = new ArrayList<>();
        ArrayList<Integer> a3 = new ArrayList<>();

        for (int i = 0; i <= 4; i++) {
            System.out.println("Introduce a1: ");
            a1.add(teclado.nextInt());      // guardamos el número introducido por teclado en la última posición de a1
            System.out.println("Introduce a2: ");
            a2.add(teclado.nextInt());      // guardamos el número introducido por teclado en la última posición de a2
            a3.add(a1.get(i) + a2.get(i));  // guardamos en a3 la suma de lo que hay en el índice i de a1 y de a2
        }

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
    }
}
