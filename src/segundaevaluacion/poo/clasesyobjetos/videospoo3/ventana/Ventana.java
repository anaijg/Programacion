package segundaevaluacion.poo.clasesyobjetos.videospoo3.ventana;

public class Ventana {
    // propiedades, atributos, campos, variables miembro
    private int ancho;
    private int alto;
    private Color color;

    // método constructor parametrizado
    public Ventana(int ancho, int alto, Color color) {
        this.ancho = ancho;
        this.alto = alto;
        this.color = color;
    }

    // para poder cambiar los valores de los atributos privados utilizamos getters y setters

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        // si queremos que el ancho máximo sean 2048 px
        if (ancho > 2048) {
            System.out.println("El tamaño máximo es 2048");
        } else {
            this.ancho = ancho;
        }
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }


    // utilidades:
    // el método toString() sirve para imprmir los valores de los atributos

    @Override
    public String toString() {
        return "Ventana{" +
                "ancho=" + ancho +
                ", alto=" + alto +
                ", color=" + color +
                '}';
    }

    // métodos de usuario
    public void aparecer(){
        System.out.println("Pum. La ventana aparece");
    }

    public void cerrar() {
        System.out.println("Poff. La ventana se cierra");
    }
}
