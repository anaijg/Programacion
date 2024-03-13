package segundaevaluacion.examen2evreserva.ejercicio2;

public class CajaCarton extends Caja{

    // el constructor no recibe la unidad de medida, puesto que siempre es cm
    public CajaCarton(int ancho, int alto, int fondo) {
        super(ancho, alto, fondo, UnidadDeMedida.cm);
    }

    // hay que sobreescribir el método getVolumen()
    @Override
    public double getVolumen() {
        return super.getVolumen() * (80.0/100.0);
    }

    public double calcularSuperficieTotal() {
        return 2*(alto * ancho + alto * fondo + ancho * fondo);
    }


}
