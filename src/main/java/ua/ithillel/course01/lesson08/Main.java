package ua.ithillel.course01.lesson08;

import ua.ithillel.course01.lesson08.animals.*;
import ua.ithillel.course01.lesson08.interfaces.Pet;
import ua.ithillel.course01.lesson08.interfaces.WildAnimal;

public class Main {
    public static void main(String[] args) {

        Pet cat = new Cat("Tom");
        Pet dog = new Dog("Patron");
        Pet bigDog = new BigDog("Beethoven");
        WildAnimal lion = new Lion("Simba");
        WildAnimal wolf = new Wolf("Akella");

        meetPet(cat);
        System.out.println();
        meetPet(dog);
        System.out.println();
        meetPet(bigDog);

        System.out.println();

        meetWildAnimal(lion);
        meetWildAnimal(wolf);
        meetWildAnimal((WildAnimal) cat);

        System.out.println();

        greetAnimal((Animal) cat);
        greetAnimal((Animal) dog);
        greetAnimal((Animal) lion);
        greetAnimal((Animal) wolf);
        greetAnimal((Animal) bigDog);

        System.out.println();

        BigDog newBigDog = (BigDog) bigDog;
        Dog newDog = (Dog) dog;

        newBigDog.greets();
        newBigDog.greets(newDog);
        newBigDog.greets(newBigDog);

        System.out.println();

        newDog.greets(newDog);

    }

    private static void meetPet(Pet pet) {
        pet.feed();
        pet.walk();
        pet.play();
    }

    private static void meetWildAnimal(WildAnimal wildAnimal) {
        wildAnimal.hunting();
    }

    private static void greetAnimal(Animal animal) {
        animal.greets();
    }

}
