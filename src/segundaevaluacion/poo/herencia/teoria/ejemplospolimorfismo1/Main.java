package segundaevaluacion.poo.herencia.teoria.ejemplospolimorfismo1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        AnimalMitologico animalMitologico = new AnimalMitologico();
        //animalMitologico.saludar();
        // superclase = new subclase
        AnimalMitologico quimera = new Quimera();
        //quimera.saludar();
        // subclase = new superclase -> esto no funciona (salvo que hagamos un casting)
        //Quimera animal = (Quimera) new AnimalMitologico();
        AnimalMitologico dragon = new Dragon();
        //dragon.saludar();
        ArrayList<AnimalMitologico> animalMitologicos = new ArrayList<>();
        animalMitologicos.add(animalMitologico);
        animalMitologicos.add(quimera);
        animalMitologicos.add(dragon);
        for (AnimalMitologico elemento : animalMitologicos) {
            elemento.saludar();
        }

        Dragon fuji = new Dragon();
        animalMitologicos.add(fuji);



    }
}
