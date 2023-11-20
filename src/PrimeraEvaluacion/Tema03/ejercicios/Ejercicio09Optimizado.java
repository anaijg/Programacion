package PrimeraEvaluacion.Tema03.ejercicios;

import java.util.Scanner;

/*
Escribe un programa que pida una fecha (día, mes y año) y diga si es correcta o no.
Suponemos que el año no es bisiesto. Ejemplo: 1-1-2001.
Para que sea correcta, el año tiene que ser mayor que 0, el mes debe estar entre 1 y 12.
Y el día según el mes que sea estará entre 1 y 31, o entre 1 y  30, o entre 1 y 28.
 */
public class Ejercicio09Optimizado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // meto la fecha como una cadena de texto
        String fecha = teclado.nextLine(); // Ejemplo: 12-11-2012
        // divido la cadena en trozos y los guardo en un array con split
        String[] arrayFecha = fecha.split("-"); // [12, 11, 2012]
        // cojo los datos del array y saco día, mes, año a variables de tipo int -> con Integer.parseInt
        int dia = Integer.parseInt(arrayFecha[0]);
        int mes = Integer.parseInt(arrayFecha[1]);
        int año = Integer.parseInt(arrayFecha[2]);
        // comprobamos si el año es correcto
        if ((año >= 0) && (mes >= 1 && mes <= 12) || (((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && dia >= 1 && dia <= 31)
                || ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia >= 1 && dia <= 31)
                || (dia >= 1 && dia <= 28))){
                    System.out.println("Fecha correcta.");
        } else {
            System.out.println("Fecha incorrecta.");
        }
    } // Esto habría que pulirlo más, pero, en resumen: si tienes if anidados los puedes meter todos juntos en un if utilizando && y ||
}
