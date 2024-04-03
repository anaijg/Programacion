package ejercicios.personascomparator;

public class Persona {
    // Debemos partir de una clase Persona con atributos nombre, edad y altura.
    private String nombre;
    private int edad;
    private int altura;

    public Persona(String nombre, int edad, int altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    // ponemos sólo getters porque no queremos cambiar valores en los atributos


    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getAltura() {
        return altura;
    }

    @Override
    public String toString() {
        return nombre + " " + edad + " " + altura;
    }
}
