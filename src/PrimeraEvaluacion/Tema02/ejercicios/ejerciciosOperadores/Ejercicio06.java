package PrimeraEvaluacion.Tema02.ejercicios.ejerciciosOperadores;

import java.util.Scanner;

/*
Escribe un programa que reciba un tiempo en segundos y muestre por pantalla este tiempo pero expresado en horas, minutos y segundos. Por ejemplo, 12.610 segundos son 3 horas, 30 minutos y 10 segundos.
 */
public class Ejercicio06 {
    public static void main(String[] args) {
        // Escribe un programa que reciba un tiempo en segundos
        Scanner teclado = new Scanner(System.in);
        int segundos = teclado.nextInt();

        // muestre por pantalla este tiempo pero expresado en horas, minutos y segundos
        int horas = segundos / 3600; // en cada hora hay 3600 segundos, por lo que si divido los segundos entre 3600 me da las horas que contienen
        int resto = segundos % 3600; // el resto son los segundos que sobran tras "extraer" las horas; ahora sacamos los minutos que hay en esos segundos
        // para eso dividimos ese resto entre 60 (segundos que hay en cada minuto)
        int minutos = resto / 60;
        // el resto de esa división son los segundos que quedan después de sacar las horas y los minutos
        int segundosQueQuedan = resto % 60;


        System.out.println("En " + segundos + " segundos hay " + horas + " horas, " + minutos + " minutos y " + segundosQueQuedan + " segundos.");
    }
}
