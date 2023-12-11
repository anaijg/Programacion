package primeraevaluacion.examen;

import java.util.Scanner;

/**
 * @author TuNombre
 */
public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double peso = teclado.nextDouble();
        double altura = teclado.nextDouble();

        double imc = peso / Math.pow(altura, 2);

        if (imc < 18.5) {
            System.out.println("Bajo peso");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Normopeso");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Sobrepeso");
        } else if (imc >= 30 && imc < 40) {
            System.out.println("Obesidad");
        } else if (imc >= 40 && imc < 50) {
            System.out.println("Obesidad mórbida.");
        } else {
            System.out.println("Obesidad extrema.");
        }
    }
}
