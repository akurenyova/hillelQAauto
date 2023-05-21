package ua.ithillel.course02.lesson08.task01.publications;

public class Book extends Publication implements Printable {


    public Book(String name) {
        super(name);
    }

    public static void printMagazines(Printable[] printable) {
        for (var p : printable) {
            if (p instanceof Book book) {
                System.out.println("Book: " + book.getName());
            }
        }
        System.out.println();
    }

    @Override
    public void print() {
        System.out.println("Book \"" + super.getName() + "\" is printed");
    }
}
