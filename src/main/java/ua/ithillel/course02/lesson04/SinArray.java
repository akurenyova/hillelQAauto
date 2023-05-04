package ua.ithillel.course02.lesson04;

import static java.lang.Math.sin;

public class SinArray {

    public static void main(String[] args) {
        System.out.println("\n*** Lesson 4 *** Task 1 ***");
        sinArrayPrint();
    }

    public static void sinArrayPrint() {
        int startDergee = 0;
        int endDergee = 360;
        int stepDegree = 10;
        int arrayLength = endDergee / stepDegree + 1;

        double[] array = new double[arrayLength];

        System.out.println("\nArray of sin(x): \n");
        for (int i = 0, j = startDergee; (i < arrayLength || j <= endDergee); i++, j = j + 10) {
            array[i] = sin(j);
            System.out.println(i + 1 + ". sin(" + j + ") = " + sin(j));
        }
    }

}
