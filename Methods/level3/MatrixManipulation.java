package com.gla.Methods.level3;
import java.util.Scanner;
import java.util.Random;
public class MatrixManipulation {
    // a. Method to create a random matrix
    public static int[][] createRandomMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10); // 0–9 random numbers
            }
        }
        return matrix;
    }

    // b. Method to add two matrices
    public static int[][] addMatrix(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result[i][j] = A[i][j] + B[i][j];

        return result;
    }

    // c. Method to subtract two matrices
    public static int[][] subtractMatrix(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result[i][j] = A[i][j] - B[i][j];

        return result;
    }

    // d. Method to multiply two matrices
    public static int[][] multiplyMatrix(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = B[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < B.length; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return result;
    }

    // Method to display matrix
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        // Generate random matrices
        int[][] matrixA = createRandomMatrix(rows, cols);
        int[][] matrixB = createRandomMatrix(rows, cols);

        System.out.println("\nMatrix A:");
        displayMatrix(matrixA);

        System.out.println("\nMatrix B:");
        displayMatrix(matrixB);

        // Addition
        System.out.println("\nAddition (A + B):");
        displayMatrix(addMatrix(matrixA, matrixB));

        // Subtraction
        System.out.println("\nSubtraction (A - B):");
        displayMatrix(subtractMatrix(matrixA, matrixB));

        // Multiplication
        System.out.println("\nMultiplication (A x B):");
        displayMatrix(multiplyMatrix(matrixA, matrixB));

        sc.close();
    }
}
