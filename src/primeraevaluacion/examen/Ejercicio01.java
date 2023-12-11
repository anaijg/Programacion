package primeraevaluacion.examen;

import java.util.Scanner;

/**
 * @author TuNombre
Escribe un programa que pida el número de alumnos de una clase y el número de sillas disponibles en el aula. El programa debe calcular y mostrar cuántos alumnos se quedarán de pie y cuántas sillas quedarán vacías.
 */


public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Número de alumnos: ");
        int alumnos = teclado.nextInt();
        while (alumnos < 1) {
            System.out.println("No puede haber " + alumnos + " alumnos. Introduce un número positivo.");
            alumnos = teclado.nextInt();
        }

        System.out.print("Número de sillas: ");
        int sillas = teclado.nextInt();
        while (sillas < 1) {
            System.out.println("No puede haber " + sillas + " sillas. Introduce un número positivo.");
            sillas = teclado.nextInt();
        }

        int diferencia = alumnos - sillas;

        if (diferencia == 0) {
            System.out.println("No quedan sillas vacías. Todos los alumnos se sientan.");
        } else if (diferencia < 0){
            System.out.println("Quedan libres " + (sillas - alumnos) + " sillas. Todos los alumnos se sientan.");
        } else {
            // diferencia > 0
            System.out.println("No hay sillas para todos. Quedan " + (alumnos - sillas) + " alumnos de pie.");
        }
    }
}
