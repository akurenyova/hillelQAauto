package ua.ithillel.course02.lesson10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Wrappers {

    public static double getTotalEstimationValue(String totalCostEstimationLabelText) {

        double result = -1;
        Pattern pattern = Pattern.compile("[\\d]+.[\\d]+");
        Matcher matcher = pattern.matcher(totalCostEstimationLabelText);

        if (matcher.find()) {
            result = Double.parseDouble(matcher.group());
        }
        return result;
    }

    public static void getAllPrimitivesFromDoubleObject(Double doubleObject) {
        byte myByte = doubleObject.byteValue();
        double myDouble = doubleObject.doubleValue();
        long myLong = doubleObject.longValue();
        int myInt = doubleObject.intValue();
        short myShort = doubleObject.shortValue();
        float myFloat = doubleObject.floatValue();

        System.out.println("Byte value: " + myByte);
        System.out.println("Double value: " + myDouble);
        System.out.println("Long value: " + myLong);
        System.out.println("Int value: " + myInt);
        System.out.println("Short value: " + myShort);
        System.out.println("Float value: " + myFloat);
        System.out.println();
    }
}
