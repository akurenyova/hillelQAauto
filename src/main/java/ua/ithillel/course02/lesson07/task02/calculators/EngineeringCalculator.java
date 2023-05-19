package ua.ithillel.course02.lesson07.task02.calculators;

public class EngineeringCalculator extends BaseCalculator {

    public static int factorial(int num){
        int factorial = 1;
        for(int i = 1; i <= num; ++i) {
            factorial *= i;
        }
        return factorial;
    }
}
