package segundaevaluacion.colecciones.ejercicios;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*
Haz un programa en el que se cree un array que lea por teclado la longitud que debe tener y a continuación lo inicialice con números aleatorios comprendidos entre 1 y 10. Mostrar la suma de todos los números que se guardan en el array.
 */
public class Ejercicio04ArraysConArrayList {
    public static void main(String[] args) {
        // leemos por teclado la longitud (el tamaño) del arraylist
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la longitud del array: ");
        int a = teclado.nextInt();


        ArrayList<Integer> num = new ArrayList<>(a); // necesitamos un arraylist y un generador de números aleatorios
        Random generator = new Random();

        // añadimos al arraylist el número de números aleatorios que hayamos dicho
        for (int i = 0; i < a; i++) {
            num.add(generator.nextInt(1, 11)); // comprendidos entre 1 y 10
        }

        // lo recorremos sumando sus elementos
        int suma = 0;
        for (int i = 0; i < num.size(); i++) {
            suma += num.get(i); // es lo mismo que suma = suma + num.get(i)
        }
        System.out.println(num);
        System.out.println("La suma total es de: " + suma);
    }
}
