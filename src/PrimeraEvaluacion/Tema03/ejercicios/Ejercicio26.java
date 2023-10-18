package PrimeraEvaluacion.Tema03.ejercicios;
/*
Hacer un programa que calcule la suma y el producto de los 30 primeros números naturales. (El 0 no cuenta)
 */
public class Ejercicio26 {
    public static void main(String[] args) {
        // la suma sería: 1 + 2 + 3 + ... + 30 (ambos inclusive)
        int suma = 0; // la suma siempe la inicializamos a 1
        for (int i = 1; i < 31; i++) { // también podríamos poner i <= 30
            suma = suma + i; // en la 1ª vuelta i vale 1, en la 2ª vale 2, en la 3ª 3...
        }
        System.out.println("Suma = " + suma);

        // ahora vamos con el producto de los 30 primeros números naturales: 1 * 2 * 3 * ... * 30
        int producto = 1; // el producto acumulado lo tenemos que inicializar a 1, porque a 0 nos daría 0
        for (int i = 1; i < 31; i++) {
            producto = producto * i;
        }
        System.out.println("Producto = " + producto);
    }
}
