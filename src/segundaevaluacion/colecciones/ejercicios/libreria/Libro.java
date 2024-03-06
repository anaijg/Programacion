package segundaevaluacion.colecciones.ejercicios.libreria;

public class Libro {
    private String titulo;
    private String isbn;
    private Autor autor;
    private Editorial editorial;

    // constructores

    public Libro() {
    }

    public Libro(String titulo, String isbn, Autor autor, Editorial editorial) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.editorial = editorial;
    }

    // getters y setters


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return isbn + "\t\t" + titulo + "\t\t\t" + editorial.getNombre() + "\t\t\t" +autor.getNombre();
    }
}
