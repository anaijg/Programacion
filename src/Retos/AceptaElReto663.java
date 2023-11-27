package Retos;

import java.util.Scanner;

/*
Entrada
La entrada comienza con un número indicando cuántos casos de prueba deberán ser procesados. Cada uno es un número entre −3.000 y 3000 representando un año. Los valores negativos indican años antes de Cristo y los positivos después de Cristo (o de la "era común"). Al no haber existido, en la entrada no habrá nunca un 0.

Salida
Por cada caso de
prueba, el programa escribirá el año correspondiente en un supuesto calendario en el que sí existió el año 0, es decir un calendario donde el año 1 habría sido el año 0, manteniendo los anteriores igual.

Entrada de ejemplo
3
2023
1
-100
Salida de ejemplo
2022
0
-100
 */
public class AceptaElReto663 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        int año = 0;
        for (int i = 0; i < n; i++) {
            año = teclado.nextInt();
            if (año>0) {
                System.out.println(año - 1);
            } else {
                System.out.println(año);
            }
        }
    }

}
