package ua.ithillel.course02.lesson12.task02;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        System.out.println("\n*** Lesson 10 *** Task 2 ***\n");

        System.out.println("* Array List:");
        List<String> peopleInCircleArrayList = Circle.createPeopleArrayList(10);
        System.out.println("People in the Circle: " + peopleInCircleArrayList);

        long timeArrayList = System.nanoTime();
        Circle.removeEverySecondPersonsFromCircle(peopleInCircleArrayList);
        printMethodTime(timeArrayList);

        System.out.println("\n* Linked List:");
        List<String> peopleInCircleLinkedList = Circle.createPeopleLinkedList(10);
        System.out.println("People in the Circle: " + peopleInCircleLinkedList);

        long timeLinkedList = System.nanoTime();
        Circle.removeEverySecondPersonsFromCircle(peopleInCircleArrayList);
        printMethodTime(timeLinkedList);
    }

    private static void printMethodTime(long time) {
        System.out.println("Method execution time: "
                           + (TimeUnit.NANOSECONDS.convert(System.nanoTime() - time, TimeUnit.NANOSECONDS)));
    }
}
