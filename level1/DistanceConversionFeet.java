import java.util.Scanner;

public class DistanceConversionFeet {

    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // ask user for distance in feet
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = scanner.nextDouble();

        // Convert distance to yards (1 yard = 3 feet)
        double distanceInYards = distanceInFeet / 3;

        // Convert distance to miles (1 mile = 1760 yards)
        double distanceInMiles = distanceInYards / 1760;

        // Display the converted distances
        System.out.println("The distance is " + distanceInYards + " yards." );

        // Close the scanner object
        scanner.close();
    }
}
