package ua.ithillel.course02.lesson07.task02;

import ua.ithillel.course02.lesson07.task02.calculators.*;

public class Main {

    public static void main(String[] args) {

        int firstValue = 15;
        int secondValue = 0;

        System.out.println("\n*** Lesson 7 *** Task 2 ***\n");

        System.out.println("Values to calculate: " );
        System.out.println("first value = " + firstValue);
        System.out.println("second value = " + secondValue);
        System.out.println();

        System.out.println("1. Base Calculator:");

        System.out.println("Addition: " + firstValue + " + " + secondValue + " = "
                + BaseCalculator.sum(firstValue, secondValue));
        System.out.println("Subtraction: " + firstValue + " - " + secondValue + " = "
                +  BaseCalculator.sub(firstValue, secondValue));
        System.out.println("Multiplication: " + firstValue + " * " + secondValue + " = "
                +  BaseCalculator.mul(firstValue, secondValue));
        System.out.println("Division: " + firstValue + " / " + secondValue + " = "
                +  BaseCalculator.div(firstValue, secondValue));
        System.out.println();

        System.out.println("2. Financial Calculator:");

        System.out.println("Max: " + FinancialCalculator.max(firstValue, secondValue));
        System.out.println("Min: " + FinancialCalculator.min(firstValue, secondValue));
        System.out.println();

        System.out.println("3. Accounting Calculator:");

        System.out.print("Percentage: ");
        System.out.println(AccountingCalculator.percent(firstValue, secondValue));
        System.out.println("Power (second value): " + AccountingCalculator.pow(firstValue, secondValue));
        System.out.println("Square root (first value): " + AccountingCalculator.sqrt(firstValue));
        System.out.println();

        System.out.println("4. Engineering Calculator:");

        System.out.println("Factorial (second value): " + EngineeringCalculator.factorial((int) secondValue));
        System.out.println();

        System.out.println("5. Program Calculator:");

        System.out.println("Double to BIN (first value): " + ProgramCalculator.doubleToBin(firstValue));
        System.out.println("Double to HEX (second value): " + ProgramCalculator.doubleToHex(secondValue));
    }
}
