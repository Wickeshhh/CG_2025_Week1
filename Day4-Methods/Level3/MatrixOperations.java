
import java.util.Random;

public class MatrixOperations {
    public static int[][] generateMatrix(int rows, int cols) {
        Random random = new Random();
        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(10); // Random values from 0 to 9
            }
        }
        return matrix;
    }

    public static int[][] addMatrices(int[][] a, int[][] b) {
        int rows = a.length, cols = a[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        return result;
    }

    public static int[][] subtractMatrices(int[][] a, int[][] b) {
        int rows = a.length, cols = a[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = a[i][j] - b[i][j];
            }
        }
        return result;
    }

    public static int[][] multiplyMatrices(int[][] a, int[][] b) {
        int rows = a.length, cols = b[0].length, sumLength = a[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < sumLength; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return result;
    }

    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        int[][] transposed = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int elem : row) {
                System.out.printf("%3d ", elem);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrixA = generateMatrix(3, 3);
        int[][] matrixB = generateMatrix(3, 3);

        System.out.println("Matrix A:");
        printMatrix(matrixA);

        System.out.println("Matrix B:");
        printMatrix(matrixB);

        System.out.println("Addition:");
        printMatrix(addMatrices(matrixA, matrixB));

        System.out.println("Subtraction:");
        printMatrix(subtractMatrices(matrixA, matrixB));

        System.out.println("Multiplication:");
        printMatrix(multiplyMatrices(matrixA, matrixB));

        System.out.println("Transpose of A:");
        printMatrix(transposeMatrix(matrixA));
    }
}

