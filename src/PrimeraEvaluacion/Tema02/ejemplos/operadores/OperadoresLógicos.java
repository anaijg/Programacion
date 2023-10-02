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

        System.out.println("\n\n**** and y or ****");
        // los operados binarios and, or y not
        boolean v1 = true;
        boolean v2 = true;

        boolean resultadoAnd = v1 && v2;
        boolean resultadoOr = v1 || v2;
        System.out.println("true\ttrue"); // \t mete una tabulación en el String o cadena de caracteres
        System.out.println("AND: " + resultadoAnd); // true
        System.out.println("OR: " +resultadoOr); // true

        v2 = false;
        System.out.println("\ntrue\tfalse");
        resultadoAnd = v1 && v2;
        resultadoOr = v1 || v2;
        System.out.println(resultadoAnd); // false
        System.out.println(resultadoOr); // true

        v1 = false;
        v2 = true;
        System.out.println("\nfalse\ttrue");
        resultadoAnd = v1 && v2;
        resultadoOr = v1 || v2;
        System.out.println(resultadoAnd); // false
        System.out.println(resultadoOr);

        v1 = false;
        v2 = false;
        System.out.println("\nfalse\tfalse");
        resultadoAnd = v1 && v2;
        resultadoOr = v1 || v2;
        System.out.println(resultadoAnd); // false
        System.out.println(resultadoOr);


    }
}
