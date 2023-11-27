package primeraevaluacion.tema03.ejercicios;

import java.util.Scanner;

/*
A las marmotas les gusta organizar fiestas, y en sus fiestas les gusta comer tazas de mantequilla de cacahuete.
Pero no debe haber muchas, porque si no enferman.
Una fiesta de la marmota exitosa tiene entre 10 y 20 tazas de mantequilla de cacahuete, ambas inclusive, a menos que sea fin de semana, en cuyo caso necesitarán de 15 a 25 tazas.
Escribe un programa que lea dos valores:
El primero es el número de tazas de mantequilla de cacahuete que hay en la fiesta.
El segundo es un booleano que indica si es fin de semana.
El programa debe imprimir si la fiesta tiene éxito o no (true o false).

 */
public class Ejercicio07 {
    public static void main(String[] args) {
        // leer dos valores
        Scanner teclado = new Scanner(System.in);
        // El primero es el número de tazas de mantequilla de cacahuete que hay en la fiesta.
        int tazas = teclado.nextInt();
        // El segundo es un booleano que indica si es fin de semana.
        boolean finde = teclado.nextBoolean();
        // necesito otra variable, para guardar si la fiesta tiene éxito o no
        boolean éxito = false;
        /*Una fiesta de la marmota exitosa tiene entre 10 y 20 tazas de mantequilla de cacahuete, ambas inclusive, a menos que sea fin de semana, en cuyo caso necesitarán de 15 a 25 tazas.*/
        // casos: que sea fin de semana
            // si las tazas son entre 15 y 25 -> éxito
            // en otro caso -> no éxito
        // si no es fin de semana:
            // si las tazas son entre 10 y 20 -> éxito{
            // en otro caso -> no éxito
        if ((finde && tazas >= 15 && tazas <= 25) || (!finde && tazas >= 10 && tazas <= 20)){
            éxito = true;
        } // no pongo un else, éxito = false porque en la línea 24 ya puse que éxito = false
        System.out.println(éxito);
        /*
        Pruebas a realizar:
        Tenemos que probar nuestro programa con un caso de cada tipo:
            finde - tazas ok       -> 15, 25 : imprime true
            finde - tazas no ok	   -> 14, 26 : imprime false
            no finde - tazas ok    -> 10, 20 : imprime true
            no finde - tazas no ok -> 9, 21	 : imprime false
         */

    }
}
