package segundaevaluacion.colecciones.ejercicios.ejercicio04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // el programa iniciará un pequeño cuestionario, en el que
        //le preguntará al usuario la traducción de una palabra en español. El
        //usuario escribirá la respuesta en inglés y el programa le dirá si acertó o no.
        Diccionario miDiccionario = new Diccionario();
        // lo rellenamos
        miDiccionario.nuevoPar("Perro", "Dog");
        miDiccionario.nuevoPar("Gato", "Cat");
        miDiccionario.nuevoPar("Mesa", "Table");
        miDiccionario.nuevoPar("Silla", "Chair");
        miDiccionario.nuevoPar("Programación", "Programming");
        miDiccionario.nuevoPar("Pelo", "Hair");
        miDiccionario.nuevoPar("Cara", "Face");
        miDiccionario.nuevoPar("Examen", "Exam");
        miDiccionario.nuevoPar("Base de Datos", "Database");
        miDiccionario.nuevoPar("Chaqueta", "Jacket");
        miDiccionario.nuevoPar("Pantalón", "Trousers");
        miDiccionario.nuevoPar("Bufanda", "Scarf");

        String respuesta = "";
        double contadorpreguntas = -1; // porque al final tenemos que descontar una pregunta
        double contadorAciertos = 0;
        int contadorErrores = 0;
        while (!respuesta.equalsIgnoreCase("fin")) {
            contadorpreguntas++;
            String palabra = miDiccionario.palabraAleatoria();
            String primeraLetra = miDiccionario.primeraLetraTraduccion(palabra);
            System.out.println(palabra + ": " + primeraLetra + "...");
            System.out.print("Indique la respuesta: ");
            respuesta = teclado.nextLine();
            if (miDiccionario.traduce(palabra).equalsIgnoreCase(respuesta)) {
                System.out.println("¡CORRECTO!");
                contadorAciertos++;
            } else if (respuesta.equalsIgnoreCase("fin")){
                System.out.println("FIN DEL PROGRAMA");
            } else {
                System.out.println("¡NO! La respuesta correcta es " + miDiccionario.traduce(palabra));
                contadorErrores++;
            }
        }

        System.out.println("Total preguntas: " + (contadorpreguntas));
        System.out.println("Total aciertos: " + contadorAciertos);
        System.out.println("Total errores: " + contadorErrores);
        System.out.println("Porcentaje aciertos: " + ((contadorAciertos / contadorpreguntas) * 100) + " %" );

    }
}
