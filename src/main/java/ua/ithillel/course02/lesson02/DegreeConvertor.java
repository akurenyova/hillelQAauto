package ua.ithillel.course02.lesson02;

import static ua.ithillel.course02.lesson02.util.ScannerUtil.getValidIntFromScanner;

public class DegreeConvertor {

    public static void main(String[] args) {
        System.out.println("\n*** Lesson 2 *** Task 2 ***\n");
        System.out.println("* Enter any degree to convert");

        int celsiusDegree = getValidIntFromScanner();
        double kelvinDegree = celsiusDegree + 273.16;
        double fahrenheitDegree = celsiusDegree * 1.8 + 32;

        System.out.println(celsiusDegree + " Celsius; "
                + fahrenheitDegree + " Fahrenheit; "
                + kelvinDegree + " Kelvin");
    }
}
