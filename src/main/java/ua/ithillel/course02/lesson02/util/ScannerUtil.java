package ua.ithillel.course02.lesson02.util;

import java.util.Scanner;

public class ScannerUtil {

    public static int getValidIntFromScanner() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer to check: ");

        while (!scanner.hasNextInt()) {
            String input = scanner.next();
            System.out.printf("\"%s\" is not a valid number.%n", input);
            System.out.print("Enter an integer to check: ");
        }
        return scanner.nextInt();
    }
}
