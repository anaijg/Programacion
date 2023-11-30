package primeraevaluacion.tema03.masEjercicios;

import java.util.Scanner;

/*
Realiza un programa que lea un número y a continuación escriba el carácter “*” tantas veces igual al valor numérico leído. En aquellos casos en que el valor leído no sea positivo se deberá escribir un único asterisco.
 */
public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();
        // si es negativo, sólo un *
        if (numero < 0){
            System.out.println("*");
        } else { // 0 o positivo
            for (int i = 0; i < numero; i++) {
                System.out.print("*"); // OJO: sin ln para que no salte de línea en cada vuelta
            }
        }
    }
}
