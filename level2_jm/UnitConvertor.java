import java.util.Scanner;
public class UnitConvertor {
    // Conversion factor for kilometers to miles
    private static final double KM_TO_MILES = 0.621371;
    // Conversion factor for miles to kilometers
    private static final double MILES_TO_KM = 1.60934;
    // Conversion factor for meters to feet
    private static final double METERS_TO_FEET = 3.28084;
    // Conversion factor for feet to meters
    private static final double FEET_TO_METERS = 0.3048;
    // Method to convert kilometers to miles
    public static double convertKmToMiles(double km) {
        return km * KM_TO_MILES;
    }
    // Method to convert miles to kilometers
    public static double convertMilesToKm(double miles) {
        return miles * MILES_TO_KM;
    }
    // Method to convert meters to feet
    public static double convertMetersToFeet(double meters) {
        return meters * METERS_TO_FEET;
    }
    // Method to convert feet to meters
    public static double convertFeetToMeters(double feet) {
        return feet * FEET_TO_METERS;
    }
    // Main method to demonstrate the UnitConverter functionality
    public static void main(String[] args) {
        // Test the conversion methods    
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter value in Kilometer : ");
        double km = scanner.nextDouble();
		System.out.print("Enter value in  Miles : ");
        double miles = scanner.nextDouble();
		System.out.print("Enter value in metre :  ");
        double meters = scanner.nextDouble();
		System.out.print("Enter value in Feet : ");
        double feet = scanner.nextDouble();

        System.out.println(km + " kilometers is equal to " + convertKmToMiles(km) + " miles.");
        System.out.println(miles + " miles is equal to " + convertMilesToKm(miles) + " kilometers.");
        System.out.println(meters + " meters is equal to " + convertMetersToFeet(meters) + " feet.");
        System.out.println(feet + " feet is equal to " + convertFeetToMeters(feet) + " meters.");
    }
}
