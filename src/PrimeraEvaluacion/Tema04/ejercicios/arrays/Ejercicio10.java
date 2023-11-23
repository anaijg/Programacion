package PrimeraEvaluacion.Tema04.ejercicios.arrays;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        /*
        en el array).
Haz un programa que pida un número al usuario un número de mes (por ejemplo, el 4) y diga cuántos días tiene (por ejemplo, 30) y el nombre del mes. Debes usar arrays. Para simplificarlo vamos a suponer que febrero tiene 28 días
         */
        Scanner teclado = new Scanner(System.in);
        int[] meses = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] nombre = {" ", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        System.out.println("Introduce un número de mes (del 1 al 12): ");
        int mes = 0;
        do{
            mes = teclado.nextInt();
            if (mes < 1 || mes > 12){
                System.out.println("Ese mes no existe, prueba otra vez: ");
            }
        }while (mes < 1 || mes > 12);
        System.out.println(nombre[mes] + " " + "tiene " + meses[mes] + " días");
    }
}
