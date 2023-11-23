package PrimeraEvaluacion.Tema04.ejercicios.arrays;

import java.util.Arrays;
import java.util.Scanner;

/*
Haz un programa que pida un número al usuario un número de mes (por ejemplo, el 4) y diga cuántos días tiene (por ejemplo, 30) y el nombre del mes. Debes usar arrays. Para simplificarlo vamos a suponer que febrero tiene 28 días.

 */
public class Ejercicio10 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce número del mes: ");
        int numeroMes = teclado.nextInt();
        String cadena = "enero febrero marzo abril mayo junio julio agosto septiembre octubre noviembre diciembre";
        String[] mes = cadena.split(" ");
        int largos = 31;
        int cortos = 30;



        switch (numeroMes){
            case 1:
                System.out.println(mes[0] +"\t"+ largos + " días");
                break;
            case 2:
                System.out.println(mes[1] +"\t"+ cortos + " días");
                break;
            case 3:
                System.out.println(mes[2] +"\t"+ largos + " días");
                break;
            case 4:
                System.out.println(mes[3] +"\t"+ cortos + " días");
                break;
            case 5:
                System.out.println(mes[4] +"\t"+ largos + " días");
                break;
            case 6:
                System.out.println(mes[5] +"\t"+ cortos + " días");
                break;
            case 7:
                System.out.println(mes[6] +"\t"+ largos + " días");
                break;
            case 8:
                System.out.println(mes[7] +"\t"+ largos + " días");
                break;
            case 9:
                System.out.println(mes[8] +"\t"+ cortos + " días");
                break;
            case 10:
                System.out.println(mes[9] +"\t"+ largos + " días");
                break;
            case 11:
                System.out.println(mes[10] +"\t"+ cortos + " días");
                break;
            case 12:
                System.out.println(mes[11] +"\t"+ largos + " días");
                break;
            default:
                System.out.println("No existe ese mes");

        }












    }
}
