package segundaevaluacion.colecciones.ejercicios.ejercicio04;

public class MainPruebas {
    public static void main(String[] args) {
        // creamos un diccionario
        Diccionario miDiccionario = new Diccionario();
        // lo rellenamos
        miDiccionario.nuevoPar("Perro", "Dog");
        miDiccionario.nuevoPar("Gato", "Cat");
        miDiccionario.nuevoPar("Mesa", "Table");
        miDiccionario.nuevoPar("Silla", "Chair");
        miDiccionario.nuevoPar("Programación", "Programming");
        miDiccionario.nuevoPar("Pelo", "Hair");
        miDiccionario.nuevoPar("Cara", "Face");

        System.out.println(miDiccionario);

        // probamos el método traduce
        String traducción = miDiccionario.traduce("Pelo");
        System.out.println(traducción);

        // probamos el método palabraAleatoria
        System.out.println("Palabra aleatoria: " + miDiccionario.palabraAleatoria());

        // probamos el método primeraLetraTraducción
        System.out.println(miDiccionario.primeraLetraTraduccion("Cara"));
    }
}
