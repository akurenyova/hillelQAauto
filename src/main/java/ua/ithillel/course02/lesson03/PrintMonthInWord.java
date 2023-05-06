package ua.ithillel.course02.lesson03;

import ua.ithillel.course02.lesson03.enums.Month;

import java.util.Scanner;

import static ua.ithillel.course02.lesson03.utils.ScannerUtil.getValidIntFromScanner;

public class PrintMonthInWord {

    public static void main(String[] args) {

        System.out.println("\n*** Lesson 3 *** Task 2 ***\n");
        Scanner scanner = new Scanner(System.in);

        do {
            int monthNumber = getValidIntFromScanner();
            System.out.print("* Using IF-ELSE: ");
            printMonthInWordIf(monthNumber);
            System.out.print("* Using SWITCH-CASE: ");
            printMonthInWordSwitch(monthNumber);
            System.out.print("Do you want to continue? (Y/N): ");
        } while (!scanner.nextLine().equalsIgnoreCase("n"));
    }

    public static void printMonthInWordIf(int monthNumber) {
        if (monthNumber == 1) {
            System.out.println(Month.JAN);
        } else if (monthNumber == 2) {
            System.out.println(Month.FEB);
        } else if (monthNumber == 3) {
            System.out.println(Month.MAR);
        } else if (monthNumber == 4) {
            System.out.println(Month.APR);
        } else if (monthNumber == 5) {
            System.out.println(Month.MAY);
        } else if (monthNumber == 6) {
            System.out.println(Month.JUN);
        } else if (monthNumber == 7) {
            System.out.println(Month.JUL);
        } else if (monthNumber == 8) {
            System.out.println(Month.AUG);
        } else if (monthNumber == 9) {
            System.out.println(Month.SEP);
        } else if (monthNumber == 10) {
            System.out.println(Month.OCT);
        } else if (monthNumber == 11) {
            System.out.println(Month.NOV);
        } else if (monthNumber == 12) {
            System.out.println(Month.DEC);
        } else {
            System.out.println("Not a valid month");
        }
    }

    public static void printMonthInWordSwitch(int monthNumber) {
        switch (monthNumber) {
            case 1:
                System.out.println(Month.JAN);
                break;
            case 2:
                System.out.println(Month.FEB);
                break;
            case 3:
                System.out.println(Month.MAR);
                break;
            case 4:
                System.out.println(Month.APR);
                break;
            case 5:
                System.out.println(Month.MAY);
                break;
            case 6:
                System.out.println(Month.JUN);
                break;
            case 7:
                System.out.println(Month.JUL);
                break;
            case 8:
                System.out.println(Month.AUG);
                break;
            case 9:
                System.out.println(Month.SEP);
                break;
            case 10:
                System.out.println(Month.OCT);
                break;
            case 11:
                System.out.println(Month.NOV);
                break;
            case 12:
                System.out.println(Month.DEC);
                break;
            default:
                System.out.println("Not a valid month");
        }
    }
}
