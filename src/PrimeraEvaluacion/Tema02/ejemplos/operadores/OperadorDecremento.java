package PrimeraEvaluacion.Tema02.ejemplos.operadores;

public class OperadorDecremento {
    public static void main(String[] args) {
        // OPERADOR DE DECREMENTO
        // Sirve para QUITAR una unidad a una variable de tipo entero
        int variable = 0;
        System.out.println(variable + " antes de incrementarla");
        variable--; // DEcremento la variable en una unidad
        System.out.println(variable + " después de DEcrementarla");
        variable--; // DEcremento la variable en una unidad
        System.out.println(variable + " después de DEcrementarla");
        // y así sucesivamente
        // es lo mismo que hacer variable = variable - 1
        variable = variable - 1;
        System.out.println(variable + " después de restarle 1");
        // también se puede poner así: variable -= 1
        variable -= 1;
        System.out.println(variable + " después de poner -= 1");
    }
}
