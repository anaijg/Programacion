package PrimeraEvaluacion.Tema04.ejemplos;

import java.util.Arrays;

public class EjemploSplit {
    public static void main(String[] args) {
        // esto es un string que está pidiendo a gritos trabajar con los //números por separado
        String cadena = "1 2 3 4 5 6 7 8 9 10";

        // con el método split() creo un array de Strings, indicándole cómo separar los elementos, en este caso con un “ “
        String[] array = cadena.split(" ");
        System.out.println(Arrays.toString(array));

        // Ahora tengo un array de String, pero si queremos hacer operaciones
        // numéricas (sumar, etc.) tengo que convertir cada elemento a un
        // número. Lo hacemos así:
        // 1) creo un array para guardar los números como int
        int[] numeros = new int[array.length];

        // 2) lo relleno con los elementos del array de String convertidos uno
        // a uno a int mediante Integer.parseInt(cadena)
        // INCISO PARA EXPLICAR Integer.parseInt(String)
        String uno = "1";
        String dos = "2";
        System.out.println(uno + dos);
        // si yo realmente quiero sumarlos tengo que convertirlos a int; pasarlos de String a int
        // eso lo hace el método Integer.parseInt(StringQuePareceUnNumero)
        int n1 = Integer.parseInt(uno); // también funcionaría int n1 = Integer.parseInt("1");
        int n2 = Integer.parseInt(dos);
        System.out.println(n1 + n2);
        // La operación contraria sería tener un número (int) y querer pasarlo a String. Eso se hace con String.valueOf(int)

        // volvemos a nuestro array de String lleno de "números" que todavía no son números
        // tenemos ya creado el array números, ahora lo rellenamos convirtiendo cada elemento de array
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(array[i]); // esto coge cada elemento de array, lo convierte en int y lo guarda en números
        }
        System.out.println(Arrays.toString(numeros));

        System.out.println(array[0] + array[1] + array[2]);
        System.out.println(numeros[0] + numeros[1] + numeros[2]);


    }
}
