package biblioteca;

import java.util.Comparator;

public class CompararApellidos implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        // casting de Object a Socio
        Socio socio1 = (Socio) o1;
        Socio socio2 = (Socio) o2;

        // llamamos al método compareTo de String, que lo trae implementado de serie
        return socio1.getNombre().compareTo(socio2.getNombre());

    }
}
