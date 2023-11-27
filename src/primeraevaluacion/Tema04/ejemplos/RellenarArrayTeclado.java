package primeraevaluacion.Tema04.ejemplos;

import java.util.Arrays;
import java.util.Scanner;

public class RellenarArrayTeclado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // tenemos que declarar un array y asignarle un tamaño
        // vamos a meter el tamaño también por teclado
        int n = teclado.nextInt();
        teclado.nextLine(); // para que no "salte" a la hora de meter luego un teclado.nextLine()
        // suponemos que queremos rellenar el array con cadenas de texto
        String[] cadenas = new String[n];

        // ahora con un for vamos rellenándolo
        for (int i = 0; i < cadenas.length; i++) { // también la condición podría ser i < n
            // en el elemento con índice i de cadenas guardamos lo que entre por teclado
            // no es necesario crear una variable aparte
            cadenas[i] = teclado.nextLine();
        }

        System.out.println(Arrays.toString(cadenas));
    }
}
