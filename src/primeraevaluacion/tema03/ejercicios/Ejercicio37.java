package primeraevaluacion.tema03.ejercicios;
/*
Hacer un programa que imprima por pantalla los 50 primeros múltiplos de 5, añadiendo un salto de línea cada 10 números.
 */
public class Ejercicio37 {
    public static void main(String[] args) {
        int contador = 0; // llevamos la cuenta de los múltiplos de 5 ; cuando llegue a 50, me paro
        int i = 0; // variable del bucle, se va incrementando con cada vuelta
        while (contador < 50) {
            i++;
            if (i % 5 == 0) { // si pasa esto, tenemos un múltiplo
                contador++;
                System.out.print(i + "\t");
                if (contador % 10 == 0) { // tengo que meter un salto de línea cada 10 (en contador = 10, = 20, = 30, ...
                    System.out.println();
                }
            }
        }
    }
}
