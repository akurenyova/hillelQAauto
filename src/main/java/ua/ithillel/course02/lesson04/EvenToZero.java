package ua.ithillel.course02.lesson04;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class EvenToZero {

    public static void main(String[] args) {
        System.out.println("\n*** Lesson 4 *** Task 2 ***\n");
        int length = getValidLengthFromScanner();
        int[] randomArray = getRandomArray(length);
        System.out.println("Random array: " + Arrays.toString(randomArray));
        int [] arrayWithoutEvens = changeEvenToZeroArray(randomArray);
        System.out.println("Array without even numbers: " + Arrays.toString(arrayWithoutEvens));
    }

    public static int[] changeEvenToZeroArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array[i] = 0;
            }
        }
        return array;
    }

    public static int[] getRandomArray(int length) {
        int[] array = new int[length];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(-100, 100);
        }
        return array;
    }

    static int getValidLengthFromScanner() {

        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.print("Enter length for array: ");
            while (!scanner.hasNextInt()) {
                String input = scanner.next();
                System.out.printf("\"%s\" is not a valid number.%n", input);
                System.out.print("Enter length for array: ");
            }
            number = scanner.nextInt();
            if (number < 0) {
                System.out.printf("\"%s\" is not a valid negative number.%n", number);
            }
        } while (number < 0);
        return number;
    }
}
