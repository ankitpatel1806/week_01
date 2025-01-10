//Program to convert Temperature in Fahrenheit
import java.util.Scanner;

public class ConversionInFahrenheit {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input: temperature in Celsius
        System.out.print("Enter the temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        // Convert Celsius to Fahrenheit using the formula
        double fahrenheitResult = (celsius * 9/5) + 32;

        // Output the result
        System.out.println(celsius + " Celsius is " + fahrenheitResult + " Fahrenheit.");

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
