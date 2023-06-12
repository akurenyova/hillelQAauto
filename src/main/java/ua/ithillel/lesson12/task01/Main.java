package ua.ithillel.lesson12.task01;

import java.util.List;

import static ua.ithillel.lesson12.task01.DuplicatesUtils.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("\n*** Lesson 12 *** Task 1 ***\n");

        List<Integer> listIncome = createRandomList(100, 50);
        List<Integer> listOutcome = deleteDuplicates(listIncome);

        System.out.println("Income list:");
        printList(listIncome);

        System.out.println("Outcome list:");
        printList(listOutcome);

        System.out.println("Deleted " + getListSizeDifference(listIncome, listOutcome) + " duplicates");
    }
}
