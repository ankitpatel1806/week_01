// program to calculate perimeter of Square
import java.util.Scanner;
public class PerimeterOfSquare{
	public static void main(String[]args){
		// Create a Scanner object to take input from the user
		Scanner scanner = new Scanner(System.in);
		// ask the user to enter the SIDE OF SQUARE
        System.out.print("Enter the side of square : ");
        double side = scanner.nextDouble();
		
		// calculate perimeter of Squares
		double perimetre = 4*side;
		System.out.println("The length of the side is " + side +" whose perimeter is "+ perimetre);
	}
}
	