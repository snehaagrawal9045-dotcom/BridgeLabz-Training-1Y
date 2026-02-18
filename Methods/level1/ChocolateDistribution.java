package com.gla.Methods.level1;
import java.util.Scanner;
public class ChocolateDistribution {

    // Method to find chocolates per child and remaining chocolates
    public static int[] findRemainderAndQuotient(int numberOfChocolates, int numberOfChildren) {

        int chocolatesPerChild = numberOfChocolates / numberOfChildren;
        int remainingChocolates = numberOfChocolates % numberOfChildren;

        return new int[]{chocolatesPerChild, remainingChocolates};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter number of chocolates: ");
        int numberOfChocolates = sc.nextInt();

        System.out.print("Enter number of children: ");
        int numberOfChildren = sc.nextInt();

        if (numberOfChildren > 0) {

            // Calling method
            int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

            System.out.println("Each child will get: " + result[0] + " chocolates");
            System.out.println("Remaining chocolates: " + result[1]);

        } else {
            System.out.println("Number of children must be greater than zero.");
        }

        sc.close();
    }
}
