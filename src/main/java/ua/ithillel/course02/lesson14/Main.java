package ua.ithillel.course02.lesson14;

import ua.ithillel.course02.lesson08.task01.publications.Book;
import ua.ithillel.course02.lesson08.task01.publications.Magazine;
import ua.ithillel.course02.lesson08.task01.publications.Printable;

import java.util.Arrays;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        System.out.println("\n*** Lesson 14 *** Task 1 ***\n");

        // 1. Створити лямбда вираз для інтерфейсу Printable з дз 8

        Printable printable =  () -> System.out.println("Lambda for Printable\n");
        printable.print();

        // 2. Перробити виклик метода print через посилання на метод

        List<Printable> printables = Arrays.asList(
                new Book("Clean Code"),
                new Book("Java 8"),
                new Magazine("Times"),
                new Magazine("Forbes"));

        printables.forEach(Printable::print);
    }
}
