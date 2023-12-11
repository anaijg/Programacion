package primeraevaluacion.examen;

import java.util.Scanner;

public class Ejercicio03OtraForma {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String numero = teclado.nextLine();

        int digitos = numero.length();

        String[] array = new String[digitos];
        for (int i = 0; i < array.length; i++) {
            array[i] = numero.substring(i, i + 1);
        }


        int suma = 0;
        String mostrarSuma = "";
        for (int i = 0; i < array.length; i++) {
            suma += Integer.parseInt(array[i]);
            if (i < array.length) {
                mostrarSuma += array[i] + " + ";
            } else {
                mostrarSuma += array[i];
            }
        }

        System.out.println(mostrarSuma + " = " + suma);


    }
}
