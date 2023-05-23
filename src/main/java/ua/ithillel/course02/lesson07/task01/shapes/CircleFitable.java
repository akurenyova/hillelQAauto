package ua.ithillel.course02.lesson07.task01.shapes;

public interface CircleFitable {

    /**
     * Shapes - Circle, Rectangle, Triangle - fit to circle anyway
     */
    static boolean isCircleFitable(Shape shape) {
        return ((shape instanceof Circle)
                || (shape instanceof Rectangle)
                || (shape instanceof Triangle));
    }
}
