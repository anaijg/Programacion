package primeraevaluacion.tema03.ejemplos;

public class EjemploForAnidado {
    public static void main(String[] args) {
        // un for dentro de otro for sirve para trabajar con tablas, tableros, arrays bidimensionales, etc.
        // es decir, cualquier estructura que se organice en filas y columnas

        for (int i = 0; i < 5; i++) { // en el bucle de fuera llevamos las "filas" -> i
        //  esto empezaría: para i=0, 0 < 5 es true, entonces entra y se encuentra el for interno y comienza poniendo j=0
            // idea: para cada valor de i, hace una pasada completa al bucle interno
            // de otra manera: para cada valor de i, recorre todas las j
            for (int j = 0; j < 5; j++) { // en el bucle de dentro llevamos las "columnas" -> j
                System.out.print("i" + i + "-j" + j + " ");
            }
            // cada vez que finaliza una pasada completa del bucle interno, hace un salto de línea antes de seguir incrementando i en el bucle externo
            System.out.println();
        }
        System.out.println("\n\n");
        // Otro ejemplo: bucle for anidado que imprima la tabla de multiplicar
        // 1 2 3 ... 10
        // 2 4 6 ....20
        // 3 6 9 ....30
        // ...
        // 10 20 ... 100
        for (int i = 1; i < 11; i++) {
            for (int j = 1; j < 11; j++) {
                System.out.print((i * j) + "\t");
            }
            System.out.println();
        }

    }
}
