package PrimeraEvaluacion.Tema03.ejercicios;
/*Hacer el ejercicio anterior, pero sin asumir que el primer número es menor que el segundo. Es decir, pedir dos números enteros por teclado e imprimir la suma de todos los números enteros desde el menor hasta el mayor, ambos inclusive.*/

import java.util.Scanner;

public class Ejercicio21UnaForma {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("a: ");
        int a = teclado.nextInt();
        System.out.print("b: ");
        int b = teclado.nextInt();

        // Una manera es crear dos variables max y min, que guarden el número mayor y el menor
        int max;  //  tengo que declarar estas variables fuera del if porque, si no, no son visibles desde dentro del for; en general, las variables que creamos dentro de un bloque {} o, en un for (), no van a poderse utilizar (no son visibles) fuera de ese bloque
        int min;
        if (a > b) {
            max = a;
            min = b; // si b es <= a
        } else { // si a no es mayor que b
            max = b;
            min = a;
        }

        int suma = 0;
        for (int i = min; i <= max; i++) { // for que va sumando desde el número menor hasta el mayor, ambos inclusive
            suma = suma + i; // también se puede poner: suma += i;
        }
        System.out.println("La suma de los números desde " + min + " hasta " + max + " es " + suma);
    }
}
