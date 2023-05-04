package ua.ithillel.course01.lesson08.animals;

import ua.ithillel.course01.lesson08.Animal;
import ua.ithillel.course01.lesson08.interfaces.WildAnimal;

public class Wolf extends Animal implements WildAnimal {
    public Wolf(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("Wolf " + getName() + " says: Hawoo");
    }

    @Override
    public void hunting() {
        System.out.println("Wolf " + getName() + " goes hunting");
    }
}
