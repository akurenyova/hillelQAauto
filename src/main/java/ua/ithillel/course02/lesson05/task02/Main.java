package ua.ithillel.course02.lesson05.task02;

public class Main {
    public static void main(String[] args) {
        double firstValue = 15.5;
        double secondValue = 10;

        System.out.println("\n*** Lesson 5 *** Task 2 ***\n");

        System.out.println("Addition: " + firstValue + " + " + secondValue + " = "
                + Calculator.sum(firstValue, secondValue));
        System.out.println("Subtraction: " + firstValue + " - " + secondValue + " = "
                +  Calculator.sub(firstValue, secondValue));
        System.out.println("Multiplication: " + firstValue + " * " + secondValue + " = "
                +  Calculator.mul(firstValue, secondValue));
        System.out.println("Division: " + firstValue + " / " + secondValue + " = "
                +  Calculator.div(firstValue, secondValue));
        System.out.print("Percentage: ");
        System.out.println(Calculator.percent(firstValue, secondValue));
    }
}
