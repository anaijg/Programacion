package segundaevaluacion.poo.herencia.banco;

public class CuentaCorrienteEmpresa extends CuentaCorriente{
    // Tipo de interés por descubierto (si es una cuenta corriente de empresa).
    double interesDescubierto;
    // Máximo descubierto permitido (si se trata de una cuenta corriente de empresa)
    double maxDescubierto;

    public CuentaCorrienteEmpresa(Persona titular, double saldo, String IBAN) {
        super(titular, saldo, IBAN);
    }
}
