package com.gla.Methods.level1;
import java.util.Scanner;
public class TriangularParkRun {
    // Method to calculate number of rounds
    public static double calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;   // Perimeter of triangle
        double totalDistance = 5000;                // 5 km = 5000 meters
        return totalDistance / perimeter;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter side 1 (in meters): ");
        double side1 = sc.nextDouble();

        System.out.print("Enter side 2 (in meters): ");
        double side2 = sc.nextDouble();

        System.out.print("Enter side 3 (in meters): ");
        double side3 = sc.nextDouble();

        // Calling method
        double rounds = calculateRounds(side1, side2, side3);

        // Output
        System.out.println("To complete a 5 km run, the athlete must complete "
                + rounds + " rounds of the park.");

        sc.close();
    }
}
