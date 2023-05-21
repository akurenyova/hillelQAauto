package ua.ithillel.course02.lesson08.task01.publications;

public interface Printable {

    void print();

    static void printArrayOfPrintable(Printable[] printables) {
        for (var printable: printables) {
            printable.print();
        }
        System.out.println();
    }
}
