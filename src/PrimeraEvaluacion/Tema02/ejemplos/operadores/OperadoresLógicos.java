package PrimeraEvaluacion.Tema02.ejemplos.operadores;

/**
 * @see 'https://drive.google.com/file/d/1s_CGmUs3c-rO7o681OArhINztA_VZnze/view
 *
 */

public class OperadoresLógicos {
    public static void main(String[] args) {
        // LOS OPERADORES LÓGICOS TRABAJAN CON Y DAN COMO RESULTADO VARIABLES boolean
        // El operador not (!) invierte el valor de la variable a la que afecta
        System.out.println("**** not ****");
        boolean variable = true;
        System.out.println(variable); // true
        variable = !variable;
        System.out.println(variable); // false

        System.out.println("\n\n**** and ****");
        // los operados binarios and, or y not
        boolean v1 = true;
        boolean v2 = true;
        boolean resultadoAnd = v1 && v2;
        System.out.println(resultadoAnd); // true
        v2 = false;
        resultadoAnd = v1 && v2;
        System.out.println(resultadoAnd); // false
        v1 = false;
        v2 = true;
        resultadoAnd = v1 && v2;
        System.out.println(resultadoAnd); // false
        v1 = false;
        v2 = false;
        resultadoAnd = v1 && v2;
        System.out.println(resultadoAnd); // false


    }
}
