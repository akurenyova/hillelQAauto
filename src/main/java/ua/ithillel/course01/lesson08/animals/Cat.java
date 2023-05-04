package ua.ithillel.course01.lesson08.animals;

import ua.ithillel.course01.lesson08.Animal;
import ua.ithillel.course01.lesson08.interfaces.Pet;
import ua.ithillel.course01.lesson08.interfaces.WildAnimal;

public class Cat extends Animal implements Pet, WildAnimal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("Cat " + getName() + " says: Meow");
    }

    @Override
    public void feed() {
        System.out.println("Feeding cat " + getName());
    }

    @Override
    public void walk() {
        System.out.println("Walking cat " + getName());
    }

    @Override
    public void play() {
        System.out.println("Playing with cat " + getName());
    }

    @Override
    public void hunting() {
        System.out.println("Cat " + getName() + " goes hunting");
    }
}
