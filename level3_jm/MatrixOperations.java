import java.util.Random;
public class MatrixOperations {
    // Method to create a random matrix of given size (rows x columns)
    public static int[][] createRandomMatrix(int rows, int columns) {
        Random rand = new Random();
        int[][] matrix = new int[rows][columns];        
        // Filling the matrix with random numbers between 1 and 10
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = rand.nextInt(10) + 1; // Random values between 1 and 10
            }
        }
        return matrix;
    }
    // Method to display a matrix
    public static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
    // Method to add two matrices
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int columns = matrix1[0].length;
        int[][] result = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }
    // Method to subtract two matrices
    public static int[][] subtractMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int columns = matrix1[0].length;
        int[][] result = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return result;
    }
    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int columns = matrix2[0].length;
        int[][] result = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = 0;
                for (int k = 0; k < matrix1[0].length; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }
    // Method to find the transpose of a matrix
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[][] transpose = new int[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }
    // Method to find the determinant of a 2x2 matrix
    public static int determinant2x2(int[][] matrix) {
        if (matrix.length == 2 && matrix[0].length == 2) {
            return (matrix[0][0] * matrix[1][1]) - (matrix[0][1] * matrix[1][0]);
        }
        return 0;
    }
    // Method to find the determinant of a 3x3 matrix
    public static int determinant3x3(int[][] matrix) {
        if (matrix.length == 3 && matrix[0].length == 3) {
            return matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1]) -
                   matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0]) +
                   matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
        }
        return 0;
    }
    // Method to find the inverse of a 2x2 matrix
    public static double[][] inverse2x2(int[][] matrix) {
        double[][] inverse = new double[2][2];
        int determinant = determinant2x2(matrix);
        if (determinant != 0) {
            inverse[0][0] = matrix[1][1] / (double) determinant;
            inverse[0][1] = -matrix[0][1] / (double) determinant;
            inverse[1][0] = -matrix[1][0] / (double) determinant;
            inverse[1][1] = matrix[0][0] / (double) determinant;
        }
        return inverse;
    }
    // Method to find the inverse of a 3x3 matrix using the adjoint method
    public static double[][] inverse3x3(int[][] matrix) {
        double[][] inverse = new double[3][3];
        int determinant = determinant3x3(matrix);
        if (determinant != 0) {
            // Adjoint matrix of 3x3
            int[][] adjoint = new int[3][3];
            adjoint[0][0] = matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1];
            adjoint[0][1] = -(matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0]);
            adjoint[0][2] = matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0];
            adjoint[1][0] = -(matrix[0][1] * matrix[2][2] - matrix[0][2] * matrix[2][1]);
            adjoint[1][1] = matrix[0][0] * matrix[2][2] - matrix[0][2] * matrix[2][0];
            adjoint[1][2] = -(matrix[0][0] * matrix[2][1] - matrix[0][1] * matrix[2][0]);
            adjoint[2][0] = matrix[0][1] * matrix[1][2] - matrix[0][2] * matrix[1][1];
            adjoint[2][1] = -(matrix[0][0] * matrix[1][2] - matrix[0][2] * matrix[1][0]);
            adjoint[2][2] = matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
            // Inverse of the matrix is the adjoint divided by the determinant
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    inverse[i][j] = adjoint[i][j] / (double) determinant;
                }
            }
        }
        return inverse;
    }
    public static void main(String[] args) {
        // Example for 2x2 matrix
        int[][] matrix1_2x2 = createRandomMatrix(2, 2);
        int[][] matrix2_2x2 = createRandomMatrix(2, 2);
        System.out.println("Matrix 1 (2x2):");
        displayMatrix(matrix1_2x2);
        System.out.println("Matrix 2 (2x2):");
        displayMatrix(matrix2_2x2);
        // Matrix Operations (2x2)
        System.out.println("\nMatrix Addition (2x2):");
        displayMatrix(addMatrices(matrix1_2x2, matrix2_2x2));
        System.out.println("\nMatrix Subtraction (2x2):");
        displayMatrix(subtractMatrices(matrix1_2x2, matrix2_2x2));
        System.out.println("\nMatrix Multiplication (2x2):");
        displayMatrix(multiplyMatrices(matrix1_2x2, matrix2_2x2));
        System.out.println("\nMatrix Transpose (2x2):");
        displayMatrix(transposeMatrix(matrix1_2x2));
        System.out.println("\nDeterminant of Matrix 1 (2x2): " + determinant2x2(matrix1_2x2));
        System.out.println("\nInverse of Matrix 1 (2x2):");
        double[][] inverse2x2 = inverse2x2(matrix1_2x2);
        displayMatrix(inverse2x2);
        // Example for 3x3 matrix
        int[][] matrix1_3x3 = createRandomMatrix(3, 3);
        int[][] matrix2_3x3 = createRandomMatrix(3, 3);
        System.out.println("\nMatrix 1 (3x3):");
        displayMatrix(matrix1_3x3);
        System.out.println("Matrix 2 (3x3):");
        displayMatrix(matrix2_3x3);
        // Matrix Operations (3x3)
        System.out.println("\nMatrix Addition (3x3):");
        displayMatrix(addMatrices(matrix1_3x3, matrix2_3x3));
        System.out.println("\nMatrix Subtraction (3x3):");
        displayMatrix(subtractMatrices(matrix1_3x3, matrix2_3x3));
        System.out.println("\nMatrix Multiplication (3x3):");
        displayMatrix(multiplyMatrices(matrix1_3x3, matrix2_3x3));
        System.out.println("\nMatrix Transpose (3x3):");
        displayMatrix(transposeMatrix(matrix1_3x3));
        System.out.println("\nDeterminant of Matrix 1 (3x3): " + determinant3x3(matrix1_3x3));
        System.out.println("\nInverse of Matrix 1 (3x3):");
        double[][] inverse3x3 = inverse3x3(matrix1_3x3);
        displayMatrix(inverse3x3);
    }
}
