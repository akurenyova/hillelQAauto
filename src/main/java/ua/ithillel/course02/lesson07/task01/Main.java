package ua.ithillel.course02.lesson07.task01;

import ua.ithillel.course02.lesson07.task01.shapes.*;


public class Main {
    public static void main(String[] args) {

        System.out.println("\n*** Lesson 8 *** Task 3 ***\n");

        String color = "yellow";
        Point pointA = new Point(1, 5);
        Point pointB = new Point(1, 1);
        Point pointC = new Point(5, 1);
        Point pointD = new Point(5, 5);

        Circle circle = new Circle(pointA, 5);
        Triangle triangle = new Triangle(pointA, pointB, pointC);
        Rectangle rectangle = new Rectangle(pointA, pointB, pointC, pointD);

        Shape[] shapes = {circle, triangle, rectangle};

        ShapeUtil.printAreaOfShapes(shapes);
        ShapeUtil.printPerimeterOfShapes(shapes);
        ShapeUtil.paintShapes(shapes, color);
        ShapeUtil.printShapesSortedByArea(shapes);
        ShapeUtil.printIsShapesCircleFitable(shapes);
    }
}
