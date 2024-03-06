package segundaevaluacion.colecciones.ejercicios.libreria;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Editorial> miLista = Colecciones.obtenerEditoriales();
        System.out.println(miLista);

        Editorial editorial = Colecciones.buscarEditorial(miLista, 2);
        System.out.println(editorial);

        Colecciones.mostrarLibros(Colecciones.obtenerLibros());

        Colecciones.imprimirMapa();


    }
}
