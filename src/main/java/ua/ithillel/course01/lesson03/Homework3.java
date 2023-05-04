package ua.ithillel.course01.lesson03;

import java.util.Scanner;

/* Написать программу простой калькулятор. программа должна принимать с консоли два числа и знак
 * оператора: -,+,/,*,%. математические действия должны выполнятся в отдельный методах. */
public class Homework3 {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("* * * * * Calculator * * * * * ");
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        String answer;

        do {
            System.out.println("Enter first number");
            int number1 = scanner.nextInt();

            System.out.println("Enter second number");
            int number2 = scanner.nextInt();

            System.out.println("Enter operator");
            String operator = scanner.next();

            System.out.println(Calculator.printCalculation(number1, number2, operator));
            System.out.println("Do you want to continue? (y/n)");
            answer = scanner.next();
        }
        while (!(answer.equals("n")));

        System.out.println("* * * * * END * * * * * ");
    }
}
