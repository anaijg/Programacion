package PrimeraEvaluacion.Tema04.ejercicios.arrays;

import java.util.Arrays;
import java.util.Random;

/*
Realizar un programa en el se se inicialice un array de longitud 20
 con números aleatorios comprendidos entre -10 y 10.
 A continuación, mostrar la media de los números positivos,la media de los negativos y contar el número de ceros.
 */
public class Ejercicio06 {
    public static void main(String[] args) {
        // primero: creo el array y lo relleno
        int[] números = new int[20];
        Random generador = new Random();
        for (int i = 0; i < números.length; i++) {
            números[i] = generador.nextInt(-10, 11);
        }
        System.out.println(Arrays.toString(números));

        // segundo: tengo que hacer dos medias: la de los números positivos y la de los números negativos. media = suma / "contador"; o sea, tengo que hacer dos sumas (la de los positivos, por un lado, y la de los negativos, por otro) y tres contadores (para los números positivos, para los números negativos y para los 0.  TODO ESTO DENTRO DEL MISMO FOR
        // para las sumas y los contadores necesito en total cinco variables:
        double sumaNegativos = 0, sumaPositivos = 0; // hago las sumas de tipo double para que no me la líe cuando haga la división (si divido int / int me hace la división entera y no me pone los decimales)
        int contadorNegativos = 0, contadorPositivos = 0, contadorCeros = 0;

        for (int elemento: números) {
            if (elemento < 0) { // si lo hiciera con un for normal en vez de elemento sería números[i]
                // sumo e incremento los negativos
                sumaNegativos = sumaNegativos + elemento; // también vale sumaNegativos += elemento
                contadorNegativos++;
            } else if (elemento > 0) {
                // sumo e incremento los positivos
                sumaPositivos += elemento;
                contadorPositivos++;
            } else { // si no es positivo ni negativo, entonces tiene que ser un 0
                // incremento el contador de ceros
                contadorCeros++;
            }
        }

        // tercero: una vez que tengo las sumas y los contadores, calculo y muestro las medias.
        //System.out.println("Media de los negativos: " + sumaNegativos + "/" + contadorNegativos + " = " + (sumaNegativos/contadorNegativos));
        System.out.printf("Media de los negativos: %.0f / %d = %.2f", sumaNegativos, contadorNegativos, (sumaNegativos/contadorNegativos));
        //System.out.println("Media de los positivos: " + sumaPositivos + "/" + contadorPositivos + " = " + (sumaPositivos/contadorPositivos));
        System.out.printf("\nMedia de los positivos: %.0f / %d = %.2f", sumaPositivos, contadorPositivos, (sumaPositivos/contadorPositivos));
        System.out.println("\nNúmero de ceros: " + contadorCeros);
    }
}
