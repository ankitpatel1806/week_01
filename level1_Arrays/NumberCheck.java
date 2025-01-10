//program to check number present in array
import java.util.Scanner;

public class NumberCheck{
    public static void main(String[] args) {
	
	// define the object input 
        Scanner input = new Scanner(System.in);
        
        // Define an array to store 5 number
        int[] numbers = new int[5];
		
		 // Loop through to take input for all 5 
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter the number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }
                // Loop through the array to check positive, negative, or zero
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            if (num > 0) {
                System.out.print("The number " + num + " is positive and ");
                if (num % 2 == 0) {
                    System.out.println("it is even.");
                } else {
                    System.out.println("it is odd.");
                }
            } else if (num < 0) {
                System.out.println("The number " + num + " is negative.");
            } else {
                System.out.println("The number " + num + " is zero.");
            }
        }

        // Compare the first and last elements of the array
        int first = numbers[0];
        int last = numbers[numbers.length - 1];

        if (first == last) {
            System.out.println("The first and last elements are equal.");
        } else if (first > last) {
            System.out.println("The first element is greater than the last element.");
        } else {
            System.out.println("The first element is less than the last element.");
        }

        // Close the input objecty
	
        input.close();
    }
}