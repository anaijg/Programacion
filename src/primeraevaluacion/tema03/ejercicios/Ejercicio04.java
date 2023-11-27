package primeraevaluacion.tema03.ejercicios;

import java.util.Scanner;

/*
Escribe un programa que pida un nombre de usuario y una contraseña. Esos datos se comparan con dos valores guardados previamente en el programa.
Si coinciden, se indica “Has entrado al sistema”, en caso contrario se indica que usuario y/o contraseña son incorrectos.
 */
public class Ejercicio04 {
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

        //Esos datos se comparan con dos valores guardados previamente en el programa.
        // NEW ***** OJO ***** CUANDO SE TRATA DE STRING, LA COMPARACIÓN NO SE HACE CON ==
        // SE UTILIZA EL MÉTODO EQUALS: cadena1.equals(cadena2)
        // POR EJEMPLO, en este caso, pondríamos user.equals(usuario)
        if (usuario.equals(user) && contraseña.equals(password)) {
            System.out.println("Has entrado al sistema");
        } else {
            System.out.println("Usuario y/o contraseña incorrectos");
        }


    }
}
