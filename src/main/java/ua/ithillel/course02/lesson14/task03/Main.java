package ua.ithillel.course02.lesson14.task03;

/*
3. Створити клас User з полями: firstName, secondName, age. Виконати наступні операції:
        a. Створити список з 10 обєктів типу User
        b. відсортувати за віком та записати в нову колекцію
        c. Підрахувати ссередній вік юзерів
        d. Сортувати по декількам властивостям: firstName і age
        e. Перевірити чи є юзери у юких прізвище починаєтся з літери "S' або "А"
        f. Перевірити чи всі юзери старше 18 років
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n*** Lesson 14 *** Task 3 ***\n");

        List<User> userList = Arrays.asList(
            new User("John", "Doe01", 11),
            new User("Anna", "Smith", 22),
            new User("John", "Doe03", 13),
            new User("Will", "Doe04", 11),
            new User("John", "Array", 16),
            new User("Kate", "Doe05", 22),
            new User("John", "Doe07", 17),
            new User("Gray", "Doe08", 58),
            new User("John", "Doe09", 19),
            new User("Mary", "Sunny", 22));

        System.out.println("\n* a) Before Sort:\n");
        printList(userList);

        List<User> newUserList = userList.stream()
                .sorted(Comparator.comparingInt(User::getAge))
                .toList();

        System.out.println("\n* b) After Sort by Age with Stream Saved To New Collection:\n");
        printList(newUserList);

        double averageAge = newUserList.stream()
                .mapToInt(User::getAge)
                .average()
                .orElse(0);

        System.out.println("\n* c) Average age " + averageAge);

        List<User> userSortedByNameAndAge = newUserList.stream()
                .sorted(Comparator.comparing(User::getFirstName).thenComparing(User::getAge))
                .toList();

        System.out.println("\n* d) After Sort by First Name and then by Age:\n");
        printList(userSortedByNameAndAge);

        List<User> usersSecondNames = userSortedByNameAndAge.stream()
                .filter(e -> e.getSecondName().matches("(s|S|a|A){1}.+"))
                .toList();

        System.out.println("\n* e) Users that have Second Name with first letter S or A:\n");
        printList(usersSecondNames);

        List<User> usersAdults = userSortedByNameAndAge.stream()
                .filter(e -> e.getAge() > 18)
                .toList();

        System.out.println("\n* f) Users older than 18:\n");
        printList(usersAdults);
    }

    private static void printList(List<User> userList) {
        userList.forEach(System.out::println);
    }
}
