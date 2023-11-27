package primeraevaluacion.Tema02.ejercicios.ejerciciosOperadores;

import java.util.Scanner;

/*
Escribe un programa que, dado un importe en euros, indique el número mínimo de billetes y monedas que se puede utilizar para obtener dicha cantidad. Por ejemplo:
Ejemplo: 232 euros son 1 billete de 200, 1 billete de 20, un billete de 10, y una moneda de  2 euros.

 */
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int euros = teclado.nextInt();
        int billete500 = euros / 500;
        System.out.println(billete500 + " billetes de 500 €");
        int resto = euros % 500;
        //System.out.println(resto);
        int billetes200 = resto / 200;
        System.out.println(billetes200 + " billetes de 200 €");
        resto = resto % 200;
        //System.out.println(resto);
        int billetes100 = resto / 100;
        System.out.println(billetes100 + " billetes de 100 €");
        resto = resto % 100;
        //System.out.println(resto);
        int billetes50 = resto / 50;
        System.out.println(billetes50 + " billetes de 50 €");
        resto = resto % 50;
        //System.out.println(resto);
        int billetes20 = resto / 20;
        System.out.println(billetes20 + " billetes de 20 €");
        resto = resto % 20;
        //System.out.println(resto);
        int billetes10 = resto / 10;
        System.out.println(billetes10 + " billetes de 10 €");
        resto = resto % 10;
        //System.out.println(resto);
        int billetes5 = resto / 5;
        System.out.println(billetes5 + " billetes de 5 €");
        resto = resto % 5;
        //System.out.println(resto);
        int monedas2 = resto / 2;
        System.out.println(monedas2 + " monedas de 2 €");
        resto = resto % 2; // esto ya son las monedas de 1 €
        System.out.println(resto + " monedas de 1 €");



    }
}
