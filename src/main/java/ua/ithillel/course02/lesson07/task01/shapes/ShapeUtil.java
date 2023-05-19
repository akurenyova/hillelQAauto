package ua.ithillel.course02.lesson07.task01.shapes;

public class ShapeUtil {

    public static void printAreaOfShapes(Shape[] shapes) {
        for (var shape: shapes) {
            System.out.println(shape.getClass().getSimpleName() + " has area: "
                    + String.format("%.2f", shape.calculateArea()));
        }
        System.out.println();
    }

    public static void printPerimeterOfShapes(Shape[] shapes) {
        for (var shape: shapes) {
            System.out.println(shape.getClass().getSimpleName() + " has perimeter: "
                    + String.format("%.2f", shape.calculatePerimeter()));
        }
        System.out.println();
    }

    public static void paintShapes(Shape[] shapes, String color) {
        for (var shape : shapes) {
            System.out.print(shape.getClass().getSimpleName());
            shape.paint(color);
        }
        System.out.println();
    }
}
