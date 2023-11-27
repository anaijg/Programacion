package primeraevaluacion.tema03.ejercicios;
/*
Hacer un programa que imprima por pantalla los veinte primeros múltiplos de 5.
 */
public class Ejercicio36OtraForma {
    public static void main(String[] args) {
        // idea: ir incrementando i, imprimiendo sólo los múltiplos de 5;
        // utilizamos una  variable contador, para que se incremente cada vez que encontramos un múltiplo
        // paramos cuando el contador es 20
        int i = 0;
        int contador = 0; // este contador se incrementa en 1 cada vez que encontremos un múltiplo de 5
        while (contador < 20) {
            if (i % 5 == 0 && i != 0) {
                // entra si i es múltiplo de 5
                System.out.println(i);
                contador++; // este contador sólo se incrementa si el i de la vuelta actual es múltiplo de 5
            }
            i++;
        }
    }
}
