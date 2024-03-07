package segundaevaluacion.poo.herencia.banco;

public abstract class CuentaBancaria {
    // Titular de la cuenta (un objeto de la clase Persona, la cual contendrá información
    //sobre el titular: nombre, apellidos y DNI).
    Persona titular;
    //Saldo actual de la cuenta (número real).
    double saldo;
    //Número de cuenta (IBAN).
    String IBAN;

    boolean remunerada;

    public CuentaBancaria(Persona titular, double saldo, String IBAN, boolean remunerada) {
        this.titular = titular;
        this.saldo = saldo;
        this.IBAN = IBAN;
        this.remunerada = remunerada;
    }
}
