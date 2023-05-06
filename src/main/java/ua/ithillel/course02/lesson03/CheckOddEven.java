package ua.ithillel.course02.lesson03;

import java.util.Scanner;

import static ua.ithillel.course02.lesson03.utils.ScannerUtil.getValidIntFromScanner;

public class CheckOddEven {

    public static void main(String[] args) {

        System.out.println("\n*** Lesson 3 *** Task 1 ***\n");
        Scanner scanner = new Scanner(System.in);

        do {
            int numberToCheck = getValidIntFromScanner();

            if (numberToCheck % 2 == 0) {
                System.out.println("Even number");
            } else {
                System.out.println("Odd number");
            }

            System.out.print("Do you want to continue? (Y/N): ");

        } while (!scanner.nextLine().equalsIgnoreCase("n"));

        System.out.println("BYE");
    }
}
