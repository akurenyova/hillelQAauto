package ua.ithillel.course02.lesson08.task01;

import ua.ithillel.course02.lesson08.task01.publications.Book;
import ua.ithillel.course02.lesson08.task01.publications.Magazine;
import ua.ithillel.course02.lesson08.task01.publications.Printable;


public class Main {

    public static void main(String[] args) {

        System.out.println("\n*** Lesson 8 *** Task 1 ***\n");

        Printable[] printables = {
                new Book("Clean Code"),
                new Book("Java 8"),
                new Magazine("Times"),
                new Magazine("Forbes")};

        Printable.printArrayOfPrintable(printables);
        Magazine.printMagazines(printables);
        Book.printMagazines(printables);
    }
}
