package ua.ithillel.course01.lesson08.animals;

import ua.ithillel.course01.lesson08.Animal;
import ua.ithillel.course01.lesson08.interfaces.Pet;

public class Dog extends Animal implements Pet {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("Dog " + getName() + " says: Woof");

    }

    public void greets(Dog dog) {
        System.out.println("Woof");

    }

    @Override
    public void feed() {
        System.out.println("Feeding dog " + getName());
    }

    @Override
    public void walk() {
        System.out.println("Walking dog " + getName());
    }

    @Override
    public void play() {
        System.out.println("Playing with dog " + getName());
    }
}
