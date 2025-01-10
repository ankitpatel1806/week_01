// program to convert height in centimeter to inch
import java.util.Scanner;

public class HeightConverter {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Ask the user to enter their height in centimeters
        System.out.print("Enter your height in centimeters: ");
        double heightCm = input.nextDouble();

        // Conversion factors
        double inchesInOneCm = 1 / 2.54; // 1 inch = 2.54 cm
        double feetInOneCm = inchesInOneCm / 12; // 1 foot = 12 inches

        // Convert height to inches first
        double heightInInches = heightCm * inchesInOneCm;

        // Convert height to feet and inches
        int feet = (int) (heightInInches / 12);  // Calculate whole feet
        int inches = (int) (heightInInches % 12); // Calculate remaining inches

        // Output the results
        System.out.println("Your Height in cm is "+ heightCm + " Your Height in cm is "+ feet +" and inches is " + inches);

        // Close the scanner object to avoid memory leaks
        input.close();
    }
}
