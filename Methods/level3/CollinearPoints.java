package com.gla.Methods.level3;
import java.util.Scanner;
public class CollinearPoints {
    // b. Method using Slope Formula
    public static boolean areCollinearBySlope(
            double x1, double y1,
            double x2, double y2,
            double x3, double y3) {

        // Avoid division by zero by using cross multiplication
        return (y2 - y1) * (x3 - x2) ==
                (y3 - y2) * (x2 - x1);
    }

    // c. Method using Area of Triangle Formula
    public static boolean areCollinearByArea(
            double x1, double y1,
            double x2, double y2,
            double x3, double y3) {

        double area = 0.5 * (
                x1 * (y2 - y3) +
                        x2 * (y3 - y1) +
                        x3 * (y1 - y2)
        );

        return area == 0;
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

        System.out.print("Enter x3 y3: ");
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();

        // Checking collinearity
        boolean slopeResult = areCollinearBySlope(x1, y1, x2, y2, x3, y3);
        boolean areaResult = areCollinearByArea(x1, y1, x2, y2, x3, y3);

        System.out.println("\nUsing Slope Method: " +
                (slopeResult ? "Collinear" : "Not Collinear"));

        System.out.println("Using Area Method: " +
                (areaResult ? "Collinear" : "Not Collinear"));

        sc.close();
    }
}
