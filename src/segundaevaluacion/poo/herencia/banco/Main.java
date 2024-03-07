package segundaevaluacion.poo.herencia.banco;

import java.util.Arrays;
import java.util.Scanner;
/*
/*
Principal: Contendrá el método main y todo el código de interacción con el usuario
(lectura de teclado y salida por pantalla).
 */

public class Main {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        // creo un cliente:
        Persona cliente1 = crearCliente();
        System.out.println(cliente1);
        // averiguo el tipo de cuenta
        int tipo = tipoCuenta();
        // pido el saldo
        double saldo = preguntarSaldo();

        // con esto creamos la cuenta
        switch (tipo) {
            case 1: // cuenta de ahorro
                CuentaAhorro cuentaAhorro = new CuentaAhorro(cliente1, saldo, "ES0012345678910");
                break;
            case 2: // cc personal
                CuentaCorrientePersonal ccp = new CuentaCorrientePersonal(cliente1, saldo, "dddddddasdnoanoawgrn");
                break;
            case 3: // cc empresa
                CuentaCorrienteEmpresa cce = new CuentaCorrienteEmpresa(cliente1, saldo, "gfsonirhiojtrhgnìotrhnnìorgthbn");
                break;
            default:
                System.out.println("Cuenta desconocida.");
        }

    }

    public static Persona crearCliente() {
        // solicitar al cliente:
        //Datos personales: nombre, apellidos y DNI.
        System.out.println("Nombre, apellidos y DNI, todos ellos separados por un espacio: ");
        String datosPersonales = teclado.nextLine();
        String[] datos = datosPersonales.split(" ");
        System.out.println(Arrays.toString(datos));
        Persona persona = new Persona(datos[0], datos[1], datos[2], datos[3]);

        return persona;
    }

    //Tipo de cuenta que desea abrir: cuenta de ahorro, cuenta corriente personal o
    //cuenta corriente de empresa.

    public static int tipoCuenta() {
        System.out.println("\nTipo de cuenta: 1. Ahorro\n2. Cuenta corriente personal\n3. Cuenta corriente de empresa\nElige una opción (1-3");
        int tipo = teclado.nextInt(); teclado.nextLine();
        return tipo;
    }

    //   //Saldo inicial.
    public static double preguntarSaldo() {
        System.out.println("Saldo inicial: ");
        double saldo = teclado.nextDouble();
        return saldo;
    }

    public static int mostrarMenu() {
        int opcion = 0;
        // mostramos las opciones
        System.out.println("1. Abrir una nueva cuenta.\n" +
                "2. Ver un listado de las cuentas disponibles (código de cuenta, titular y saldo actual).\n" +
                "3. Obtener los datos de una cuenta concreta.Realizar un ingreso en una cuenta.\n" +
                "4. Retirar efectivo de una cuenta.\n" +
                "5. Consultar el saldo actual de una cuenta.\n" +
                "6. Salir de la aplicación." +
                "Elija una opción (1-6");

        // recogemos por teclado lo que el usuario elija
        opcion = teclado.nextInt(); teclado.nextLine();
        // devuelvo la opción elegida
        return opcion;
    }

}
