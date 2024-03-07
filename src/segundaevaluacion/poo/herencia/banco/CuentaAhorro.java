package segundaevaluacion.poo.herencia.banco;

public class CuentaAhorro extends CuentaBancaria{
    // Tipo de interés anual (si se trata de una cuenta de ahorro).
    double tia;

    // Las cuentas de ahorro son remuneradas
    public CuentaAhorro(Persona titular, double saldo, String IBAN) {
        super(titular, saldo, IBAN, true);
    }

    //     //no permite tener descubiertos.
}
