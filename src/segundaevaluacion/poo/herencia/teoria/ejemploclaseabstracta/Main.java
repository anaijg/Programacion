package segundaevaluacion.poo.herencia.teoria.ejemploclaseabstracta;

public class Main {
    public static void main(String[] args) {
        // no podemos instanciar Mascota porque es abstracta
        Gato gato = new Gato("Garfield", 5);
        gato.dice();

        Perro perro = new Perro("Snoopy", 3);
        perro.dice();
    }
}
