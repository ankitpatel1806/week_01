//program to find factor and store in array
import java.util.Scanner;
public class FactorsOfNumber{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number : ");
		int number = scanner.nextInt();
		int maxFactor = 10; 
        int[] factors = new int[maxFactor]; 
        int index = 0; 
        // Find the factors of the number
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                // If i is a factor, add it to the array
                if (index == maxFactor) {
                    // If the array is full, resize it
                    maxFactor *= 2; // Double the size
                    int[] temp = new int[maxFactor]; // Create a temporary array with new size

                    // Copy the contents of the original array to the new array
                    for (int j = 0; j < factors.length; j++) {
                        temp[j] = factors[j];
                    }
                    factors = temp; // Assign the resized array to factors
                }
                factors[index] = i; // Store the factor in the array
                index++; // Increment the index
            }
        }
        // Display the factors of the number
        System.out.print("Factors of " + number + " are: ");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
        scanner.close();
    }
}