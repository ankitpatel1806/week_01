import java.util.Scanner;
public class UnitConvertorp5 {
    // Conversion factors
    private static final double YARDS_TO_FEET = 3;
    private static final double FEET_TO_YARDS = 0.333333;
    private static final double METERS_TO_INCHES = 39.3701;
    private static final double INCHES_TO_METERS = 0.0254;
    private static final double INCHES_TO_CM = 2.54;
    // Method to convert yards to feet
    public static double convertYardsToFeet(double yards) {
        return yards * YARDS_TO_FEET;
    }
    // Method to convert feet to yards
    public static double convertFeetToYards(double feet) {
        return feet * FEET_TO_YARDS;
    }
    // Method to convert meters to inches
    public static double convertMetersToInches(double meters) {
        return meters * METERS_TO_INCHES;
    }
    // Method to convert inches to meters
    public static double convertInchesToMeters(double inches) {
        return inches * INCHES_TO_METERS;
    }
    // Method to convert inches to centimeters
    public static double convertInchesToCm(double inches) {
        return inches * INCHES_TO_CM;
    }

    // Main method to demonstrate the UnitConverter functionality
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        // Test the conversion methods
        System.out.print("Enter value in yards : ");
        double yards =scanner.nextDouble() ;
		System.out.print("Enter value in feet : ");
        double feet = scanner.nextDouble();
		System.out.print("Enter value in metre : ");
        double meters = scanner.nextDouble();
		System.out.print("Enter value in inches : ");
        double inches = scanner.nextDouble();

        System.out.println(yards + " yards is equal to " + convertYardsToFeet(yards) + " feet.");
        System.out.println(feet + " feet is equal to " + convertFeetToYards(feet) + " yards.");
        System.out.println(meters + " meters is equal to " + convertMetersToInches(meters) + " inches.");
        System.out.println(inches + " inches is equal to " + convertInchesToMeters(inches) + " meters.");
        System.out.println(inches + " inches is equal to " + convertInchesToCm(inches) + " centimeters.");
    }
}
