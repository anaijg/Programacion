package segundaevaluacion.colecciones.ejercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/*
Hacer un programa que inicialice una lista de números con valores aleatorios (10 valores),
y los muestre ordenados de menor a mayor.
 */
public class Ejercicio05ArraysConArrayList {
    public static void main(String[] args) {
        // creamos un arraylist y un generador de números aleatorios
        ArrayList<Integer> num = new ArrayList<>(10);
        Random generator = new Random();

        // rellenamos el arraylist
        for (int i = 0; i < 10; i++) {
            num.add(generator.nextInt(1, 11));
        }
        System.out.println(num);
        // para ordenar de menor a mayor el arraylist, utilizamos el método sort de Collections.
        Collections.sort(num);
        System.out.println(num);
    }
}
