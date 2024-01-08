package segundaevaluacion.poo.clasesyobjetos.videospoo3.ventana;

public class Main {
    public static void main(String[] args) {
        // aquí es donde vamos a crear los objetos
        // queremos una ventana verde, de 30px de ancho y 100px de alto
        Ventana ventana1 = new Ventana(30, 100, Color.VERDE);
        System.out.println(ventana1); // ojo, esto sale bien porque hemos implementado el método toString en Ventana
        ventana1.aparecer();
        ventana1.cerrar();
        // quiero guardar el ancho de la ventana en una variable aquí
        int a = ventana1.getAncho();
        System.out.println(a);


    }
}
