package ejercicios.ficheros.detexto.ejercicio4;

import java.io.File;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        // Crear un programa que borre el fichero cuya ruta ha sido introducida por el usuario.
        // 1) Creo un teclado para meter la ruta
        Scanner teclado = new Scanner(System.in);

        // 2) Pido la ruta del fichero
        System.out.println("Ruta: ");
        // creo un fichero en esta ruta: TerceraEvaluacion\src\main\java\ejercicios\ficheros\detexto\ejercicio4\FicheroParaBorrar.txt
        String ruta = teclado.nextLine();

        // 3) Creo un objeto File con esa ruta
        File fichero = new File(ruta);
        if (fichero.exists()) {
            boolean borrado = fichero.delete();
            if (borrado) {
                System.out.println("Fichero borrado.");
            } else {
                System.out.println("No se ha podido borrar el fichero.");
            }
        } else {
            System.out.println("No se ha podido borrar el fichero.");
        }

            // mejor si lo sacas a métodos...

        teclado.close();

    }
}
