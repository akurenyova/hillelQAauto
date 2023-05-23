package ua.ithillel.course02.lesson07.task01.shapes;

import java.util.Arrays;

public class ShapeUtil {

    public static void printAreaOfShapes(Shape[] shapes) {
        System.out.println("* Figures' area: ");
        for (var shape: shapes) {
            System.out.println(shape.getClass().getSimpleName() + " has area: "
                    + String.format("%.2f", shape.calculateArea()));
        }
        System.out.println();
    }

    public static void printPerimeterOfShapes(Shape[] shapes) {
        System.out.println("* Figures' perimeter: ");
        for (var shape: shapes) {
            System.out.println(shape.getClass().getSimpleName() + " has perimeter: "
                    + String.format("%.2f", shape.calculatePerimeter()));
        }
        System.out.println();
    }

    public static void paintShapes(Shape[] shapes, String color) {
        System.out.println("* Figures are painted: ");
        for (var shape : shapes) {
            System.out.print(shape.getClass().getSimpleName());
            shape.paint(color);
        }
        System.out.println();
    }

    public static void printShapesSortedByArea(Shape[] shapes) {
        System.out.println("* Sorted by Area: ");
        Arrays.sort(shapes);
        for (var shape : shapes) {
            System.out.println(shape.getClass().getSimpleName() + "'s area = " + shape.calculateArea());
        }
        System.out.println();
    }

    public static void printIsShapesCircleFitable(Shape[] shapes) {
        System.out.println("* Is fitable to Circle: ");
        for (var shape : shapes) {
            System.out.println(shape.getClass().getSimpleName() + " fit to circle = "
                    + CircleFitable.isCircleFitable(shape));
        }
        System.out.println();
    }
}
