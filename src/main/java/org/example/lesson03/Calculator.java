package org.example.lesson03;

public class Calculator {

    public static String printCalculation(int number1, int number2, String operator) {
        if (operator.equals("/") && number2 == 0) {
            return "Division by zero is not allowed";
        } else {
            return number1 + " " + operator + " " + number2 + " = " + calculate(number1, number2, operator);
        }
    }

    private static double calculate(int number1, int number2, String operator) {
        double result = 0;
        switch (operator) {
            case "+":
                result = sum(number1, number2);
                break;
            case "-":
                result = sub(number1, number2);
                break;
            case "*":
                result = mul(number1, number2);
                break;
            case "/":
                result = div(number1, number2);
                break;
            case "%":
                result = percent(number1, number2);
                break;
            default:
                System.out.println("Error");
                System.exit(0);
        }
        return result;
    }

    private static int sub(int number1, int number2) {
        return number1 - number2;
    }

    private static int sum(int number1, int number2) {
        return number1 + number2;
    }

    private static int mul(int number1, int number2) {
        return number1 * number2;
    }

    private static double div(int number1, int number2) {
        return (double) number1 / (double) number2;
    }

    private static double percent(int number1, int number2) {
        System.out.print(number2 + "% from the " + number1 + ": ");
        return (double) number1 * number2 / 100;
    }

}

