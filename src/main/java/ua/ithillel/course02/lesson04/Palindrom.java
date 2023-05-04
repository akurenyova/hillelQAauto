package ua.ithillel.course02.lesson04;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        System.out.println("\n*** Lesson 4 *** Task 3 ***\n");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string to check: ");
        String input = scanner.nextLine();
        String cleanedString = input.replaceAll("[^\\p{IsLetter}]+", "").toLowerCase();
        System.out.println("Cleaned string: " + cleanedString);

        if (isPalindrom(cleanedString)) {
            System.out.println(input + " IS a Palindrom");
        } else {
            System.out.println(input + " is NOT a Palindrom");
        }
    }

    public static boolean isPalindrom(String input) {
        boolean isPalindrom = false;
        char[] arrayFromString = input.toCharArray();
        if (input.length() % 2 == 0) {
            for (int i = 0, j = input.length() - 1; (i < input.length() / 2); i++, j--) {
                isPalindrom = arrayFromString[i] == arrayFromString[j];
            }
        } else {
            for (int i = 0, j = input.length() - 1; (i < (input.length() - 1) / 2); i++, j--) {
                isPalindrom = arrayFromString[i] == arrayFromString[j];
            }
        }
        return isPalindrom;
    }
}
