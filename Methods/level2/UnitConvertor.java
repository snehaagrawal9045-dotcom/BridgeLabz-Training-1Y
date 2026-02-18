package com.gla.Methods.level2;
import java.util.Scanner;
public class UnitConvertor {
    // a. Kilometers to Miles
    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        return km * km2miles;
    }

    // b. Miles to Kilometers
    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;
        return miles * miles2km;
    }

    // c. Meters to Feet
    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }

    // d. Feet to Meters
    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }

    // Main method for testing
    public static void main(String[] args) {

        System.out.println("10 km in miles = " + convertKmToMiles(10));
        System.out.println("5 miles in km = " + convertMilesToKm(5));
        System.out.println("3 meters in feet = " + convertMetersToFeet(3));
        System.out.println("10 feet in meters = " + convertFeetToMeters(10));
    }
}
