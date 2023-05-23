package ua.ithillel.course02.lesson07.task01.shapes;

public abstract class Shape implements Comparable<Shape> {

    public String color;

    public abstract double calculateArea();

    public abstract double calculatePerimeter();

    public void paint(String color) {
        this.color = color;
        System.out.println(" is painted into " + color + " color");
    }

    public int compareTo(Shape o) {
        if (this.calculateArea() > o.calculateArea()) return 1;
        if (this.calculateArea() < o.calculateArea()) return -1;
        return 0;
    }
}
