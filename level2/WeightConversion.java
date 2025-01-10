//Program to convert weight in pounds to kilograms.
import java.util.Scanner;

public class WeightConversion {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input the weight in pounds
        System.out.print("Enter the weight in pounds: ");
        double weightInPounds = scanner.nextDouble();

        // Conversion factor: 1 pound = 0.453592 kilograms
        double weightInKilograms = weightInPounds * 0.453592;

        // Display the converted weight
        System.out.println("The weight in kilograms is: " + weightInKilograms);

        // Close the scanner to prevent memory leak
        scanner.close();
    }
}
