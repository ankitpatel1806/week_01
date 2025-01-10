//Program to calculate leap with single if else
import java.util.Scanner;

public class LeapYearSingle {
    public static void main(String[] args) {
	
	    // Create Sc object to read input
        Scanner sc = new Scanner(System.in);


        //taking input from user to enter an integer
        System.out.print("Enter a year (>= 1582): ");
        int year = input.nextInt();

        // Ensure the year is in the Gregorian calendar
        if (year >= 1582) {
		
            // Single if condition using logical operators
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println("The year " + year + " is a Leap Year.");
            } else {
                System.out.println("The year " + year + " is not a Leap Year.");
            }
        } else {
            System.out.println("The year " + year + " is not valid as it's before 1582.");
        }
		
		// Close the sc object
        sc.close();
    }
}



