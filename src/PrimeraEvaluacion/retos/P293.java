package PrimeraEvaluacion.retos;
/*
    1. insectos -> 6 patas
    2. arácnidos -> 8 patas
    3. crustáceos -> 10 patas
    4. Nº escolopendras
    5. nº de anillos de las escolopendras

     1 1 1 1 15
     nº de patas: 1*6 + 1*8 + 1*10 + (1*15*2) =
     hay 1 escolopendra que tiene 15 anillos
 */

import java.util.Arrays;
import java.util.Scanner;

public class P293 {
    public static void main(String[] args) {
        // ENTRADA
        Scanner teclado = new Scanner(System.in);
            // no de casos de prueba a procesar
        int casos = teclado.nextInt();
        teclado.nextLine();

        for (int i = 0; i < casos; i++) {
            // cada caso de prueba es una línea
            String linea = teclado.nextLine();
            // de esa línea tengo que extraer los números
            String[] elementosDeLaLinea = linea.split(" ");
            //System.out.println(Arrays.toString(elementosDeLaLinea));
            // ahora tengo que convertir esos elementos en números
            int[] numeros = new int[5]; // o bien elementosDeLaLinea.length
            // relleno el array de números con los elementos convertidos de String a int
            for (int j = 0; j < 5; j++) {
                numeros[j] = Integer.parseInt(elementosDeLaLinea[j]);
            }

            int resultado = (numeros[0] * 6) + (numeros[1] * 8) + (numeros[2] * 10) + (numeros[3] * numeros[4] * 2);
            System.out.println(resultado);
        }
        teclado.close();




        // SALIDA
    }
}
