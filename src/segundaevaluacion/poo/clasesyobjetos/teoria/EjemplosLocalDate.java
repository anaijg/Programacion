package segundaevaluacion.poo.clasesyobjetos.teoria;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class EjemplosLocalDate {
    public static void main(String[] args) {
        // si quieres solo una fecha -> LocalDate

        // quiero mostrar la fecha de hoy
        LocalDate hoy = LocalDate.now();
        System.out.println("Fecha de hoy: " + hoy);
        // quiero guardar la fecha de nacimiento
        LocalDate fechaNacimiento = LocalDate.of(2000, 4, 5);
        System.out.println("Fecha de nacimiento: " + fechaNacimiento.getDayOfMonth() + "/" +
                fechaNacimiento.getMonthValue() + "/" + fechaNacimiento.getYear());

        // quiero saber el día de la semana de la fecha de nacimiento
        System.out.println("Día de la semana: " + fechaNacimiento.getDayOfWeek().getValue());


        System.out.println("VAMOS A VER QUÉ HORA ES: ");
        LocalDateTime ahora = LocalDateTime.now();
        System.out.println(ahora);
        int hora = ahora.getHour();
        int minutos = ahora.getMinute();
        int segundos = ahora.getSecond();

        System.out.println("Hora: " + hora);
        System.out.println("Minutos: " + minutos);
        System.out.println("Segundos: " + segundos);

        // quiero introducir una hora determinada
        LocalTime hhmmss = LocalTime.now();
        System.out.println(hhmmss);
        // quiero poner yo una hora determinada
        LocalTime record = LocalTime.of(2, 11,53);
        System.out.println("Record de maratón femenino: " + record.getHour() + ":" + record.getMinute() + ":" + record.getSecond());
    }
}
