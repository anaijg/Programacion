package segundaevaluacion.colecciones.ejercicios;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/*
Implementar una aplicación que pida por consola números enteros no negativos hasta que se introduce -1.
Los números se irán insertando en una colección, no pudiéndose repetir.
Al terminar, se mostrará la colección por pantalla.
A continuación, se mostrarán todos los valores pares.
Por último, se eliminarán todos los múltiplos de 3 y se mostrará por pantalla la colección resultante.
Utiliza métodos para las diferentes tareas.
 */
public class Ejercicio01ConIterador {
    public static void main(String[] args) {
        HashSet<Integer> coleccion = new HashSet<>(); // hashset porque me dicen que no puede tener elementos repetidos
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt(); teclado.nextLine();

        while (numero != -1) {
            // solo meto los números enteros no negativos
            if (numero >= 0) {
                coleccion.add(numero);
            }
            // antes de terminar, tengo que introducir un nuevo número porque si no no salgo del bucle
            numero = teclado.nextInt(); teclado.nextLine();
        }

        // Al terminar, se mostrará la colección por pantalla.
        System.out.println(coleccion);

        // A continuación, se mostrarán todos los valores pares.
        // Ojo: no podemos utilizar un for normal, porque HashSet no tiene el método get() para acceder por posición
        System.out.print("\n valores pares: ");
        for (Integer elemento: coleccion) {
            if (elemento % 2 == 0) {
                System.out.print(elemento + " ");
            }
        }
        System.out.println();

        // LLegamos a la parte de eliminar los múltiplos de 3, y para eso lo más sencillo es utilizar un iterador:
        Iterator<Integer> iterator = coleccion.iterator();
        while (iterator.hasNext()) {
            // si el siguiente número es múltiplo de 3, que lo elimine
            if (iterator.next() % 3 == 0) {
                iterator.remove();
            }
        }
        System.out.println("Tras eliminar los múltiplos de 3: " + coleccion);
    }
}
