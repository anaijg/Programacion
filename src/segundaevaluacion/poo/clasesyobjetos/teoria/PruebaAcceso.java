package segundaevaluacion.poo.clasesyobjetos.teoria;

// estoy importando las clases del paquete acceso para poder utilizarlas
import segundaevaluacion.poo.clasesyobjetos.teoria.acceso.*;
public class PruebaAcceso {
    public static void main(String[] args) {
        // estamos probando si podemos acceder a las clases desde otro paquete
        Publica objetoPublico = new Publica();
        System.out.println(objetoPublico.atributoPublico);
        ProteccionDePaquete objetoPP = new ProteccionDePaquete();
        //System.out.println(objetoPP.atributoConProteccionDePaquete); -> no deja, porque estamos en otro paquete
        Protegida objetoProtegido = new Protegida();
        //System.out.println(objetoProtegido.);

    }
}
