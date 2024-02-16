package segundaevaluacion.poo.clasesyobjetos.ejercicios.zoologico;

/**
 * El zoológico tendrá INSTALACIONES (jaulas) donde vivirá cada animal.
 * Cada instalación está situada en una zona exclusivamente (y una zona tendrá varias instalaciones) Además de la
 * zona a la que pertenece, interesa guardar de cada instalación una pequeña descripción y el
 * año en que se instaló. Cada instalación se identificará con un código numérico entero (por
 * supuesto dos instalaciones distintas no pueden tener el mismo número)
 * Por ejemplo, la instalación n.º 143 se encuentra en la zona de los “Felinos” y se instaló en el
 * año 2012. Es una “jaula amplia con dos árboles en el centro”.
 */
public class Instalacion {
    private Zona zona;
    private String descripcion;
    private int año;
    private int codigo; // vamos a hacer que se autoincremente con cada instalación creada
    static int autoincremento;

    public Instalacion(Zona zona, String descripcion, int año) {
        this.zona = zona;
        this.descripcion = descripcion;
        this.año = año;
        // incrementamos la variable autoincremento
        autoincremento++;
        this.codigo = autoincremento;
    }

    @Override
    public String toString() {
        return "Instalacion{" +
                "zona=" + zona +
                ", descripcion='" + descripcion + '\'' +
                ", año=" + año +
                ", codigo=" + codigo +
                '}';
    }
}
