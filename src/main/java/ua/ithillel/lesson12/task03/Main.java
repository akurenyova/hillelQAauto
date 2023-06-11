package ua.ithillel.lesson12.task03;

import java.util.List;

import static ua.ithillel.lesson12.task03.ListOrdering.*;

public class Main {
    public static void main(String[] args) {
        int pointOfOrdering = 10;
        System.out.println("\n*** Lesson 12 *** Task 3 ***\n");

        List<Integer> list = fillList(10, 20);
        System.out.println("List: " + list);

        System.out.println("Point of Ordering: " + pointOfOrdering);
        
        List<Integer> listResult = getList(list, pointOfOrdering);
        System.out.println("Result List: " + listResult);
    }
}
