package PrimeraEvaluacion.Tema03.ejercicios;

import java.util.Random;

/*
Hacer un programa que genere 10 números aleatoriamente y calcule su media.
 */
public class Ejercicio22 {
    public static void main(String[] args) {
        Random generador = new Random();
        int numero = 0; // declaramos esta variable antes del for para poder "recuperarla" después del for; en este caso no es necesario, la podríamos haber creado dentro del for
        int suma = 0;
        for (int i = 0; i < 10; i++) { // en cada vuelta, genero un número y lo acumulo en la variable suma
            numero = generador.nextInt(1,11); // genera números entre 1 y 10
            suma = suma + numero;
            System.out.println("Numero: " + numero + " Suma: " + suma);
        }
        // una vez que tengo hecha la suma de los diez números, calculo la media
        double media = suma / 10.0; // añado el .0 porque si no estoy haciendo la división entre números enteros
        // mostramos la media con 2 decimales
        System.out.printf("Media = %.2f", media);



    }
}
