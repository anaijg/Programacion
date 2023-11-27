package primeraevaluacion.Tema02.ejemplos.operadores;

public class OperadorIncremento {
    public static void main(String[] args) {
        // OPERADOR DE INCREMENTO
        // Sirve para añadir una unidad a una variable de tipo entero
        int variable = 0;
        System.out.println(variable + " antes de incrementarla");
        variable++; // incremento la variable en una unidad
        System.out.println(variable + " después de incrementarla");
        variable++; // incremento la variable en una unidad
        System.out.println(variable + " después de incrementarla");
        // y así sucesivamente
        // es lo mismo que hacer variable = variable + 1
        variable = variable + 1;
        System.out.println(variable + " después de sumarle 1");
        // también se puede poner así: variable += 1
        variable += 1;
        System.out.println(variable + " después de poner += 1");


    }
}
