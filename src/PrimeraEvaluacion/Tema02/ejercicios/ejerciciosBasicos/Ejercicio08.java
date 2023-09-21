package PrimeraEvaluacion.Tema02.ejercicios.ejerciciosBasicos;

import java.util.Scanner;

/*
Imagina que eres un gerente de recursos humanos en un restaurante y necesitas contratar a un chef.
Para hacer eso, necesitas recopilar algunos datos preliminares sobre los candidatos, concretamente 4 campos:
nombre,
edad,
años de experiencia,
preferencia de cocina.
Escribe un programa que lea todas las palabras (o números) una a una e imprima lo siguiente:
"El formulario de <NOMBRE>, de <EDAD> años y <AÑOS DE EXPERIENCIA> de experiencia, está completo. Nos comunicaremos con usted si necesitamos a alguien que cocine comida <PREFERENCIA DE COCINA>".
Entrada:
Eugenio
33
8
vegetariana
Salida:
El formulario de Eugenio, de 33 años y 8 de experiencia, está completo. Nos nos comunicaremos con usted si necesitamos alguien que cocine comida

 */
public class Ejercicio08 {
    public static void main(String[] args) {
        // Tenemos que pedir los datos al usuario
        Scanner teclado = new Scanner(System.in);
        System.out.println("Nombre: ");
        String nombre = teclado.nextLine(); // cuando lo que meto por teclado es un String, el método es nextLine();
        System.out.println("Edad: ");
        int edad = teclado.nextInt(); // cuando lo que meto por teclado es un int, el método es  nextInt();
        // OJO: EL MÉTODO nextInt() además del dato, guarda un salto de línea, así que si pedimos algo por teclado a continuación, puede fallar. ENTONCES, SIEMPRE QUE UTILICEMOS nextInt() VAMOS A AÑADIR A CONTINUACIÓN ESTA LÍNEA:
        teclado.nextLine(); // Con esto no tendremos problema si después de nextInt() seguimos pidiendo los datos que sean
        System.out.println("Años de experiencia: ");
        int añosExperiencia = teclado.nextInt(); teclado.nextLine();
        System.out.println("Preferencia de cocina: ");
        String preferenciaCocina = teclado.nextLine();
        System.out.println("El formulario de " + nombre +", de " + edad + " años y " + añosExperiencia + " de experiencia, está completo.\nNos comunicaremos con usted si necesitamos alguien que cocine comida.");

    }
}
