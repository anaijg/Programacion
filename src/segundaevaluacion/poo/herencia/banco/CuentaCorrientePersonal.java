package segundaevaluacion.poo.herencia.banco;

public class CuentaCorrientePersonal extends CuentaCorriente{
    // Comisión de mantenimiento (para el caso de una cuenta corriente personal).
    // tienen una comisión de mantenimiento (una cantidad fija anual).
    double comisionMantenimiento;

    public CuentaCorrientePersonal(Persona titular, double saldo, String IBAN) {
        super(titular, saldo, IBAN);
    }

    //
    //no permite tener descubiertos.
}
