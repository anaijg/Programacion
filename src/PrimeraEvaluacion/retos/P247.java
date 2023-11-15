package PrimeraEvaluacion.retos;

import java.util.Arrays;
import java.util.Scanner;

public class P247 {
    public static void main(String[] args) {
        // ENTRADA
        Scanner teclado = new Scanner(System.in);

        // las lineas entran por pares:
        // la primera línea indica los números que va a tener la siguiente
        int n = teclado.nextInt(); // ej: 3
        teclado.nextLine();
        // pero si ese número introducido es 0, el programa termina
        while (n != 0) {
            // si el número introducido no es 0, entramos aquí y leemos la línea siguiente:
            // la segunda línea contiene la secuencia de números
            String linea = teclado.nextLine(); // "1 3 6"
            // de esa línea extraemos los números a un array
            String[] elementosDeLaLínea = linea.split(" "); //["1", "3", "6"]
            System.out.println(Arrays.toString(elementosDeLaLínea));
            // tengo que meter esos "números" en un array de números verdaderos


            // antes de salir introduzco n para el siguiente caso (0 si quiero salir)
            n = teclado.nextInt();
            teclado.nextLine();
        }


        teclado.close();
    }
}
