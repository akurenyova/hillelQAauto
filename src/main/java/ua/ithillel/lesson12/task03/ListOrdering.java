package ua.ithillel.lesson12.task03;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ListOrdering {

    public static List<Integer> getList(List<Integer> list, int pointOfOrdering) {
        int i = 0;
        int counter = 0;
        while (i < list.size() - counter) {
            if (list.get(i) > pointOfOrdering) {
                list.add(list.get(i));
                list.remove(list.get(i));
                counter++;
            } else
                i++;
        }
        return list;
    }

    static List<Integer> fillList(int listSize, int randomLimit) {
        List<Integer> listResult = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < listSize; i++) {
            listResult.add(random.nextInt(randomLimit));
        }
        return listResult;
    }
}
