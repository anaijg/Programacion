package PrimeraEvaluacion.Tema03.ejemplos;

public class EjemplosFor {
    public static void main(String[] args) {
        // Ejemplo: hacer un programa que imprima 5 veces hola
       /* for (int i = 0; // aquí inicializamos la variable del bucle "desde ...."
             i < 5; // condición: mientras sea true el resultado de la condición, seguiremos en el bucle
             i++) { // modificación: aquí ponemos algo que modifique en cada iteración el valor de i, para que alguna vez sea false la condición y podamos salir del bucle
            System.out.println("Hola");
        } */
        System.out.println("Cuando finaliza el programa sigue por aquí");

        for (int i = 0; i < 10; i++) {
            System.out.print(i + " "); // imprime 10 números: de 0 a 9
        }

        System.out.println();
        for (int i = 1; i <= 10 ; i++) {
            System.out.print(i + " "); // imprime 10 números: de 1 a 10
        }

        System.out.println();
        for (int i = 0; i <= 20; i++) {
            System.out.print(i + " "); // imprime 21 números: de 0 a 20
        }

        System.out.println();
        for (int i = 10; i > 0 ; i--) {
            System.out.print(i + " "); // imprime del 10 al 1, 10 números en total
        }

        System.out.println();
        // Los números de la inicialización, etc. pueden ser variables
        int inicio = 0;
        int fin = 10;
        for (int i = inicio; i < fin; i++) {
            System.out.print(i + " "); // imprime 10 números: de 0 a 9
        }
        System.out.println("\n\n");
        // una de las aplicaciones de los bucles for es el ir acumulando, sumando, valores que se van generando en cada iteración
        // Ejemplo: queremos sumar todos los números que van del 1 al 10 (ambos inclusive=. O sea, tengo que sumar 1 + 2 + 3 + ... + 10
        // el 1, el 2, el 3... son los valores de i en cada iteración
        // sólo necesito añadir una variable que los vaya acumulando
        int suma = 0;
        for (int i = 1; i < 11; i++) {
            suma = suma + i; // suma lo que tengo en "suma" hasta ese momento y le añade lo que vale i en esa iteración
            System.out.println("sumamos " + i + ": " + suma);
        }
    }
}
