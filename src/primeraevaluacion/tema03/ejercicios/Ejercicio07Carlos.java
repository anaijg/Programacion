package primeraevaluacion.tema03.ejercicios;
import java.util.Scanner;
public class Ejercicio07Carlos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("¿Cuantas tazas de mantequilla de cacahuete hay en la fiesta? ");
        int tazas = teclado.nextInt();
        // antes del próximo nextLine()
        teclado.nextLine();
        System.out.print("¿Es fín de semana? si/no ");
        String finde = teclado.nextLine();
        if (tazas >= 10 && tazas <= 20 && finde.equalsIgnoreCase("no")){ // vale NO, No, nO y no
            System.out.println("La fiesta ha sido un exito");
        }else if (tazas >= 15 && tazas <=25 && finde.equalsIgnoreCase("si")){
            System.out.println("La fiesta ha sido un exito");
        }else { System.out.println("La fiesta ha sido un fracaso");
        }
    }
}
