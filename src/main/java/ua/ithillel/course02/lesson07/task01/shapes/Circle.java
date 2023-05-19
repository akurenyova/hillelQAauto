package ua.ithillel.course02.lesson07.task01.shapes;

import ua.ithillel.course02.lesson07.task01.Point;


public class Circle extends Shape {

    private Point center;
    private int radius;

    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Circle other)) return false;
        return this.radius == other.radius && this.center.equals(other.center);
    }

    @Override
    public int hashCode() {
        int result = 11;
        result = 31 * result + radius;
        result = 31 * result + center.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
