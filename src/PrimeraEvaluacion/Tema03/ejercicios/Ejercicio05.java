package PrimeraEvaluacion.Tema03.ejercicios;

import java.util.Scanner;

/*
Escribe un programa que pida un nombre de usuario y una contraseña.
Esos datos se comparan con dos valores guardados previamente en el programa. Si coinciden, se indica “Has entrado al sistema”, en caso contrario se indica que usuario y/o contraseña son incorrectos.
Escribe el mismo programa anterior, pero indicando exactamente qué es lo que es incorrecto: si el usuario, la contraseña o ambos.
 */
public class Ejercicio05 {
    public static void main(String[] args) {
        // tengo que tener previamente un usuario y una contraseña, para comparar luego
        String user = "dam1";
        String password = "Fernando6";

        // Escribe un programa que pida un nombre de usuario y una contraseña.
        Scanner teclado = new Scanner(System.in);
        System.out.print("Usuario: ");
        String usuario = teclado.nextLine();
        System.out.print("Contraseña: ");
        String contraseña = teclado.nextLine();

        // la parte en que usuario y contraseña coinciden se mantiene igual
        if (usuario.equals(user) && password.equals(contraseña)) { // dam1 Fernando6
            System.out.println("Has entrado al sistema");
        } else if (usuario.equals(user) && !password.equals(contraseña)) { // si no, tenemos que mirar caso por caso
            // usuario correcto y contraseña incorrecta Ej: dam1 fernando6
            System.out.println("La contraseña es incorrecta");
        } else if (!usuario.equals(user) && password.equals(contraseña)) {
            // usuario incorrecto y contraseña correcta Ej: Dam1 Fernando6
            System.out.println("El usuario es incorrecto");
        } else { // sólo queda un caso posible: ambos incorrectos Ej: d1 f6
            System.out.println("Ni usuario ni contraseña son correctos");
        }
    }
}
