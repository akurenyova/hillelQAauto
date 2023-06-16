package ua.ithillel.course02.lesson12.task01;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DuplicatesUtils {

    public static List<Integer> createRandomList(int listSize, int limit) {
        List<Integer> listResult = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < listSize; i++) {
            listResult.add(random.nextInt(limit));
        }
        return listResult;
    }

    public static List<Integer> deleteDuplicates(List<Integer> list) {
        List<Integer> listResult = new ArrayList<>();
        for (int s : list) {
            if (!listResult.contains(s)) {
                listResult.add(s);
            }
        }
        return listResult;
    }

    public static int getListSizeDifference(List<Integer> listIncome, List<Integer> listOutcome) {
        return listIncome.size() - listOutcome.size();
    }

    public static void printList(List<Integer> list) {
        System.out.println(list.toString() + "\n");
    }

}
