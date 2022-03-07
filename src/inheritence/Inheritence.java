package inheritence;

import inheritence.models.Cat;
import inheritence.models.Dog;

public class Inheritence {
    public static void main(String[] args) {
        Dog dog =new Dog();
        System.out.println("Dog ");
        dog.run();
        Cat cat = new Cat();
        System.out.println("Cat ");
        cat.move();
    }
}
