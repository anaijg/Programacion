package primeraevaluacion.examenFake;

import java.util.Scanner;

/**
 * @autor Ana
 * Escribe un programa para predecir la probabilidad de lluvia para mañana a partir de varios datos atmosféricos suministrados por el usuario. Estos datos son:
 * •	La presión atmosférica: puede ser alta (A), media (M) o baja (B).
 * •	El humedad relativa: también puede ser alta (A), media (M) o baja (B).
 *
 * La probabilidad de lluvia vendrá determinada por esta tabla:
 * Presión	Humedad	Probabilidad de lluvia
 * B	A	Media
 * B	M	Alta
 * B	B	Media
 * M	M	Media
 * En cualquier otro caso	Baja
 */
public class Ejercicio02 {
    public static void main(String[] args) {
        // pedimos datos
        Scanner teclado = new Scanner(System.in);
        System.out.print("Presión atmosférica: ");
        char presión = teclado.next().charAt(0);
        System.out.print("Humedad: ");
        char humedad = teclado.next().charAt(0);

        // calculamos. La manera más directa de hacerlo, aunque no la única, es reproduciendo cada caso de la tabla
        String probabilidad = "";
        if (presión == 'B' && humedad == 'A') {
            probabilidad = "Media";
        } else if (presión == 'B' && humedad == 'M') {
            probabilidad = "Alta";
        } else if (presión == 'B' && humedad == 'B') {
            probabilidad = "Media";
        } else {
            probabilidad = "Baja";
        }

        // mostramos resultado
        System.out.print("=====================");
        System.out.print("\nProbabilidad de lluvia: " + probabilidad);
    }
}
