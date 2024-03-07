package segundaevaluacion.poo.herencia.banco;

import java.util.ArrayList;

public abstract class CuentaCorriente extends CuentaBancaria{
    // Lista de entidades autorizadas para cobrar recibos de la cuenta (si se trata de
    //una cuenta corriente).
    ArrayList<String> entidadesAutorizadas;

    // Las cuentas corrientes no son remuneradas,
    public CuentaCorriente(Persona titular, double saldo, String IBAN) {
        super(titular, saldo, IBAN, false);

    }
}
