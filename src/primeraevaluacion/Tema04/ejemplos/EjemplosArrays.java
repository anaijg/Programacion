package primeraevaluacion.Tema04.ejemplos;

import java.util.Arrays;

public class EjemplosArrays {
    public static void main(String[] args) {
        // hasta ahora hemos trabajado con variables individuales (sólo guardan un valor)
        // ¿qué pasa si quiero guardar las notas de Programación de una clase con 16 alumnos?
        double alumno1 = 5.5; // sólo puedo guardar un número, un valor
        double alumno2 = 8.5; // sólo puedo guardar un número, un valor
        // tendría que crear 16 variables

        // o bien...

        // utilizar una estructura que me permita guardar un conjunto de valores DEL MISMO TIPO (double, int, String... el que sea)
        // y para esto sirve el array
        int[] notas = {6, 5, 4, 8, 10, 3, 7, 7, 5, 5}; // declaro el array notas, que guarda números enteros
        // quiero recuperar la primera nota, por ejemplo para imprimirla --> accedo a través del índice
        System.out.println("Elemento guardado en la primera posición del array (primer elemento guardado):");
        System.out.println(notas[0]);
        // tamaño del array
        System.out.println("Tamaño del array (número de elementos que contiene)");
        System.out.println(notas.length);
        // última posición:
        System.out.println("Última posición del array: ");
        System.out.println(notas[notas.length - 1]);
        // si quiero cambiar un dato lo puedo hacer a través de su índice (cosa que no puedo hacer con String
        System.out.println("*** Cambio la primera nota ***");
        notas[0] = 7;
        System.out.println(notas[0]);

        // FORMAS DE DECLARAR Y RELLENAR UN ARRAY
        // una es la de la línea 15: lo declaro y enumero los datos en orden dentro de {}
        // lo más habitual es que no sepas los datos antes de declararlo, entonces se hace
        int[] números = new int[10]; // 10 es el tamaño del array, INMODIFICABLE
        // después, puedo utilizar un for (muy frecuentemente) para rellenarlo
        // por ejemplo, vamos a rellenar el array números con el valor de sus índices: 0, 1, 2, ...
        for (int i = 0; i < números.length; i++) {
            números[i] = i;
        }
        // ¿Cómo imprimo todos los elementos del array?
        // Opción A: con for
        for (int i = 0; i < números.length; i++) {
            System.out.print(números[i] + " ");
        }
        System.out.println();
        // Opción B: con el método toString() de la clase Arrays
        System.out.println(Arrays.toString(números));
    }

}
