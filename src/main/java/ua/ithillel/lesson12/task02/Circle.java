package ua.ithillel.lesson12.task02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Circle {

    public static void removeEverySecondPersonsFromCircle(List<String> peopleInCircle) {
        int peopleInCurrenCircle = peopleInCircle.size();
        int start2IterationFromPerson = 1;
        while (peopleInCurrenCircle > 1) {
            for (int i = start2IterationFromPerson ; i < peopleInCircle.size(); i++) {
                peopleInCircle.remove(i);
                start2IterationFromPerson = (i == peopleInCircle.size() - 1) ? 0 : 1;
            }
            peopleInCurrenCircle = peopleInCircle.size();
        }
        System.out.println("Remaining person in the circle: " + peopleInCircle);
    }

    public static List<String> createPeopleArrayList(int peopleListCapacity) {
        List<String> listResult = new ArrayList<>();
        return fillList(listResult, peopleListCapacity);
    }

    public static List<String> createPeopleLinkedList(int peopleListCapacity) {
        List<String> listResult = new LinkedList<>();
        return fillList(listResult, peopleListCapacity);
    }

    private static List<String> fillList(List<String> listResult, int peopleListCapacity) {
        for (int i = 0; i < peopleListCapacity; i++) {
            listResult.add("Person " + i);
        }
        return listResult;
    }
}
