package PrimeraEvaluacion.Tema04.ejercicios.arrays;

import java.util.Arrays;
import java.util.Random;

/*
       Crear un programa que rellene aleatoriamente un array de 10 números enteros. Guardar en otro array los elementos pares del primero, y, a continuación, los elementos impares
        */
public class Ejercicio15OtraForma {
    public static void main(String[] args) {
        // creamos un array de 10 enteros
        int[] numeros = new int[10];
        // creamos otro para meter el resultado: pares primero y luego los impares
        int[] resultado = new int[numeros.length];
        // creo una variable para ir avanzando en la posición del array desde el principio
        int indicePares = 0;
        // creo otra variable para ir retrocediendo en la posición del array desde el final
        int indiceImpares = resultado.length - 1;

        Random generator = new Random();

        // relleno el array de números aleatorios
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = generator.nextInt(1, 21);
        }
        System.out.println(Arrays.toString(numeros));

        // voy recorriendo el array de aleatorios y cuando encuentro un nº par, lo guardo en donde me diga el índice y además, avanzo el índice una posición
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0){
                resultado[indicePares] = numeros[i];
                indicePares++;
            } else {
                resultado[indiceImpares] = numeros[i];
                indiceImpares--;
            }
        }

        System.out.println(Arrays.toString(resultado));
    }
}
