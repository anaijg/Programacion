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
            //System.out.println(Arrays.toString(elementosDeLaLínea));
            // tengo que meter esos "números" en un array de números verdaderos
            int[] numeros = new int[elementosDeLaLínea.length];
            for (int i = 0; i < numeros.length; i++) {
                numeros[i] = Integer.parseInt(elementosDeLaLínea[i]); // cuando termine en el array tendríamos [1, 3, 6]
            }
            // ahora es cuando tengo que mirar si están en orden estrictamente crecientes
            // truco: basta con que haya un par "desordenado" para contestar "NO"
            boolean salimosDeLaCrisis = true;
            for (int i = 0; i < numeros.length - 1; i++) { // el -1 es para no "salirme" del array cuando llegue a la penúltima posición con i (i + 1 entonces será la última posición)
                if (numeros[i] >= numeros[i + 1]) {
                    salimosDeLaCrisis = false; // con una vez que entre en este if, no salimos de la crisis
                    break;
                }
            } // si nunca entro en el if, entonces es que salimosDeLaCrisis (porque sigue en true)

            // imprimimos el resultado
            if (salimosDeLaCrisis) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }


            // antes de salir introduzco n para el siguiente caso (0 si quiero salir)
            n = teclado.nextInt();
            teclado.nextLine();
        }
        teclado.close();
    }
}
