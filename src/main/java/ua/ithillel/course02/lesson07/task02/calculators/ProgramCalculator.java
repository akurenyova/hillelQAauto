package ua.ithillel.course02.lesson07.task02.calculators;

public class ProgramCalculator extends BaseCalculator {

    public static String doubleToBin(double number) {
        return Long.toBinaryString(Double.doubleToRawLongBits(number));
    }

    public static String doubleToHex(double number) {
        return Double.toHexString(number);
    }
}
