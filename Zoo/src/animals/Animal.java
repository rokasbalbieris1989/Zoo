package animals;

import java.util.ArrayList;
import java.util.List;
import zoo.Crocodile;

public class Animal {

    protected String name;
    protected int age;
    protected String cage;

    public Animal() {
        super();
        System.out.println("Animal created");
    }

    public Animal(String name) {
        this();
        this.name = name;
    }

    public Animal(String name, int age) {
        this(name);
        this.age = age;
    }

    public static Crocodile getOldestCrocodile(List<Crocodile> crocos) {
        Crocodile a = crocos.get(0);
        for (Crocodile x : crocos) {
            if (x.getAge() > a.getAge()) {
                a = x;
            }
        }
        return a;
    }

    public static Animal getOldestAnimal(List<Animal> lista) {
        Animal a = lista.get(0);
        for (Animal x : lista) {
            if (x.getAge() > a.getAge()) {
                a = x;
            }
        }
        return a;
    }

    @Override
    public String toString() {
        return "Animal{" + "name=" + name + ", age=" + age + ", cage=" + cage + '}';
    }

    public Animal(String name, int age, String cage) {
        this(name, age);
        this.cage = cage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCage() {
        return cage;
    }

    public void setCage(String cage) {
        this.cage = cage;
    }

    public void move() {
        System.out.println("Animal is moving.");
    }

    public void eat() {
        System.out.println("animal is eating.");
    }

    public void play() {
        System.out.println("Animal is playing.");
    }
}
