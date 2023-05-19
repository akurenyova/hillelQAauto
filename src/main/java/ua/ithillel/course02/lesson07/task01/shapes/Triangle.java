package ua.ithillel.course02.lesson07.task01.shapes;

import ua.ithillel.course02.lesson07.task01.Point;


public class Triangle extends Shape {

    private Point pointA;
    private Point pointB;
    private Point pointC;

    public Triangle(Point pointA, Point pointB, Point pointC) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
    }

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    @Override
    public double calculateArea() {
        return 0.5 * Point.getDistance(pointA, pointB) * Point.getDistance(pointB, pointC);
    }

    @Override
    public double calculatePerimeter() {
        return Point.getDistance(pointA, pointB)
                + Point.getDistance(pointB, pointC)
                + Point.getDistance(pointC, pointA);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Triangle other)) return false;
        return this.pointA.equals(other.pointA)
                && this.pointB.equals(other.pointB)
                && this.pointC.equals(other.pointC);
    }

    @Override
    public int hashCode() {
        int result = 11;
        result = 31 * result + pointA.hashCode();
        result = 31 * result + pointB.hashCode();
        result = 31 * result + pointC.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "pointA=" + pointA +
                ", pointB=" + pointB +
                ", pointC=" + pointC +
                ", color='" + color + '\'' +
                '}';
    }
}
