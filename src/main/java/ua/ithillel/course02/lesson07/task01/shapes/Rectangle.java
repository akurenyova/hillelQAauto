package ua.ithillel.course02.lesson07.task01.shapes;

import ua.ithillel.course02.lesson07.task01.Point;


public class Rectangle extends Shape {

    private Point pointA;
    private Point pointB;
    private Point pointC;
    private Point pointD;

    public Rectangle(Point pointA, Point pointB, Point pointC, Point pointD) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
        this.pointD = pointD;
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

    public Point getPointD() {
        return pointD;
    }

    public void setPointD(Point pointD) {
        this.pointD = pointD;
    }

    @Override
    public double calculateArea() {
        return Point.getDistance(pointA, pointB) * Point.getDistance(pointB, pointC);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (Point.getDistance(pointA, pointB) + Point.getDistance(pointB, pointC));
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Rectangle other)) return false;
        return this.pointA.equals(other.pointA)
                && this.pointB.equals(other.pointB)
                && this.pointC.equals(other.pointC)
                && this.pointD.equals(other.pointD);
    }

    @Override
    public int hashCode() {
        int result = 11;
        result = 31 * result + pointA.hashCode();
        result = 31 * result + pointB.hashCode();
        result = 31 * result + pointC.hashCode();
        result = 31 * result + pointD.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "pointA=" + pointA +
                ", pointB=" + pointB +
                ", pointC=" + pointC +
                ", pointD=" + pointD +
                ", color='" + color + '\'' +
                '}';
    }
}
