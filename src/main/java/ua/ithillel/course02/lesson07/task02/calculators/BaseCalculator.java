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

    public static int div(int number1, int number2) {
        int result = -1;
        try {
            result = number1 / number2;
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed " + e.getMessage());
        }
        return result;
    }
}
