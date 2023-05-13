package ua.ithillel.course02.lesson04;

import java.util.Arrays;

import static ua.ithillel.course02.lesson04.EvenToZero.getRandomArray;
import static ua.ithillel.course02.lesson04.EvenToZero.getValidLengthFromScanner;

public class MinMaxNumberInArray {
    public static void main(String[] args) {
        System.out.println("\n*** Lesson 4 *** Task 4 ***\n");

        int[] randomArray = getRandomArray(getValidLengthFromScanner());
        System.out.println("Random array: " + Arrays.toString(randomArray));

        System.out.println("Min value in array: " + minValueInArray(randomArray));
        System.out.println("Max value in array: " + maxValueInArray(randomArray));
    }

    public static int minValueInArray(int[] array) {
        int minValue = array[0];
        for (int j : array) {
            if (j < minValue)
                minValue = j;
        }
        return minValue;
    }

    public static int maxValueInArray(int[] array) {
        int maxValue = array[0];
        for (int j : array) {
            if (j > maxValue)
                maxValue = j;
        }
        return maxValue;
    }
}
