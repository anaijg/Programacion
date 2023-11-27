package primeraevaluacion.tema03.ejercicios;
import java.util.Scanner;
public class Ejercicio07Ainara {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cuántas tazas de mantequilla hay? ");
        int tazas = teclado.nextInt();
        System.out.println("¿Es fin de semana? Contestar con true o false ");
        boolean finDeSemana = teclado.nextBoolean();
        boolean exito = false;
        if (finDeSemana){
            exito = tazas >= 15 && tazas <= 25; // si las tazas están entre 15 y 25 guarda true; si no, false
        } else { // si no es fin de semana
            exito = tazas >= 10 && tazas <= 20;
        }

        if (exito){
            System.out.println("Éxito, ¡Vaya fiestón!");
        } else {
            System.out.println("La fiesta ha fracasado");
    }
}
}
