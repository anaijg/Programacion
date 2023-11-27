package primeraevaluacion.tema03.ejemplos;

import java.util.Scanner;

public class EjemplosWhile {
    public static void main(String[] args) {
        // el bucle while empieza evaluando una condición
        // si el resultado es true, entra en el bloque {} y ejecuta el código que contenga
        // al finalizar, vuelve arriba, a comprobar de nuevo la condición
        // así, sucesivamente, hasta que la condición da como resultado false
        int i = 0;
        while (i < 11) {
            System.out.println(i);
            // para que esto pare en algún momento, tenemos que hacer que cambie la condición
            i++;
        }

        // Otro ejemplo
        // Imprimir todos los múltiplos de 5 hasta un número introducido por teclado
        // Ejercicio 28 pero en vez de for con while
        // NOTA: un buen entrenamiento puede ser hacer los ejercios de for con while
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        // reutilizo la i que tenía ya declarada para recoger el número por teclado
        // tenemos que inicializar la i
        i = 1;
        while (i <= n) {
            // si i es múltiplo de 5 (al dividirlo por 5, el resto da 0, lo  imprimo
            if (i % 5 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }

    }
}
