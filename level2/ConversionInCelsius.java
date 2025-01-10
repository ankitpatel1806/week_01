//Program to convert Temperature in Celsius
import java.util.Scanner;

public class ConversionInCelsius {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input temperature in Celsius
        System.out.print("Enter the temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        // Convert Fahrenheit to Celsius using the formula
        double celsiusResult = (fahrenheit - 32) + 5/9;

        // Output the result
        System.out.println(fahrenheit + " Fahrenheit is " + celsiusResult + " Celsius.");

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}