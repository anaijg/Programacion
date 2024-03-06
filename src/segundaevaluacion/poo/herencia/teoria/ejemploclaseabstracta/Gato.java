package segundaevaluacion.poo.herencia.teoria.ejemploclaseabstracta;

public class Gato extends Mascota{
    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void dice() { // dice() es obligatorio sobreescribirlo porque es un método abstracto
        System.out.println("Miau");
    }
}
