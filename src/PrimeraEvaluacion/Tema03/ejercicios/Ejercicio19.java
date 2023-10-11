package PrimeraEvaluacion.Tema03.ejercicios;
/*
Hacer un programa que calcule la suma de los números enteros del 1 al 10 (inclusive) usando el bucle for.
 */
public class Ejercicio19 {
    public static void main(String[] args) {
        int suma = 0;
        for (int i = 1; i <=  10 ; i++) {
            suma = suma + i;
        }
        System.out.println("suma de los números enteros del 1 al 10 (inclusive): " + suma);
    }
}
