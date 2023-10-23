package PrimeraEvaluacion.Tema03.ejercicios;

import java.util.Scanner;

/*
Escribe un programa que pida números hasta que se introduzca un cero. Debe imprimir la suma y la media de todos los números introducidos (sin contar el 0 con que finaliza el programa).
 */
public class Ejercicio34 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número (0 para finalizar): ");
        int numero = teclado.nextInt();
        int contador = 0;
        double suma = 0;
        while (numero != 0) {
            suma = suma + numero; // añado el número introducido a la suma que tengo acumulada hasta el momento
            contador++;
            // antes de salir, pido otro número
            System.out.print("Introduce un número (0 para finalizar): ");
            numero = teclado.nextInt();
        }
        double media = suma / contador;
        System.out.printf("Media = %.2f", media);

    }
}
