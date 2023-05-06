package ua.ithillel.course02.lesson02;

import static ua.ithillel.course02.lesson02.util.ScannerUtil.getValidIntFromScanner;

public class TriangleArea {

    public static void main(String[] args) {
        System.out.println("\n*** Lesson 2 *** Task 3 ***\n");

        System.out.println("* Enter first side of right triangle");
        int firstSide = getValidIntFromScanner();
        System.out.println("* Enter second side of right triangle");
        int secondSide = getValidIntFromScanner();

        double triangleArea = 0.5 * firstSide * secondSide;

        System.out.println("Area of a right triangle: " + triangleArea);
    }
}
