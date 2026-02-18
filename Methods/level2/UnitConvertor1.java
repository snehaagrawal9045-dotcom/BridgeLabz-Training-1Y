package com.gla.Methods.level2;
import java.util.Scanner;
public class UnitConvertor1 {

    // a. Yards to Feet
    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3;
        return yards * yards2feet;
    }

    // b. Feet to Yards
    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }

    // c. Meters to Inches
    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }

    // d. Inches to Meters
    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }

    // e. Inches to Centimeters
    public static double convertInchesToCentimeters(double inches) {
        double inches2cm = 2.54;   // 1 inch = 2.54 cm
        return inches * inches2cm;
    }

    // Main method (Testing)
    public static void main(String[] args) {

        System.out.println("5 yards in feet = " + convertYardsToFeet(5));
        System.out.println("9 feet in yards = " + convertFeetToYards(9));
        System.out.println("2 meters in inches = " + convertMetersToInches(2));
        System.out.println("10 inches in meters = " + convertInchesToMeters(10));
        System.out.println("7 inches in cm = " + convertInchesToCentimeters(7));
    }
}
