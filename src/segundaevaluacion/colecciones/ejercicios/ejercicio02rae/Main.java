package segundaevaluacion.colecciones.ejercicios.ejercicio02rae;

import java.util.HashMap;
import java.util.Map;

/*
mplementar un programa donde se crean cinco objetos Académico, que se insertan en un mapa en el que la clave es la letra del sillón que ocupan, y el valor un objeto de la clase Académico.
 */
public class Main {
    public static void main(String[] args) {
        // crear cinco académicos y meterlos en un mapa

        Academico academico1 = crearAcademico("A. Perez-Reverte", 2003);
        Academico academico2 = crearAcademico("Alvaro Pombo", 2004);
        Academico academico3 = crearAcademico("José Manuel Blecua", 2006);
        Academico academico4 = crearAcademico("Pedro R. García Barreno", 2006);
        Academico academico5 = crearAcademico("José Mª Merino", 2009);

        HashMap<Character, Academico> academia = new HashMap<>();
        // me piden que inserte los académicos con un métod0
        // creo una  variable de tipo boolean para ver si se ha podido insertar o no

        nuevoAcadémico(academia, academico1, 'T');
        nuevoAcadémico(academia,academico2, 't');
        nuevoAcadémico(academia, academico3, 'A');
        nuevoAcadémico(academia, academico4, 'E');
        nuevoAcadémico(academia, academico5, 'i');

        //System.out.println(academia);
        //imprimirAcadémico(academico2);
        imprimirAcademia(academia);
    }

    // vamos a hacer un método que me imprima los académicos con sus datos: letra, nombre y año
    public static void imprimirAcadémico(Academico a) {
        System.out.println("Año\t\t\tNombre");
        System.out.println(a.getAñoIngreso()+"\t"+a.getNombre());
    }

    // imprimir toda la academia, con este formato: letra - año - nombre
    public static void imprimirAcademia(HashMap<Character, Academico> mapa) {
        System.out.println("Letra\t\tAño\t\t\tNombre");
        System.out.println("======================================");
        // recorremos el mapa
        for (Map.Entry<Character,Academico> entrada: mapa.entrySet()) {
            System.out.println(entrada.getKey() + "\t\t" + entrada.getValue().getAñoIngreso() + "\t\t" + entrada.getValue().getNombre());
        }
    }

    public static boolean nuevoAcadémico(Map<Character, Academico> academia, Academico nuevo, Character letra) {
        // tenemos que insertar el académico en el mapa comprobando antes si la letra lo es
        if (Character.isLetter(letra)) {
            // inserto el académico y devuelvo true
            academia.put(letra, nuevo);
            return true;
        } else {
            return false;
        }
    }

    // vamos a crear los académicos con un método
    public static Academico crearAcademico(String nombre, int año) {
        Academico academico = new Academico(nombre, año);
        return academico;
    }
}
