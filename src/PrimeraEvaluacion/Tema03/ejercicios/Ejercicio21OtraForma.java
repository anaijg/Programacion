package PrimeraEvaluacion.Tema03.ejercicios;
/*Hacer el ejercicio anterior, pero sin asumir que el primer número es menor que el segundo. Es decir, pedir dos números enteros por teclado e imprimir la suma de todos los números enteros desde el menor hasta el mayor, ambos inclusive.*/

import java.util.Scanner;

public class Ejercicio21OtraForma {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("a: ");
        int a = teclado.nextInt();
        System.out.print("b: ");
        int b = teclado.nextInt();

        // Otra forma es hacer un if para ver cuál es mayor y menor, y hacer un for u otro
        int suma = 0;
        if (a > b) {
            for (int i = b; i <= a; i++) { // for que va sumando desde el número menor hasta el mayor, ambos inclusive
                suma = suma + i; // también se puede poner: suma += i;
            }
            System.out.println("La suma de los números desde " + b + " hasta " + a + " es " + suma);
        } else { // si a no es mayor que b
            for (int i = a; i <= b; i++) { // for que va sumando desde el número menor hasta el mayor, ambos inclusive
                suma = suma + i; // también se puede poner: suma += i;
            }
            System.out.println("La suma de los números desde " + a + " hasta " + b + " es " + suma);
        }
    }
}
