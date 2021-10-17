package org.itstep;

import java.rmi.dgc.Lease;
import java.util.LinkedList;
import java.util.List;

public class Animals {
    public static void main(String[] args) {
        List<Animal> animals = new LinkedList<>();
        animals.add(new Cat());
        animals.add(new Mouse());
        animals.add(new Dog());
        animals.forEach(animal -> animal.sound());
    }
}



abstract class Animal{
   abstract public void sound();


}

class Cat extends Animal{

    @Override
    public void sound() {
        System.out.println("Meow");
    }
}

class Mouse extends Animal{

    @Override
    public void sound() {
        System.out.println("Woof");
    }
}

class Dog extends Animal{

    @Override
    public void sound() {
        System.out.println("Squeak");
    }
}
