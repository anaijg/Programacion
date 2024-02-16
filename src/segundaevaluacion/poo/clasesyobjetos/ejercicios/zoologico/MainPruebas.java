package segundaevaluacion.poo.clasesyobjetos.ejercicios.zoologico;

public class MainPruebas {
    public static void main(String[] args) {
        // probamos a crear una zona
        // Por ejemplo, la zona con código 01FEL, nombre “Felinos”, de 400 metros cuadrados.
        Zona zona1 = new Zona("01FEL", "Felinos", 400);
        System.out.println(zona1);

        // Probamos a crear una instalación
        // * Por ejemplo, la instalación n.º 143 se encuentra en la zona de los “Felinos” y se instaló en el
        // * año 2012. Es una  * Por ejemplo, la instalación n.º 143 se encuentra en la zona de los “Felinos” y se instaló en el
        // * año 2012. Es una “jaula amplia con dos árboles en el centro”..
        Instalacion instalacion1 = new Instalacion(zona1, "jaula amplia con dos árboles en el centro", 2012);
        System.out.println(instalacion1);
        Instalacion instalacion2 = new Instalacion(zona1, "jaula amplia con dos árboles en el centro", 2012);
        System.out.println(instalacion2);
        Instalacion instalacion3 = new Instalacion(zona1, "jaula amplia con dos árboles en el centro", 2012);
        System.out.println(instalacion3);
    }
}
