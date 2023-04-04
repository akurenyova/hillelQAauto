package org.example.lesson04;

public class Cat extends Animal{
    private String color;
    private static final String DEFAULT_COLOR = "black";

    public Cat(boolean vegetarian, String eats, int noOfLegs, String color) {
        super(vegetarian, eats, noOfLegs);
        this.color = color;
    }

    public Cat(boolean vegetarian, String eats, int noOfLegs) {
        super(vegetarian, eats, noOfLegs);
        this.color = DEFAULT_COLOR;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Cat {" +
                "vegetarian = " + isVegetarian() +
                ", eats = '" + getEats() + '\'' +
                ", noOfLegs = " + getNoOfLegs() +
                ", color = '" + this.color + '\'' +
                '}';
    }
}
