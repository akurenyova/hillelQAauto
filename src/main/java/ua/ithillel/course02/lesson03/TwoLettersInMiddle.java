package ua.ithillel.course02.lesson03;

import java.util.Scanner;

import static ua.ithillel.course02.lesson03.utils.ScannerUtil.getValidWordWithEvenLength;

public class TwoLettersInMiddle {

    public static void main(String[] args) {
        System.out.println("\n*** Lesson 3 *** Task 5 ***\n");
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("* Enter word with even length");
            String worldWithEvenLength = getValidWordWithEvenLength();

            char[] worldWithEvenLengthArray = worldWithEvenLength.toCharArray();
            int wordLength = worldWithEvenLengthArray.length;

            System.out.print("Two letters in the middle: "
                    + worldWithEvenLengthArray[wordLength / 2 - 1]
                    + worldWithEvenLengthArray[wordLength / 2]);
            System.out.print("\nDo you want to continue? (Y/N): ");
        } while (!scanner.nextLine().equalsIgnoreCase("n"));
    }
}
