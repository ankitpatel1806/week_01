//program to multiplicatin table in range 6 to 9
import java.util.Scanner;

public class MultiplicationTable6to9{
    public static void main(String[] args) {
	
	// define the object input 
        Scanner scanner = new Scanner(System.in);
        
      // take user scanner for thr number
	  System.out.println(" Enter a number for which you want the multiplication table " );
		 int number= scanner.nextInt();
		 
		 //define an array to store multiplication result
		 int[] multiplicationResult = new int[4];
		 
		// Generate multiplication table for numbers 6 to 9
        for (int i = 0; i < multiplicationResult.length; i++) {
            int multiplier = i + 6; // Multiplier starts from 6
            multiplicationResult[i] = number * multiplier;
        }

        // Display the results
        System.out.println("Multiplication Table:");
        for (int i = 0; i < multiplicationResult.length; i++) {
            int multiplier = i + 6;
            System.out.println(number + " * " + multiplier + " = " + multiplicationResult[i]);
        }


        // Close the scanner objecty
	
        scanner.close();
    }
}