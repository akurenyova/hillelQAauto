package ua.ithillel.course02.lesson13.task02;

import java.util.HashMap;
import java.util.Map;

/*2.    Є рядок із текстом англійською мовою. Виділити всі унікальні слова.
        Для кожного слова підрахувати частоту його входження в текст. Слова, які
        відрізняються регістром літер, вважати різними. Використовувати клас
        HashMap.
*/

public class Main {
    public static void main(String[] args) {
        String testString = "mama myla ramu Mama Myla mama myla ramu Mama Myla mama myla ramu Mama Myla";
        String [] words = testString.split(" ");
        Map<String, Integer> frequencyMap = new HashMap<>();

        for (String word: words) {
            if (!frequencyMap.containsKey(word)) {
                frequencyMap.put(word, 1);
            } else {
                frequencyMap.put(word, frequencyMap.get(word) + 1);
            }
        }

        System.out.println("\n*** Lesson 13 *** Task 2 ***\n");
        System.out.println(frequencyMap);
    }
}
