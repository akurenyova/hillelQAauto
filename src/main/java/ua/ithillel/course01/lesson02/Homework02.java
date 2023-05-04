package ua.ithillel.course01.lesson02;

import java.util.Arrays;
import java.util.Random;

public class Homework02 {
    public static void main(String[] args) {

        int length = 20;
        int sum = 0;
        int[] array = new int[length];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(-100, 100);
        }

        for (int element : array) {
            if (element > 5 && element < 45) {
                sum = sum + element;
            }
        }

        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("Sum of elements > 5 and < 45: " + sum);
        System.out.print("Even positive array numbers: ");

        for (int element : array) {
            if (element > 0 && element % 2 == 0) {
                System.out.print(element + " ");
            }
        }


    }
}
