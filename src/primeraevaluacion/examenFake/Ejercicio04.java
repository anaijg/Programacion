package primeraevaluacion.examenFake;

import java.util.Scanner;

/**
 * @author Ana
 *
 * Realizar un programa que muestre un menú con las siguientes opciones:
 * 1.	Sumar números.
 * 2.	Multiplicar números.
 * 3.	Contar números.
 * •	Si se elige la opción 1, el programa pide cuántos números se van a introducir, a continuación se introducen los números y finalmente muestra la suma de todos ellos.
 * •	Si se elige la opción 2, el programa pide cuántos números se van a introducir, a continuación se introducen los números y finalmente muestra el producto de todos ellos.
 * •	Si se elige la opción 3, el programa pide introducir números hasta que el usuario introduce un 0 (que no formará parte del recuento). A continuación muestra los números introducidos.
 * Si se introduce cualquier otro número, el programa indica que la opción es incorrecta y vuelve a mostrar el menú.
 */
public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // mostramos el menú
        // Si se introduce cualquier otro número, el programa indica que la opción es incorrecta y vuelve a mostrar el menú.
        int opción = 0;
        while (opción < 1  || opción > 3) {

            System.out.println("Elige una opción:\n1. Sumar números\n2. Multiplicar números.\n3. Contar números.");
            opción = teclado.nextInt();
            int números = 0;
            switch (opción) {
                case 1:
                    System.out.print("¿Cuántos números vamos a sumar? ");
                    números = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Introduce los " + números + " números:");
                    int suma = 0;
                    for (int i = 0; i < números; i++) {
                        suma += teclado.nextInt();
                    }
                    System.out.println("Suma = " + suma);
                    break;
                case 2:
                    System.out.print("¿Cuántos números vamos a multiplicar? ");
                    números = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Introduce los " + números + " números:");
                    int producto = 1;
                    for (int i = 1; i <= números; i++) {
                        producto *= teclado.nextInt();
                    }
                    System.out.println("Producto = " + producto);
                    break;
                case 3:
                    System.out.println("Introduce números (0 para terminar):");
                    int contador = 0;
                    do {
                        números = teclado.nextInt();
                        if (números != 0) {
                            contador++;
                        }
                    } while (números != 0); {


                    }
                    System.out.println("Has introducido " + contador + " números.");
                    break;
                default:
                    System.out.println("Opción incorrecta.");
            }
        }


    }
}
