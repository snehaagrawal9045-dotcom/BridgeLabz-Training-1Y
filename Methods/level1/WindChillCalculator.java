package com.gla.Methods.level1;
import java.util.Scanner;
public class WindChillCalculator {
    // Method to calculate wind chill
    public static double calculateWindChill(double temperature, double windSpeed) {

        double windChill = 35.74
                + (0.6215 * temperature)
                + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);

        return windChill;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter temperature: ");
        double temperature = sc.nextDouble();

        System.out.print("Enter wind speed: ");
        double windSpeed = sc.nextDouble();

        // Calling method
        double result = calculateWindChill(temperature, windSpeed);

        System.out.println("The Wind Chill Temperature is: " + result);

        sc.close();
    }
}
