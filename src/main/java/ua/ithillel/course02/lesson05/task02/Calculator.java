package ua.ithillel.course02.lesson05.task02;

public class Calculator {

    public static double sub(double number1, double number2) {
        return number1 - number2;
    }

    public static double sum(double number1, double number2) {
        return number1 + number2;
    }

    public static double mul(double number1, double number2) {
        return number1 * number2;
    }

    public static double div(double number1, double number2) {
        if (number2 == 0) {
            System.out.println("Division by zero is not allowed");
            return -1;
        } else {
            return number1 / number2;
        }
    }

    public static double percent(double number1, double number2) {
        System.out.print(number2 + "% from the " + number1 + ": ");
        return number1 * number2 / 100;
    }
}
