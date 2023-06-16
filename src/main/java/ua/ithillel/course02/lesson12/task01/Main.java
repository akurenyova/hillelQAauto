package ua.ithillel.course02.lesson12.task01;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("\n*** Lesson 12 *** Task 1 ***\n");

        List<Integer> listIncome = DuplicatesUtils.createRandomList(100, 50);
        List<Integer> listOutcome = DuplicatesUtils.deleteDuplicates(listIncome);

        System.out.println("Income list:");
        DuplicatesUtils.printList(listIncome);

        System.out.println("Outcome list:");
        DuplicatesUtils.printList(listOutcome);

        System.out.println("Deleted " + DuplicatesUtils.getListSizeDifference(listIncome, listOutcome) + " duplicates");
    }
}
