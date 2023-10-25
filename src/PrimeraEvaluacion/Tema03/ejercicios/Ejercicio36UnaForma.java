package PrimeraEvaluacion.Tema03.ejercicios;
/*
Hacer un programa que imprima por pantalla los veinte primeros múltiplos de 5.
 */
public class Ejercicio36UnaForma {
    public static void main(String[] args) {
        int n = 0;
        while (n < 20) {
            n = n + 1;
            System.out.println(5 * n);
        }
    }
}
