package ua.ithillel.course01.lesson08.animals;

public class BigDog extends Dog {
    public BigDog(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("Woow");
    }

    @Override
    public void greets(Dog dog) {
        System.out.println("Woooow");
    }

    public void greets(BigDog bigDog) {
        System.out.println("Woooooooow");
    }
}
