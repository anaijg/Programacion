package segundaevaluacion.poo.herencia.teoria.ejemploclaseabstracta;

public abstract class Mascota { // con la palabra abstract hacemos que esta clase sea abstracta
    protected String nombre;
    protected int edad;

    public Mascota(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // método abstracto: no lo desarrollamos aquí, sólo lo dejamos declarado, pero todas las subclases deberán obligatoriamente desarrollarlo
    public abstract void dice();
}
