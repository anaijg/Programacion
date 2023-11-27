package primeraevaluacion.Tema02.ejemplos.variables;

public class Ejemplo02 {
    public static void main(String[] args) {
        // TIPOS DE VARIABLES
        // Numéricas
        // Si son números enteros tenemos:
        // int --> para guardar variables enteras
        int edadDelCliente = 25;
        System.out.println("Hoy es el cumpleaños. Entonces la nueva edad es " + edadDelCliente);
        edadDelCliente = edadDelCliente + 1; //
        System.out.println(edadDelCliente + " es la edad del cliente");
        // long --> ocupa 64 bits, para números que no caben en una variable de tipo int
        long dineroDeElonMusk = 10000000000000000L; // hay que poner una l al final
        // Si los números tienen decimales, el tipo a utilizar es double
        double peso = 72.5;
        System.out.println("El peso es " + peso);

    }
}
