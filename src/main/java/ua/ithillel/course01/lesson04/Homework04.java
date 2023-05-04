package ua.ithillel.course01.lesson04;

public class Homework04 {
    public static void main(String[] args) {
        Animal defaultAnimal = new Animal();
        Animal herbivorousAnimal = new Animal(true, "some food", 4);
        Cat defaultCat = new Cat(false, "meat", 4);
        Cat garfieldCat = new Cat(false, "purina", 4, "red");

        System.out.println();
        System.out.println("= = = Animals = = =");
        System.out.println();
        System.out.println("Default Animal: " + defaultAnimal);
        System.out.println("Herbivorous Animal: " + herbivorousAnimal);
        System.out.println();
        System.out.println("= = = Cats = = =");
        System.out.println();
        System.out.println("Default Cat: " + defaultCat);
        System.out.println("Garfield Animal: " + garfieldCat);
    }

}
