package ua.ithillel.course02.lesson13.task01;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*   1. Є рядок із текстом англійською мовою. Виділити всі унікальні слова.
        Слова, які відрізняються лише регістром букв, вважати однаковими.
        Використовуйте клас HashSet.*/
public class Main {
    public static void main(String[] args){
        String testString = "mama myla ramu Mama Myla mama myla ramu Mama Myla mama myla ramu Mama Myla";
        String [] words = testString.toLowerCase().split(" ");
        Set<String> uniqueWordSet = new HashSet<>(List.of(words));

        System.out.println("\n*** Lesson 13 *** Task 1 ***\n");
        System.out.println(uniqueWordSet);
    }
}
