package PrimeraEvaluacion.Tema03.ejemplos;

import java.util.Scanner;

public class EjemplosIf {
    public static void main(String[] args) {
        /*
        La forma más simple de la instrucción condicional consiste en la palabra clave if, una
expresión booleana y un cuerpo entre llaves.
if (expresión) {
// cuerpo: instrucciones que se ejecutan si expresión es true
}
         */

        // Pido una edad y, si es mayor de edad, puede ver la película; en caso contrario, no decimos nada
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Edad?");
        int edad = teclado.nextInt();
        if (edad >= 18) { // aquí entra sólo si el resultado de la expresión es true
            System.out.println("Pasa, puedes ver la peli.");
        }
        ///... si es menor de edad (si es false, no se ejecuta la línea 20 y saltaría a esta línea
        System.out.println("Esto se imprime siempre, tanto si es true como si es false.");

        // En vez de una expresión, puedo poner una variable boolean directamente
        // Entonces, el ejemplo anterior podría quedar así:
        boolean  mayorDeEdad = edad >= 18;
        if (mayorDeEdad) { // es lo mismo que poner mayorDeEdad == true
            System.out.println("Sólo poniendo la variable mayorDeEdad, si es true se va a imprimir esto");
        }

        if (!mayorDeEdad) { // es lo mismo que poner mayorDeEdad == false
            System.out.println("No eres mayor de edad.");
        }
    }
}
