package segundaevaluacion.colecciones.ejercicios.ejercicio04;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

public class Diccionario {
    // Propiedades
    //Esta clase tendrá una única propiedad diccionario que será un HashMap
    //con pares clave-valor ambos del tipo String.

    private HashMap<String, String> diccionario;

    //Constructor
    //El Diccionario construye la propiedad diccionario como un HashMap vacío.

    public Diccionario() {
        this.diccionario = new HashMap<>();
    }

    @Override
    public String toString() {
        return "Diccionario{" +
                "diccionario=" + diccionario +
                '}';
    }

    // Métodos
    //nuevoPar – Este método recibirá una palabra en español y otra en inglés y
    //las introducirá en el HashMap como nuevo par clave-valor.
    public void nuevoPar(String español, String inglés) {
        diccionario.put(español, inglés);
    }

    //traduce – Este método recibirá una palabra en español, la buscará en la
    //propiedad diccionario y devolverá su correspondiente valor en inglés.
    public String traduce(String español) {
        return diccionario.get(español);
    }

    //palabraAleatoria – Este método no recibirá ningún parámetro. El método
    //devolverá aleatoriamente una de las palabras en español del diccionario.
    public String palabraAleatoria() {
        // necesitamos saber cuántos pares hay
        int tamaño = diccionario.size();
        //System.out.println(tamaño);
        // generamos un número aleatorio entre 0 y el índice de la última posición
        Random generador = new Random();
        int indice = generador.nextInt(0, tamaño);
        // ahora necesito meter las claves en un array o arraylist
        //
        String español = (String) diccionario.keySet().toArray()[indice];
        return español;
    }

    //primeraLetraTraduccion – Este método recibirá una palabra en español y
    //devolverá la primera letra de su correspondiente palabra en inglés.
    public String primeraLetraTraduccion(String español) {
        return diccionario.get(español).substring(0,1);
    }
}
