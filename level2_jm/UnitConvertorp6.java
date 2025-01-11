import java.util.Scanner;
public class UnitConverterp6 {
    // Conversion constants
    private static final double FARHENHEIT_TO_CELSIUS = 5.0 / 9.0;
    private static final double CELSIUS_TO_FARHENHEIT = 9.0 / 5.0;
    private static final double POUNDS_TO_KILOGRAMS = 0.453592;
    private static final double KILOGRAMS_TO_POUNDS = 2.20462;
    private static final double GALLONS_TO_LITERS = 3.78541;
    private static final double LITERS_TO_GALLONS = 0.264172;
    // Method to convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * FARHENHEIT_TO_CELSIUS;
    }
    // Method to convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * CELSIUS_TO_FARHENHEIT) + 32;
    }
    // Method to convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        return pounds * POUNDS_TO_KILOGRAMS;
    }
    // Method to convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms * KILOGRAMS_TO_POUNDS;
    }
    // Method to convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        return gallons * GALLONS_TO_LITERS;
    }
    // Method to convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        return liters * LITERS_TO_GALLONS;
    }
    // Main method to test the unit conversions
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		// Test conversion methods
		System.out.print("Enetr value for Fahrenheit : ");
        double fahrenheit = scanner.nextDouble();
		System.out.print("Enter value for celsius : ");
        double celsius = scanner.nextDouble();
		System.out.print("Enter value for pounds : ");
        double pounds = scanner.nextDouble();
		System.out.print("Enter value for kilogram : ");
        double kilograms = scanneer.nextDouble();
		System.out.print("Enter value for gallons : ");
        double gallons = scanneer.nextDouble();
		System.out.print("Enter value for liters : ");
        double liters = scanneer.nextDouble();
		
		// output
        System.out.println(fahrenheit + "°F is equal to " + convertFahrenheitToCelsius(fahrenheit) + "°C.");
        System.out.println(celsius + "°C is equal to " + convertCelsiusToFahrenheit(celsius) + "°F.");
        System.out.println(pounds + " lbs is equal to " + convertPoundsToKilograms(pounds) + " kg.");
        System.out.println(kilograms + " kg is equal to " + convertKilogramsToPounds(kilograms) + " lbs.");
        System.out.println(gallons + " gallons is equal to " + convertGallonsToLiters(gallons) + " liters.");
        System.out.println(liters + " liters is equal to " + convertLitersToGallons(liters) + " gallons.");
    }
}
