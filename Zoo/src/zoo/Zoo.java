
package zoo;

import animals.Animal;
//import static animals.Animal.getOldestAnimal;
import java.util.ArrayList;
import java.util.List;

public class Zoo  {

   
    public static void main(String[] args) {
        Crocodile croco=new Crocodile("Crocodilino",12);
        //Constructors den klironomountai!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//        croco.play();
//        
//        System.out.println(croco);
//        
//        Zebra zebra=new Zebra();
//        zebra.play();
//        
//        Lion lion=new Lion();
//        lion.move();
        Animal a1=new Animal("Dogy",13);
        Animal a2=new Animal("Caty",18);
        Animal a3=new Animal("Frogy",15);
        List<Animal> animals=new ArrayList();
        animals.add(a1);
        animals.add(a2);
        animals.add(a3);
        
        Crocodile  c1=new Crocodile("D",13);
        Crocodile c2=new Crocodile("C",23);
        Crocodile c3=new Crocodile("F",15);
        List<Crocodile> crocos=new ArrayList();
        crocos.add(c1);
        crocos.add(c2);
        crocos.add(c3);
        
        System.out.println("Oldest animal is "+Animal.getOldestAnimal(animals));
        System.out.println("Oldest croco is "+Animal.getOldestCrocodile(crocos));
    }
    
}
