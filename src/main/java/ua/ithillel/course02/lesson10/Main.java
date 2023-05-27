package ua.ithillel.course02.lesson10;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n*** Lesson 10 *** Task 1 ***\n");

        System.out.println("* Create Double object using valueOf");
        Double doubleObject = Double.valueOf("48.92");
        System.out.println("Double object have value: " + doubleObject + "\n");

        System.out.println("* Create double type from String using parseDouble");
        String totalCostEstimationLabelText = "Total Estimated Cost: USD 48.92 per 1 month";
        double totalCostEstimation = Wrappers.getTotalEstimationValue(totalCostEstimationLabelText);
        System.out.println("Calculated costs: " + totalCostEstimation + "\n");

        System.out.println("* Convert Double object to all primitive types");
        Wrappers.getAllPrimitivesFromDoubleObject(doubleObject);

        System.out.println("* Literal double type to String");
        String stringFromLiteral = Double.toString(48.92);
        System.out.println("String from literal: " + stringFromLiteral);
    }
}
