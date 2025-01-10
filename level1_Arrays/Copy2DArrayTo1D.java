//Program to copy array from 2d to 1D
import java.util.Scanner;
public class Copy2DArrayTo1D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int columns = scanner.nextInt();
        int[][] matrix = new int[rows][columns];
        // Take user input for each element of the 2D array
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Element at [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        // Create a 1D array of size rows * columns
        int[] array = new int[rows * columns];
        int index = 0;  // Index for the 1D array
        // Copy elements from the 2D array to the 1D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[index] = matrix[i][j];
                index++;  // Increment the index
            }
        }
        // Display the 2D array
        System.out.println("The 2D Array (Matrix) is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        // Display the 1D array
        System.out.println("The 1D Array after copying elements from 2D array is:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
