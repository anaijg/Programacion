package primeraevaluacion.tema04.ejercicios.arrays.bidimensionales;
/*
@author Alejandro
 */
import java.util.Random;
import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Día: ");
        int dia = teclado.nextInt();
        System.out.println("Mes: ");
        int mes = teclado.nextInt();
        while ((mes < 1 || mes > 12) && (dia < 1 || dia > 30) || mes == 2 && (dia < 1 || dia > 28)) {
            System.out.println("Fecha incorrecta. Por favor, vuelve a introducir la fecha.");
            System.out.println("Día: ");
            dia = teclado.nextInt();
            System.out.println("Mes: ");
            mes = teclado.nextInt();
        }
        System.out.println("La fecha es correcta");
        if (mes == 1) {
            String mesLetra = "Enero";
            System.out.println("Asientos disponibles para el dia " + dia + " de " + mesLetra + "\n=======================================================");
        } else if (mes == 2) {
            String mesLetra = "Febrero";
            System.out.println("Asientos disponibles para el dia " + dia + " de " + mesLetra + "\n=======================================================");
        } else if (mes == 3) {
            String mesLetra = "Marzo";
            System.out.println("Asientos disponibles para el dia " + dia + " de " + mesLetra + "\n=======================================================");
        } else if (mes == 4) {
            String mesLetra = "Abril";
            System.out.println("Asientos disponibles para el dia " + dia + " de " + mesLetra + "\n=======================================================");
        } else if (mes == 5) {
            String mesLetra = "Mayo";
            System.out.println("Asientos disponibles para el dia " + dia + " de " + mesLetra + "\n=======================================================");
        } else if (mes == 6) {
            String mesLetra = "Junio";
            System.out.println("Asientos disponibles para el dia " + dia + " de " + mesLetra + "\n=======================================================");
        } else if (mes == 7) {
            String mesLetra = "Julio";
            System.out.println("Asientos disponibles para el dia " + dia + " de " + mesLetra + "\n=======================================================");
        } else if (mes == 8) {
            String mesLetra = "Agosto";
            System.out.println("Asientos disponibles para el dia " + dia + " de " + mesLetra + "\n=======================================================");
        } else if (mes == 9) {
            String mesLetra = "Septiembre";
            System.out.println("Asientos disponibles para el dia " + dia + " de " + mesLetra + "\n=======================================================");
        } else if (mes == 10) {
            String mesLetra = "Octubre";
            System.out.println("Asientos disponibles para el dia " + dia + " de " + mesLetra + "\n=======================================================");
        } else if (mes == 11) {
            String mesLetra = "Noviembre";
            System.out.println("Asientos disponibles para el dia " + dia + " de " + mesLetra + "\n=======================================================");
        } else if (mes == 12) {
            String mesLetra = "Diciembre";
            System.out.println("Asientos disponibles para el dia " + dia + " de " + mesLetra + "\n=======================================================");
        }
        System.out.println("L=Libre;  X=Ocupado");

        char[][] cine = new char[4][4];
        Random generador = new Random();
        for (int i = 0; i < cine.length; i++) {
            System.out.print("Fila " + i + ":\t");
            for (int j = 0; j < cine[i].length; j++) {
                System.out.print(j + ":");
                int letra = generador.nextInt(2);
                cine[i][j] = (letra == 0) ? 'L' : 'X';
                System.out.print(cine[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Elige fila: ");
        int fila = teclado.nextInt();
        System.out.println("Elige asiento: ");
        int asiento = teclado.nextInt();

        while (cine[fila][asiento]=='X'){
            System.out.println("Ese asiento ya esta ocupado, por favor elige otro");
            System.out.println("Elige fila: ");
            fila = teclado.nextInt();
            System.out.println("Elige asiento: ");
            asiento = teclado.nextInt();
        }

        if (cine[fila][asiento]=='L'){
            System.out.println("Se te ha asignado el asiento " + asiento + " en la fila " + fila);
            cine[fila][asiento]='X';
            for (int i = 0; i <cine.length ; i++) {
                System.out.print("Fila " + i + ":\t");
                for (int j = 0; j <cine[i].length ; j++) {
                    System.out.print(j + ":");
                    System.out.print(cine[i][j] + " ");
                }
                System.out.println();
            }

        }
    }
}
