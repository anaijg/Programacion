package segundaevaluacion.colecciones.ejercicios.libreria;

import java.util.*;

public class Colecciones {
    public static List<Editorial> obtenerEditoriales() {
        ArrayList<Editorial> editoriales = new ArrayList<>();
        editoriales.add(new Editorial(1, "Prentice Hall"));
        editoriales.add(new Editorial(2, "Wiley"));
        editoriales.add(new Editorial(3, "Wrox"));
        editoriales.add(new Editorial(4, "Addison Wesley"));
        editoriales.add(new Editorial(5, "O'Reilly"));
        return editoriales;
    }

    public static Editorial buscarEditorial(List<Editorial> editoriales, int id) {
        Iterator<Editorial> iterator = editoriales.iterator();
        while (iterator.hasNext()) {
            Editorial editorial = iterator.next();
            if (editorial.getIdEditorial() == (id)) {
                return editorial;
            }
        }
        return null;
    }

    public static List<Libro> obtenerLibros() {
        // creamos los autores
        Autor autor1 = new Autor();
        autor1.setCodAutor("1");
        autor1.setNombre("Bruce Eckel");
        Autor autor2 = new Autor();
        autor2.setCodAutor("2");
        autor2.setNombre("James McGovern");
        Autor autor3 = new Autor();
        autor3.setCodAutor("3");
        autor3.setNombre("Ivor Horton");
        Autor autor4 = new Autor();
        autor4.setCodAutor("4");
        autor4.setNombre("Joshua Bloch");
        Autor autor5 = new Autor();
        autor5.setCodAutor("5");
        autor5.setNombre("Jonathan Knudsen");

        // creamos las editoriales
        List<Editorial> editorials = obtenerEditoriales();

        // finalmente creamos los libros
        Libro libro1 = new Libro("Thinking in Java", "1-2256" , autor1, editorials.get(0));
        Libro libro2 = new Libro("Java 2 Enterprise","2-7985",  autor2, editorials.get(1));
        Libro libro3 = new Libro("Beginning Java","1-9857",  autor3, editorials.get(2));
        Libro libro4 = new Libro("Effective Java","0-1537",  autor4, editorials.get(3));
        Libro libro5 = new Libro("Learning Java","0-1537",  autor5, editorials.get(4));

        // y los metemos en una lista
        ArrayList<Libro> libros = new ArrayList<>();
        libros.add(libro1);
        libros.add(libro2);
        libros.add(libro3);
        libros.add(libro4);
        libros.add(libro5);
        return libros;
    }

    public static void mostrarLibros(List<Libro> libros) {
        System.out.println("ISBN\t\ttitulo\t\t\teditorial\t\t\tautor");
        System.out.println("________________________________________");
        Iterator<Libro> iterator = libros.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static Map<String, Editorial> obtenerEditorialesPremiadas() {
        List<Editorial> editoriales = obtenerEditoriales();
        Map<String, Editorial> premiadas = new HashMap<>();
        premiadas.put("1er premio", buscarEditorial(editoriales, 2));
        premiadas.put("2do premio", buscarEditorial(editoriales, 4));
        premiadas.put("3er premio", buscarEditorial(editoriales, 1));
        return premiadas;
    }

    public static void imprimirMapa() {
        Map<String, Editorial> premiadas = obtenerEditorialesPremiadas();
        //System.out.println("Feote: " + premiadas);

        System.out.println("Editoriales premiadas:  ");
        for (Map.Entry<String, Editorial> lineaMapa: premiadas.entrySet()) {
            System.out.println(lineaMapa.getKey() + "\t\t\t" + lineaMapa.getValue().getNombre());
        }
    }
}
