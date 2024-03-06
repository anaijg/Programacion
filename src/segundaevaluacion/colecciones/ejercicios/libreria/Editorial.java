package segundaevaluacion.colecciones.ejercicios.libreria;

public class Editorial {
    private int idEditorial;
    private String nombre;

    // dos constructores, uno sin parámetros y otro con dos parámetros
    public Editorial() {
    }

    public Editorial(int idEditorial, String nombre) {
        this.idEditorial = idEditorial;
        this.nombre = nombre;
    }

    // getters y setters


    public int getIdEditorial() {
        return idEditorial;
    }

    public void setIdEditorial(int idEditorial) {
        this.idEditorial = idEditorial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return  idEditorial + " " + nombre;
    }
}
