package primeraevaluacion.tema03.ejercicios;

import java.util.Scanner;

/*
Realizar un programa que pida un número entero por teclado y visualice el dia de la semana correspondiente. 1 -> "Lunes"; 2 -> Martes...
 */
public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número entero del 1 al 7: ");
        int número= teclado.nextInt();

        // se puede hacer con if... else if... else, pero mejor con switch
        switch (número) {
            case 1: // si número == 1
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
            default: // para todos los demás casos
                System.out.println("El número introducido no coincide con ningún número de la semana.");
        }
    }
}
