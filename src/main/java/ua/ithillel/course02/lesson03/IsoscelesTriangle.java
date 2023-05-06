package ua.ithillel.course02.lesson03;

import java.util.Scanner;

import static ua.ithillel.course02.lesson03.utils.ScannerUtil.getValidIntFromScanner;

public class IsoscelesTriangle {

    public static void main(String[] args) {
        System.out.println("\n*** Lesson 3 *** Task 4 ***\n");
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("* Enter first side of a triangle");
            int firstSide = getValidIntFromScanner();
            System.out.println("* Enter second side of a triangle");
            int secondSide = getValidIntFromScanner();
            System.out.println("* Enter third side of a triangle");
            int thirdSide = getValidIntFromScanner();

            if ((firstSide == secondSide) || (firstSide == thirdSide) || (secondSide == thirdSide)) {
                System.out.println("The triangle IS isosceles");
            } else {
                System.out.println("The triangle is NOT isosceles");
            }

            System.out.print("Do you want to continue? (Y/N): ");
        } while (!scanner.nextLine().equalsIgnoreCase("n"));
    }
}
