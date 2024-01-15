package segundaevaluacion.colecciones.ejercicios;
/*
/*
Implementar una aplicación que pida por consola números enteros no negativos hasta que se introduce -1.
Los números se irán insertando en una colección, no pudiéndose repetir.
Al terminar, se mostrará la colección por pantalla.
A continuación, se mostrarán todos los valores pares.
Por último, se eliminarán todos los múltiplos de 3 y se mostrará por pantalla la colección resultante.
Utiliza métodos para las diferentes tareas.
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
public class Ejercicio01ConFor {
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

        // UNA FORMA: Ainara
        // se eliminarán todos los múltiplos de 3
        HashSet<Integer> coleccion2 = new HashSet<>(); // para guardar los que no son múltiplos de 3
        for (Integer elemento: coleccion) {
            if (elemento % 3 != 0) { // si el elemento no es múltiplo de 3,  lo añado a colección2
                coleccion2.add(elemento);
            }
        }
        // coleccion = coleccion2; una solución en machacar la colección que teníamos con esta colección sin múltiplos de 3

        // OTRA FORMA: Carlos
        // otra solución es meter la colección en un arraylist, y ahí ya sí que puedo eliminar.
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.addAll(coleccion); // puedo meter en el arraylist toda la colección
        // ahora sí que la puedo recorrer y eliminar los elementos
        for (int i = 0; i < coleccion.size() - 1; i++) {
            System.out.println(i);
            if (arrayList.get(i) % 3 == 0) {
                arrayList.remove(i); // este remove también se puede hacer con el foreach pero haciendo otra colección
                //i--; // para que vuelva a la posición de antes
            }
        }
        System.out.println(coleccion);
    }
}
