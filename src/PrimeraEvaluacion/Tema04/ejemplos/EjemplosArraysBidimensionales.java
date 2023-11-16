package PrimeraEvaluacion.Tema04.ejemplos;

import java.util.Arrays;
import java.util.Random;

public class EjemplosArraysBidimensionales {
    public static void main(String[] args) {
        // Un array bidimensional es un array formado por cierto número de arrays, que necesitan tener el mismo tamaño
        // se utilizan muchas veces para representar formas bidimensionales, como un tablero, un plano, matriz, etc..

        // un array bidimensional se declara poniendo DOS corchetes en lugar de uno
        // el primer corchete es el número de fila (= nº de arrays que tiene el array bidimensional)) -> normalmente es la variable i
        // el segundo corchete se relaciona con el número de columna (el elemento del índice del array i)

        // el siguiente array bidimensional está formado por tres arrays unidimensionales, cada uno con 4 elementos (pero no tendría por qué ser así, aunque sí es muy frecuente)
        int[][] tabla = {
                {1, 2, 3, 1}, // primer array de enteros -> tabla[0]
                {3, 4, 1, 2}, // segundo array de enteros -> tabla[1]
                {4, 4, 1, 0}  // tercer array de enteros  -> tabla[2]
        };

        // si en un array bidimensional quiero referirme a una fila completa (es decir, a uno de los arrays que lo componen, lo indico mediante un solo índice)
        System.out.println(Arrays.toString(tabla[0]));
        System.out.println(Arrays.toString(tabla[1]));
        System.out.println(Arrays.toString(tabla[2]));

        // si en vez de referirme a una fila completa quiero referirme a un elemento del array bidimensional, lo indico así: tabla[i][j] siendo i la fila (de 0 a (filas-1)) y j la columna (de 0 a tabla[i].length - 1)
        System.out.println(tabla[1][2]);
        System.out.println("\nExtremos:");
        // si quiero sacar el elemento que está´en el extremo superior izquierdo:
        System.out.println(tabla[0][0]);
        // elemento en el extremo inferior izquierdo
        System.out.println(tabla[tabla.length - 1][0]); // porque la longitud de un array bidimensional es su número de filas, esto es, el número de arrays unidimensionales que lo componen
        // elemento que está en el extremo superior derecho
        System.out.println(tabla[0][tabla[0].length - 1]);
        // elemento que está en el extremo inferior derecho (última fila, última columna)
        System.out.println(tabla[tabla.length - 1][tabla[tabla.length - 1].length - 1]);


        // lo normal es que recorramos los arrays bidimensionales, tanto para leerlos como para rellenarlos o modificarlos -->>> for anidado

        // Ejemplo
        // Declaramos un array de caracteres de tamaño 6x4
        char[][] caracteres = new char[6][4];

        // lo vamos a rellenar con caracteres elegidos aleatoriamente de la tabla ascii
        Random generador = new Random();
        for (int i = 0; i < caracteres.length; i++) {
            for (int j = 0; j < caracteres[i].length; j++) {
                caracteres[i][j] = (char) generador.nextInt(64, 95); // (char) lo que hace es un casting explícito, es decir, convierte el número entero generado en un char
            }
        }

        // ahora lo imprimimos
        for (int i = 0; i < caracteres.length; i++) {
            for (int j = 0; j < caracteres[i].length; j++) { // este for me imprime todos los elementos desde 0 hasta el final de la línea í en la que estamos
                System.out.print(caracteres[i][j] + "\t");
            }
            System.out.println(); // cada vez que imprimimos una línea completa, hacemos un salto antes de entrar en la siguiente
        }

        // quiero el tercer elemento de la cuarta fila
        System.out.println(caracteres[3][2]);
    }
}
