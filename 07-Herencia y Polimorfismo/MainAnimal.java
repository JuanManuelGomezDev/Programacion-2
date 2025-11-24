
package tp7_programacion2_gomezjuanmanuel;

import java.util.ArrayList;

public class MainAnimal {
    public static void main(String[] args) {
        ArrayList<Animal> animales = new ArrayList<>();
        boolean add = animales.add(new Perro());
        animales.add(new Gato());
        animales.add(new Vaca());

        for (Animal animal : animales) {
            animal.hacerSonido();
        }
    }
}
