package com.gla.Methods.level3;
import java.util.Random;
public class MatrixOperations {
    // 1. Create Random Matrix
    public static double[][] createRandomMatrix(int rows, int cols) {
        Random rand = new Random();
        double[][] matrix = new double[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(9) + 1; // 1–9 random
            }
        }
        return matrix;
    }

    // 2. Display Matrix
    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }

    // 3. Transpose
    public static double[][] transpose(double[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        double[][] trans = new double[cols][rows];

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                trans[j][i] = matrix[i][j];

        return trans;
    }

    // 4. Determinant of 2x2
    public static double determinant2x2(double[][] m) {
        return (m[0][0] * m[1][1]) - (m[0][1] * m[1][0]);
    }

    // 5. Determinant of 3x3
    public static double determinant3x3(double[][] m) {

        double det =
                m[0][0] * (m[1][1] * m[2][2] - m[1][2] * m[2][1])
                        - m[0][1] * (m[1][0] * m[2][2] - m[1][2] * m[2][0])
                        + m[0][2] * (m[1][0] * m[2][1] - m[1][1] * m[2][0]);

        return det;
    }

    // 6. Inverse of 2x2
    public static double[][] inverse2x2(double[][] m) {

        double det = determinant2x2(m);

        if (det == 0) {
            System.out.println("Inverse not possible (Determinant = 0)");
            return null;
        }

        double[][] inv = new double[2][2];

        inv[0][0] =  m[1][1] / det;
        inv[0][1] = -m[0][1] / det;
        inv[1][0] = -m[1][0] / det;
        inv[1][1] =  m[0][0] / det;

        return inv;
    }

    // 7. Inverse of 3x3
    public static double[][] inverse3x3(double[][] m) {

        double det = determinant3x3(m);

        if (det == 0) {
            System.out.println("Inverse not possible (Determinant = 0)");
            return null;
        }

        double[][] inv = new double[3][3];

        inv[0][0] =  (m[1][1]*m[2][2] - m[1][2]*m[2][1]) / det;
        inv[0][1] = -(m[0][1]*m[2][2] - m[0][2]*m[2][1]) / det;
        inv[0][2] =  (m[0][1]*m[1][2] - m[0][2]*m[1][1]) / det;

        inv[1][0] = -(m[1][0]*m[2][2] - m[1][2]*m[2][0]) / det;
        inv[1][1] =  (m[0][0]*m[2][2] - m[0][2]*m[2][0]) / det;
        inv[1][2] = -(m[0][0]*m[1][2] - m[0][2]*m[1][0]) / det;

        inv[2][0] =  (m[1][0]*m[2][1] - m[1][1]*m[2][0]) / det;
        inv[2][1] = -(m[0][0]*m[2][1] - m[0][1]*m[2][0]) / det;
        inv[2][2] =  (m[0][0]*m[1][1] - m[0][1]*m[1][0]) / det;

        return transpose(inv); // Adjoint method
    }

    // Main Method
    public static void main(String[] args) {

        double[][] matrix2 = createRandomMatrix(2,2);
        double[][] matrix3 = createRandomMatrix(3,3);

        System.out.println("2x2 Matrix:");
        displayMatrix(matrix2);

        System.out.println("Determinant (2x2): " + determinant2x2(matrix2));

        System.out.println("Inverse (2x2):");
        displayMatrix(inverse2x2(matrix2));

        System.out.println("\n3x3 Matrix:");
        displayMatrix(matrix3);

        System.out.println("Determinant (3x3): " + determinant3x3(matrix3));

        System.out.println("Transpose (3x3):");
        displayMatrix(transpose(matrix3));

        System.out.println("Inverse (3x3):");
        displayMatrix(inverse3x3(matrix3));
    }
}
