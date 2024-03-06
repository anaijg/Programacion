package segundaevaluacion.poo.herencia.teoria.ejemplospolimorfismo2;

public class Fichero {
    protected String nombreCompleto;

    // constructor con un parámetro

    public Fichero(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    // getters y setters

    protected String getInfoFichero() {
        return "Fichero: " + nombreCompleto;
    }
    public void imprimeInfoFichero() {
        String info = this.getInfoFichero(); // comportamiento polimórfico
        System.out.println(info);
    }




}
