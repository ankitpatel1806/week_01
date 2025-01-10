//program to convert distance in kilometers to miles using user input
import java.util.Scanner;

public class KmToMilesConverter {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the distance in kilometers
        System.out.print("Enter the distance in kilometers: ");
        double km = input.nextDouble();

        // Convert kilometers to miles (1 mile = 1.6 km)
        double miles = km / 1.6;

        // Output the result
        System.out.println("The total miles is "+ miles +"mile for the given"+ km);

        // Close the scanner object to avoid memory leaks
        input.close();
    }
}
 