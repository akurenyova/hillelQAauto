package ua.ithillel.course02.lesson03.utils;

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

    public static String getValidWordWithEvenLength() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word to check: ");
        String s = scanner.nextLine();

        while (s.length() % 2 != 0) {
            System.out.printf("\"%s\" is not a valid word.%n", s);
            System.out.print("Enter a word to check: ");
            s = scanner.nextLine();
        }
        return s;
    }
}
