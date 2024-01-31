package segundaevaluacion.poo.clasesyobjetos.teoria;

public class MiClase {
    // atributos
    int atributo;
    boolean otroAtributo;

    String nombre;
    // constructor -> podemos no ponerlo, y java utilizará el constructor por defecto, es decir un constructor "invisible", que no recibe parámetros, sólo crea el objeto

    // si queremos, getters y setters -> podemos no ponerlo

    // toString() -> podemos no ponerlo

    // métodos de usuario (normalmente son métodos de instancia -> sólo podrán llamarse a partir de objetos que hayamos creado de esta clase

    // método que imprime el atributo
    public void imprimirAtributo() {
        System.out.println("Valor del atributo: " + atributo);
        System.out.println("Valor del otro atributo: " + otroAtributo);
        System.out.println("Nombre: " + nombre);
    }

}
