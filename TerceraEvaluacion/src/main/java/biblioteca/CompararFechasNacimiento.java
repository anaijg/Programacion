package biblioteca;

import java.util.Comparator;

public class CompararFechasNacimiento  implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        // casting para los dos objetos
        Socio s1 = (Socio) o1;
        Socio s2 = (Socio) o2;

        // ordenamos de más viejo a más joven
        if (s1.getFechaNac().isBefore(s2.getFechaNac())) {
            return -1;
        } else if (s1.getFechaNac().isAfter(s2.getFechaNac())) {
            return 1;
        } else {
            return 0;
        }
    }
}
