package com.gla.Methods.level1;
import java.util.Scanner;
public class TrigonometricCalculator {

    // Method to calculate trigonometric functions
    public static double[] calculateTrigonometricFunctions(double angle) {

        // Convert degrees to radians
        double radians = Math.toRadians(angle);

        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        return new double[]{sine, cosine, tangent};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter angle in degrees: ");
        double angle = sc.nextDouble();

        // Calling method
        double[] result = calculateTrigonometricFunctions(angle);

        System.out.println("Sine of " + angle + "° = " + result[0]);
        System.out.println("Cosine of " + angle + "° = " + result[1]);
        System.out.println("Tangent of " + angle + "° = " + result[2]);

        sc.close();
    }
}
