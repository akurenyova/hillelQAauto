package ua.ithillel.course01.lesson08.animals;

import ua.ithillel.course01.lesson08.Animal;
import ua.ithillel.course01.lesson08.interfaces.WildAnimal;

public class Lion extends Animal implements WildAnimal {
    public Lion(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("Lion " + getName() + " says: Roar");
    }

    @Override
    public void hunting() {
        System.out.println("Lion " + getName() + " goes hunting");
    }
}
