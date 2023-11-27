package primeraevaluacion.tema03.ejemplos;

import java.util.Scanner;

/*
        if (expresión0) {
         instrucciones que hacen algo si expresión0 es true
        } else if (expresión1) {
         instrucciones que hacen algo diferente si expresión0 es false y expresión1 es true
         ...
        } else {
        /* instrucciones que hacen algo diferente cuando no se ha cumplido
        ninguna de las condiciones anteriores
                }
 */
public class EjemplosIfElseIfElse {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Edad?");
        int edad = teclado.nextInt();
        if (edad < 16) { // la edad mínima para trabajar es 16
            System.out.println("A estudiar");
        } else if (edad >= 16 && edad < 65) { // entre 16 y 64 años (inclusive) estás estudiando o trabajando
            System.out.println("Estudias o trabajas");
        } else { // en los demás casos (es decir, si tienes 65 o más años)
            System.out.println("Jubilación");
        }
    }
}
