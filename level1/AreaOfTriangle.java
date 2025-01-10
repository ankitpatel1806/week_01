// program to calculate Area of Triangle in square inches and Centimeter
import java.util.Scanner;
public class AreaOfTriangle{
	public static void main(String[]args){
		// Create a Scanner object to take input from the user
		Scanner scanner = new Scanner(System.in);
		// ask the user to enter the height
        System.out.print("Enter the height : ");
        double heightInches = scanner.nextDouble();
		// ask the user to enter the base of triangle
        System.out.print("Enter the base : ");
        double baseInches = scanner.nextDouble();
		// Calculate the area of the triangle (in square inches)
        double areaInches = 0.5 * baseInches * heightInches;
        System.out.println("The area of the triangle is " + areaInches + " square inches.");

        // Convert area to square centimeters (1 square inch = 6.4516 cm^2)
        double areaCentimeters = areaInches * 6.4516;
        System.out.println("The area of the triangle is " + areaCentimeters + " square centimeters.");

        // Convert height to centimeters, feet, and inches
        double heightCentimeters = heightInches * 2.54; // 1 inch = 2.54 cm
        double heightFeet = heightInches / 12; // 1 foot = 12 inches
        double remainingInches = heightInches % 12; // remaining inches after feet

        // Display height in cm, feet, and inches
        System.out.println("Your height is " + heightCentimeters + " cm, which is " 
                           + heightFeet + " feet and " + remainingInches + " inches.");
        
        // Close the scanner object
        scanner.close();
    }
}
		