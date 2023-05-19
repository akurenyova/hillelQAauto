package ua.ithillel.course02.lesson07.task02.calculators;

public class AccountingCalculator extends BaseCalculator {

    public static double percent(double number1, double number2) {
        System.out.print(number2 + "% from the " + number1 + ": ");
        return number1 * number2 / 100;
    }

    public static double pow(double number1, double number2) {
        return Math.pow(number1, number2);
    }

    public static double sqrt(double number1) {
        return Math.sqrt(number1);
    }

}
