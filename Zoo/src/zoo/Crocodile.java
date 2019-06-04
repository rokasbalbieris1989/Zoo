package zoo;

import animals.Animal;
import java.util.List;

public class Crocodile extends Animal {

    private int legs;

    
    public static Crocodile getOldestCrocodile(List<Crocodile> crocos) {
        Crocodile a = crocos.get(0);
        for (Crocodile x : crocos) {
            if (x.getAge() > a.getAge()) {
                a = x;
            }
        }
        return a;
    }

    
    public static Crocodile getOldestAnimal(List<Animal> lista) {
        Crocodile a = (Crocodile) lista.get(0);
        for (Animal x : lista) {
            if (x.getAge() > a.getAge()) {
                a = (Crocodile) x;
            }
        }
        return a;
    }

    public void printVariables() {
        System.out.println("Name is " + name);
        System.out.println("Age is " + age);
        System.out.println("Cage is " + cage);
    }

    public Crocodile(String name, int age) {
        super(name, age);
        System.out.println("Crocodile created");
    }

    @Override
    public void play() {
        System.out.println("    Crocodile is playing     ");
    }

    @Override
    public String toString() {
        return super.toString() + "Crocodile{" + "legs=" + legs + '}';
    }

}
