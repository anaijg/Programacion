package lambda.teoriainterfacesfuncionales;

public class Main {
    public static void main(String[] args) {
        // voy a intentar instanciar la interfaz funcional HolaMundo
        // me crea una clase anónima (lo que hay entre las {}) para que implemente el método
       /* HolaMundo hm = new HolaMundo() {
            @Override
            public void HolaMundo() {
                System.out.println("Hola, mundo");
            }
        };*/

        HolaMundo hm = () -> System.out.println("Hola, mundo");


        // una vez que has "rellenado" el método de la clase anónima, ya tienes un objeto con el que llamarlo
        hm.HolaMundo();


    }
}
