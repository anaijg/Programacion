package segundaevaluacion.examen2evreserva.ejercicio2;

public class Main {
    public static void main(String[] args) {
        Caja caja = new Caja(5, 5, 5, UnidadDeMedida.cm);

        double volumen = caja.getVolumen();
        System.out.println("Volumen caja: " +  volumen); // esta y la anterior línea pueden juntarse

        caja.setEtiqueta("Regalito");

        System.out.println(caja);

        CajaCarton cajaCarton = new CajaCarton(5, 5, 5);

        System.out.println("Volumen caja cartón: " +  cajaCarton.getVolumen());

        double superficie = cajaCarton.calcularSuperficieTotal();
        System.out.println("Superficie caja cartón: " + superficie);

        cajaCarton.setEtiqueta("Otro regalito");

        System.out.println(cajaCarton);
    }
}
