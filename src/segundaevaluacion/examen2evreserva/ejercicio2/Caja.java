package segundaevaluacion.examen2evreserva.ejercicio2;

public class Caja {
    // ponemos como modificador de acceso protected para que las subclases puedan heredar los atributos
    protected int ancho;
    protected int alto;
    protected int fondo;
    protected String etiqueta;

    protected UnidadDeMedida unidad;

    public Caja(int ancho, int alto, int fondo, UnidadDeMedida unidad) {
        this.ancho = ancho;
        this.alto = alto;
        this.fondo = fondo;
        this.unidad = unidad;
        this.etiqueta = "";
    }

    public void setEtiqueta(String etiqueta) {
        if (etiqueta.length() <= 30) {
            this.etiqueta = etiqueta;
        }
    }

    public double getVolumen() {
        // dependiendo de la unidad de medida (cm o m) se calcula de una forma u otra, pero no lo tengo en cuenta en la corrección
            return ancho * alto * fondo;
    }

    @Override
    public String toString() {
        return "Caja{" +
                "ancho=" + ancho +
                ", alto=" + alto +
                ", fondo=" + fondo +
                ", etiqueta='" + etiqueta + '\'' +
                ", unidad=" + unidad +
                '}';
    }
}
