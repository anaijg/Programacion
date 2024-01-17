package segundaevaluacion.colecciones.ejercicios.ejercicio02rae;

import java.util.HashMap;
import java.util.Map;

/*
mplementar un programa donde se crean cinco objetos Académico, que se insertan en un mapa en el que la clave es la letra del sillón que ocupan, y el valor un objeto de la clase Académico.
 */
public class Main {
    public static void main(String[] args) {
        // crear cinco académicos y meterlos en un mapa
        Academico academico1 = new Academico("A. Perez-Reverte", 2003);
        Academico academico2 = new Academico("Alvaro Pombo", 2004);
        Academico academico3 = new Academico("José Manuel Blecua", 2006);
        Academico academico4 = new Academico("Pedro R. García Barreno", 2006);
        Academico academico5 = new Academico("José Mª Merino", 2009);



        HashMap<Character, Academico> academia = new HashMap<>();
        // me piden que inserte los académicos con un métod0

        academia.put('T', academico1);
        academia.put('t', academico2);
        academia.put('A', academico3);
        academia.put('E', academico4);
        academia.put('i', academico4);

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

    static boolean nuevoAcadémico(Map<Character, Academico> academia, Academico nuevo, Character letra) {
        return false;
    }
}
