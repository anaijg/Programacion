package segundaevaluacion.colecciones.ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

/*
Haz un programa que lea 5 números decimales por teclado, los guarde en un array y los muestre en el orden inverso al introducido.
 */
public class Ejercicio02ArraysConArrayList {
    public static void main(String[] args) {
        // creamos teclado y arraylist
        Scanner teclado = new Scanner(System.in);
        ArrayList<Double> arrayList = new ArrayList<>();

        // lo rellenamos con 5 números introducidos por teclado
        for (int i = 0; i < 5; i++) {
            arrayList.add(teclado.nextDouble());
        }
        // imprimimos el arraylist tal cual está
        System.out.println(arrayList);

        // lo imprimimos en orden inverso:
        // empezamos en la última posición, que es el tamaño - 1
        // y  vamos hacia atrás: cada vez disminuimos el índice en 1 : i--
        // seguimos hasta que llegamos a la primera posición, que es cuando el índice vale 0
        for (int i = arrayList.size() - 1; i >= 0 ; i--) {
            System.out.print(arrayList.get(i) + "\t");
        }
    }
}
