package primeraevaluacion.tema03.ejercicios;

import java.util.Scanner;

/*
Escribe un programa que pide 5 números por teclado y al concluir escribe el mayor y menor de ellos (sin utilizar for).
 */
public class Ejercicio03 {
    public static void main(String[] args) {
        // la idea es que, cada vez que entra un número, lo comparo con el mayor que tengo
        // si el número nuevo es mayor, reemplazo el que tenía por este

        // para hacer esto utilizamos una variable "mayor" que va guardando el número mayor hasta el momento
        // es la primera vez que utilizamos una variable temporal o auxiliar; lo mismo con el menor
        int mayorTemporal;  // si declaro una variable int y no le asigno un valor, guarda un 0; es como si pusiera int mayor = 0;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int número1 = teclado.nextInt();
        // en este punto el primer número es el mayor necesariamente
        mayorTemporal = número1; // lo meto en "mayor"

        System.out.print("Otro: ");
        int número2 = teclado.nextInt();
        // comparo este segundo número con lo que tengo en mayor
        if (número2 > mayorTemporal) {
            mayorTemporal = número2; // lo  guardo como el mayor que tengo hasta ahora
        }

        System.out.print("Otro: ");
        int número3 = teclado.nextInt();
        if (número3 > mayorTemporal) {
            mayorTemporal = número3; // lo  guardo como el mayor que tengo hasta ahora
        }

        System.out.print("Otro: ");
        int número4 = teclado.nextInt();
        if (número4 > mayorTemporal) {
            mayorTemporal = número4; // lo  guardo como el mayor que tengo hasta ahora
        }
        System.out.print("Otro: ");
        int número5 = teclado.nextInt();
        if (número5 > mayorTemporal) {
            mayorTemporal = número5; // lo  guardo como el mayor que tengo hasta ahora
        }
        System.out.println("El número mayor es " + mayorTemporal);

        // Hago lo mismo con los menores:
        int menorTemporal = número1;
        if (número2 < menorTemporal) {
            menorTemporal = número2; // lo  guardo como el menor que tengo hasta ahora
        }
        if (número3 < menorTemporal) {
            menorTemporal = número3; // lo  guardo como el menor que tengo hasta ahora
        }
        if (número4 < menorTemporal) {
            menorTemporal = número4; // lo  guardo como el menor que tengo hasta ahora
        }
        if (número5 < menorTemporal) {
            menorTemporal = número5; // lo  guardo como el menor que tengo hasta ahora
        }
        System.out.println("El número menor es " + menorTemporal);

    }
}
