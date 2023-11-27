package primeraevaluacion.Tema04.ejemplos;

import java.util.Arrays;

public class Foreach {
    public static void main(String[] args) {
        // for-each es una manera de recorrer arrays alternativa al for "normal"
        /*
        for (tipoArray valor : nombreArray) {
           //instrucciones sobre el array
        }
         */

        // ejemplo: vamos a crear un array y a rellenarlo aleatoriamente con for-each
        int[] nombreArray = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024};


        // valor es una variable temporal que designa a cada uno de los elementos del array; podríamos poner cualquier otro nombre en su lugar: elemento, e, etc.
        for (int valor: nombreArray) {
            //System.out.println(valor * 2); // imprimimos cada elemento muultiplicado por dos
            // sería equivalente a escribir, en vez de valor, nombreArray[i] en un for normal
        }

        // hacemos otro ejemplo; contar el número de 'a' que hay en un array de caracteres
        String cadena = "valor es una variable temporal que designa a cada uno de los elementos del array; podríamos poner cualquier otro nombre en su lugar: elemento, e, etc.";
        // truco: si quiero meter en un array de caracteres todas las letras de un String, me sirve el método toCharArray()
        char[] letras = cadena.toCharArray();
        System.out.println("Cadena tiene " + letras.length + " caracteres: " + Arrays.toString(letras));
        // quiero hacer un array que guarde el número de 'a', el número de 'e', el número de 'i', etc.
        // creo un array con 5 elementos de tipo int
        int[] contadores = new int[5];
        // contadores[0] guardará el número de 'a'
        // contadores[1] guardará el número de 'e'... y así sucesivamente

        // quiero recorrer el array de letras y guarde los contadores
        for (char valor: letras) {
            if (valor == 'a') { // aquí lo hacemos con if... else if... else pero también iría  bien un switch
                contadores[0] = contadores[0] + 1; // lo que tenía en contadores[0] se incrementa en una unidad
            } else if (valor == 'e') {
                contadores[1]++;
            } else if (valor == 'i') {
                contadores[2]++;
            } else if (valor == 'o') {
                contadores[3]++;
            } else if (valor == 'u') {
                contadores[4]++;
            }
        }

        // imprimo el array de contadores
        System.out.println("Número de \'a\': " + contadores[0]);
        System.out.println("Número de \'e\': " + contadores[1]);
        System.out.println("Número de \'i\': " + contadores[2]);
        System.out.println("Número de \'o\': " + contadores[3]);
        System.out.println("Número de \'u\': " + contadores[4]);


    }
}
