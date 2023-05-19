package ua.ithillel.course02.lesson07.task02.calculators;

public class BaseCalculator {

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

}
