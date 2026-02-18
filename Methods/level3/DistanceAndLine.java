package com.gla.Methods.level3;
import java.util.Scanner;
public class DistanceAndLine {
    // b. Method to calculate Euclidean Distance
    public static double calculateDistance(
            double x1, double y1,
            double x2, double y2) {

        double distance = Math.sqrt(
                Math.pow(x2 - x1, 2) +
                        Math.pow(y2 - y1, 2)
        );

        return distance;
    }

    // c. Method to calculate slope and intercept
    public static double[] calculateLineEquation(
            double x1, double y1,
            double x2, double y2) {

        double[] result = new double[2];

        // Check for vertical line
        if (x2 - x1 == 0) {
            System.out.println("The line is vertical (x = " + x1 + ")");
            result[0] = Double.POSITIVE_INFINITY;
            result[1] = Double.NaN;
            return result;
        }

        double m = (y2 - y1) / (x2 - x1);  // slope
        double b = y1 - m * x1;            // intercept

        result[0] = m;
        result[1] = b;

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // a. Taking input
        System.out.print("Enter x1 y1: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        System.out.print("Enter x2 y2: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        // Distance
        double distance = calculateDistance(x1, y1, x2, y2);

        // Line Equation
        double[] line = calculateLineEquation(x1, y1, x2, y2);

        System.out.println("\nEuclidean Distance: " + distance);

        if (!Double.isInfinite(line[0])) {
            System.out.println("Slope (m): " + line[0]);
            System.out.println("Y-Intercept (b): " + line[1]);
            System.out.println("Equation of Line: y = "
                    + line[0] + "x + " + line[1]);
        }

        sc.close();
    }
}
