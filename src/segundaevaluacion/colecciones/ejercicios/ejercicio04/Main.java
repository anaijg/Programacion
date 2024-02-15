package segundaevaluacion.colecciones.ejercicios.ejercicio04;

public class Main {
    public static void main(String[] args) {
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
    }
}
