package primeraevaluacion.Tema02.ejercicios.ejerciciosBasicos2;

public class Ejercicio01 {
    public static void main(String[] args) {
        //    int mi variable -> NO puede contener un espacio
        int num_de_cte; // se admite (compilaría) pero no molaría (no cumple las convenciones de nomenclatura en Java; lo correcto sería: numDeCte
        int ____programa; // compilaría, pero los _ "despistan"
        int $alguna; // lo mismo; compila pero ¿para qué el $? Esto es herencia de C
        //int 3tema; --> NO PUEDE EMPEZAR POR UN NÚMERO
        //    cierto? --> NO vale porque tiene un carácter especial distinto a $ o _
        int númerodeCliente; // compila, pero por convención la D debería ser mayúscula
        //    jose~ // --> NO vale porque tiene un carácter especial distinto a $ o _
        //    año  // ok
        //    PI --> como nombre en cualquier caso compilaría; si fuera una variable tendría que ser minúsculas pero al ser una constante, éstas se indican en mayúsculas
        System.out.println(Math.PI);
        //    int --> es una palabra clave de Java, no se puede utilizar como nombre de una variable
    }
}
