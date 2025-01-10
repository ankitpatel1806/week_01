//program to find mean of table
import java.util.Scanner;
public class MeanOfHeight {
    public static void main(String[] args) {
        // Create a double array to store the heights of 11 players
        double[] heights = new double[11];
        double sum = 0.0;
        Scanner scanner = new Scanner(System.in);
        // Get input for the heights of the players
        System.out.println("Enter the heights of 11 players (in meters):");
        for (int i = 0; i < 11; i++) {
            System.out.print("Enter height for player " + (i + 1) + ": ");
            heights[i] = scanner.nextDouble();
			// Add the height to the sum
            sum += heights[i];  
        }
        // Calculate the mean height
        double meanHeight = sum / 11;
        // Display the mean height
        System.out.println("The mean height of the football team is: " + meanHeight + " meters");
        // Close the scanner to avoid resource leakage
        scanner.close();
    }
}
