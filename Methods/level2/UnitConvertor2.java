package com.gla.Methods.level2;
import java.util.Scanner;
public class UnitConvertor2 {

    // a. Fahrenheit to Celsius
    public static double convertFarhenheitToCelsius(double farhenheit) {
        double farhenheit2celsius = (farhenheit - 32) * 5 / 9;
        return farhenheit2celsius;
    }

    // b. Celsius to Fahrenheit
    public static double convertCelsiusToFarhenheit(double celsius) {
        double celsius2farhenheit = (celsius * 9 / 5) + 32;
        return celsius2farhenheit;
    }

    // c. Pounds to Kilograms
    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }

    // d. Kilograms to Pounds
    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }

    // e. Gallons to Liters
    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }

    // f. Liters to Gallons
    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }

    // Main method for testing
    public static void main(String[] args) {

        System.out.println("100 F in Celsius = " + convertFarhenheitToCelsius(100));
        System.out.println("37 C in Fahrenheit = " + convertCelsiusToFarhenheit(37));
        System.out.println("150 pounds in kg = " + convertPoundsToKilograms(150));
        System.out.println("70 kg in pounds = " + convertKilogramsToPounds(70));
        System.out.println("5 gallons in liters = " + convertGallonsToLiters(5));
        System.out.println("10 liters in gallons = " + convertLitersToGallons(10));
    }
}
