package com.gla.Array.level1;
import java.util.Scanner;
public class MeanHeight {




        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            // b. Create double array of size 11
            double[] heights = new double[11];
            double sum = 0.0;

            System.out.println("Enter heights of 11 football players:");

            // Take input and calculate sum
            for (int i = 0; i < heights.length; i++) {
                System.out.print("Enter height of player " + (i + 1) + ": ");
                heights[i] = sc.nextDouble();
                sum += heights[i];   // c. Add to sum
            }

            // d. Calculate mean
            double mean = sum / heights.length;

            System.out.println("\nMean height of players = " + mean);
            sc.close();
        }
        }
