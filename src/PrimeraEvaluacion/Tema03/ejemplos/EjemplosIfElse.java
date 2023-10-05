package PrimeraEvaluacion.Tema03.ejemplos;

import java.util.Scanner;

/*
        if (expresión) {
        // instrucciones que se ejecutan si expresión es true
        } else {
        // instrucciones que hacen otra cosa si expresión es false
}
 */
public class EjemplosIfElse {
    public static void main(String[] args) {
        // Pido una edad y, si es mayor de edad, puede ver la película; en caso contrario, le decimos que se vaya
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Edad?");
        int edad = teclado.nextInt();
        if (edad >= 18) { // aquí entra sólo si el resultado de la expresión es true
            System.out.println("Pasa, puedes ver la peli.");
        } else { // si el resultado de la expresión es false (puede traducirse como si no...)
            System.out.println("No puedes pasar");
        }
        ///... si es menor de edad (si es false, no se ejecuta la línea 20 y saltaría a esta línea
        System.out.println("Esto se imprime siempre, tanto si es true como si es false.");
    }
}
