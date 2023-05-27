package ua.ithillel.course02.lesson07.task01.shapes;

import ua.ithillel.course02.lesson10.Color;

public abstract class Shape implements Comparable<Shape> {

    public Color color;

    public abstract double calculateArea();

    public abstract double calculatePerimeter();

    public void paint(Color color) {
        this.color = color;
        System.out.println(" is painted into " + color
                + " color: " + Integer.toHexString(color.getHexFormat()));
    }

    public int compareTo(Shape o) {
        if (this.calculateArea() > o.calculateArea()) return 1;
        if (this.calculateArea() < o.calculateArea()) return -1;
        return 0;
    }
}
