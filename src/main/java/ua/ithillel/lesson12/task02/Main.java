package ua.ithillel.lesson12.task02;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static ua.ithillel.lesson12.task02.Circle.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("\n*** Lesson 10 *** Task 2 ***\n");

        System.out.println("* Array List:");
        List<String> peopleInCircleArrayList = createPeopleArrayList(10);
        System.out.println("People in the Circle: " + peopleInCircleArrayList);

        long timeArrayList = System.nanoTime();
        removeEverySecondPersonsFromCircle(peopleInCircleArrayList);
        printMethodTime(timeArrayList);

        System.out.println("\n* Linked List:");
        List<String> peopleInCircleLinkedList = createPeopleLinkedList(10);
        System.out.println("People in the Circle: " + peopleInCircleLinkedList);

        long timeLinkedList = System.nanoTime();
        removeEverySecondPersonsFromCircle(peopleInCircleArrayList);
        printMethodTime(timeLinkedList);
    }

    private static void printMethodTime(long time) {
        System.out.println("Method execution time: "
                           + (TimeUnit.NANOSECONDS.convert(System.nanoTime() - time, TimeUnit.NANOSECONDS)));
    }
}
