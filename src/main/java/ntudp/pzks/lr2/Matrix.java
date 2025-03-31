package ntudp.pzks.lr2;

import java.util.Scanner;
import java.util.Random;

public class Matrix {
    public static final int MIN_VAL = -100;
    public static final int MAX_VAL = 100;
    public static final int MAX_SIZE = 20;
    public static final int MIN_SIZE = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows (no more than " + MAX_SIZE + "): ");
        int rows = scanner.nextInt();
        while (rows < MIN_SIZE || rows > MAX_SIZE) {
            System.out.println("Error! The number of rows must be between " + MIN_SIZE + " and " + MAX_SIZE);
            System.out.print("Enter the number of rows again: ");
            rows = scanner.nextInt();
        }

        System.out.print("Enter the number of columns (no more than " + MAX_SIZE + "): ");
        int cols = scanner.nextInt();
        while (cols < MIN_SIZE || cols > MAX_SIZE) {
            System.out.println("Error! The number of columns must be between " + MIN_SIZE + " and " + MAX_SIZE);
            System.out.print("Enter the number of columns again: ");
            cols = scanner.nextInt();
        }

        System.out.println("Choose a method to create the matrix:\n" +
                "\t\t1 - Input from keyboard\n" +
                "\t\t2 - Fill with random numbers");
        System.out.print("Your choice: ");
        int choice = scanner.nextInt();
        int[][] matrix = new int[rows][cols];

        while (true) {
            if (choice == 1) {
                fillMatrixManually(scanner, matrix);
                break;
            } else if (choice == 2) {
                fillMatrixRandomly(matrix);
                break;
            } else {
                System.out.print("Error! Please choose 1 or 2: ");
                choice = scanner.nextInt();
            }
        }

        System.out.println("Matrix:");
        printMatrix(matrix);
        System.out.println("Minimum element: " + findMinValue(matrix));
        System.out.println("Maximum element: " + findMaxValue(matrix));
        System.out.printf("Arithmetic mean: %.2f\n", calcArithmeticMean(matrix));
        System.out.printf("Geometric mean: %.2f\n", calcGeomMean(matrix));

        scanner.close();
    }

    private static void fillMatrixRandomly(int[][] matrix) {
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(MAX_VAL - MIN_VAL + 1) + MIN_VAL;
            }
        }
    }

    private static void fillMatrixManually(Scanner scanner, int[][] matrix) {
        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("Enter element [%d][%d]: ", i + 1, j + 1);
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    private static int findMinValue(int[][] matrix) {
        int minValue = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < minValue) {
                    minValue = matrix[i][j];
                }
            }
        }
        return minValue;
    }

    private static int findMaxValue(int[][] matrix) {
        int maxValue = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > maxValue) {
                    maxValue = matrix[i][j];
                }
            }
        }
        return maxValue;
    }

    private static double calcArithmeticMean(int[][] matrix) {
        double sum = 0;
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
                count++;
            }
        }
        return sum / count;
    }

    private static double calcGeomMean(int[][] matrix) {
        double product = 1;
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                product *= matrix[i][j];
                count++;
            }
        }
        return Math.pow(product, 1.0 / count);
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}