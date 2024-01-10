package segundaevaluacion.poo.metodos;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio16ArraysConArrayList {
    // quiero un Scanner que sea visible en todos los métodos de esta clase
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        //Crear un programa que cree un array de números enteros (tamaño introducido por teclado), muestre el siguiente menú y realice lo que en las opciones se indica:
         // otra forma: int tamaño = Integer.parseInt(teclado.nextline());
        int tamaño = pedirNumero("Introduce el tamaño"); // me da igual porque va a ser un arraylist

        // crear un arraylist de números enteros
        ArrayList<Integer> numeros = crearArrayList();

        //Añadir número al final: pide un número y lo añade al final del array.
        // para tener un poco más de juego, metemos 5 números en el arraylist
        for (int i = 0; i < 5; i++) {
            numeros = añadirAlFinal(numeros);
        }

        // imprimimos el arraylist
        imprimirNumeros(numeros);

        //Añadir número en una posición: pide un número y una posición, y si la posición existe en el array lo añade en esa posición (la posición se pide a partir de 1).
        int numero = pedirNumero("Introduce número");
        int indice = pedirNumero("¿En qué indice quieres que lo ponga?");
        if(indice <= numeros.size() - 1 && indice >= 0) {
            numeros.add(indice,numero);
        }
        imprimirNumeros(numeros);

        //Longitud del array: muestra el tamaño del array.
        System.out.println("Tamaño del array: " + numeros.size());

        //Eliminar el último número: muestra el último número del array y lo borra.
        System.out.println("Se va a borrar el elemento: " + numeros.get(numeros.size() - 1));
        numeros.remove(numeros.size() - 1);
        System.out.println(numeros);
        //Eliminar un número: pide una posición, y si la posición existe en el array borra el elemento que contiene (lo reemplaza con un 0).
        indice = pedirNumero("Dime el índice del elemento que quieres borrar: ");
        if (indice <= numeros.size() - 1) {
            numeros.remove(indice);
        }
        System.out.println(numeros);
        //Contar números: pide un número y te dice cuántas veces aparece en el array.
        numero = pedirNumero("Dime el número que quieres contar");
        int contador = 0;
        for (Integer elemento: numeros) {
            if (elemento == numero) {
                contador++;
            }
        }
        System.out.println("El número " + numero + " aparece " + contador + " veces.");
        //Posiciones de un número: pide un número y te dice en que posiciones está.
        ArrayList<Integer> posiciones = new ArrayList<>();
        numero = pedirNumero("Dime el número que quieres buscar: ");
        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) == numero) {
                posiciones.add(i);
            }
        }
        System.out.println("El número " + numero + " aparece en las posiciones " + indice);
        //Mostrar números: Muestra los números que contiene.
        System.out.println(numeros);
        //Salir
    }

    public static void imprimirNumeros(ArrayList<Integer> numeros) {
        System.out.println(numeros);
    }
    public static ArrayList<Integer> añadirAlFinal(ArrayList<Integer> numeros) {
        int numeroFinal = pedirNumero("Introduce el número a añadir: ");
        numeros.add(numeroFinal);
        return numeros; // devolvemos el arraylist modificado
    }

    // método que pida el tamaño
    public static int pedirNumero(String texto) {
        System.out.println(texto);
        int numero = teclado.nextInt(); teclado.nextLine();
        return numero;
    }

    public static ArrayList<Integer> crearArrayList() {
        ArrayList<Integer> numeros = new ArrayList<>();
        return numeros;
    }

}
