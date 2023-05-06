package ua.ithillel.course02.lesson03;

import java.util.Scanner;

import static ua.ithillel.course02.lesson03.utils.ScannerUtil.getValidIntFromScanner;

public class AbsComparison {
    public static void main(String[] args) {
        System.out.println("\n*** Lesson 3 *** Task 3 ***\n");
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("* Enter first number");
            int firstNumber = getValidIntFromScanner();
            System.out.println("* Enter second number");
            int secondNumber = getValidIntFromScanner();

            if (Math.abs(firstNumber) > Math.abs(secondNumber)) {
                System.out.println("Abs max: " + firstNumber);
            } else {
                System.out.println("Abs max: " + secondNumber);
            }

            System.out.print("Do you want to continue? (Y/N): ");
        } while (!scanner.nextLine().equalsIgnoreCase("n"));
    }
}
