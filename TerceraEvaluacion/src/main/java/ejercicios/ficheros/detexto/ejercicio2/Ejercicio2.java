package ejercicios.ficheros.detexto.ejercicio2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        // 1) Leer el fichero Restaurantes.csv
        String ruta = "TerceraEvaluacion/src/main/java/ejercicios/ficheros/detexto/ejercicio2/Restaurantes.csv";
        File fichero = new File(ruta);
        // vamos a ver si existe el fichero (por si las moscas...)
        if (fichero.exists()) {
            System.out.println("Comenzando la lectura......\n\n");
        } else {
            System.out.println("Tengo mal la ruta.");
        }

        // 2) Ahora creo un lector con Scanner
        Scanner lector = null;
        try {
            lector = new Scanner(fichero);
            // recorrer el fichero
            while (lector.hasNext()) {
                String linea = lector.nextLine(); // lo que hace aquí nextLine es avanzar una línea; vale por un i++
                // para ver si funciona imprimo línea a línea el fichero
                //System.out.println(linea);

                // muestre los datos de todos aquellos restaurantes cuyo código postal empiece por 6.
                String[] campos = linea.split(",");
                // ahora tengo que sacar el código postal, que en el array campos tiene el índice 4
                //String nombre = campos[0];
                //String direccion = campos[1];
                // ...
                String cp = campos[4];
                //System.out.println(cp);

                // pero sólo quiero imprimir los que comiencen por 6
                if (cp.startsWith("6")) {
                    System.out.println(campos[0] + "\t\t\t\t\t\t"+ campos[1] + 	"\t\t\t\t\t\t\t\t" + campos[2] + "\t\t\t" + campos[3] + "\t" + campos[4]);
                }
            }







        } catch (FileNotFoundException e) {
            System.out.println("No se puede crear el objeto lector (por lo que sea).");
        } finally {
            lector.close();
            System.out.println("FIN");
        }

    }
}
