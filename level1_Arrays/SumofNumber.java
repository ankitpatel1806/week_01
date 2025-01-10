//Program to calculate Sum upto given Number
import java.util.Scanner;

public class SumofNumber{
    public static void main(String[] args) {
        double[] numbers = new double[10];
        double total = 0.0;  
        int index = 0;      
        Scanner scanner = new Scanner(System.in);

        // Infinite loop to take input until the user enters a 0 or negative number
        while (true) {
            // Take user input
            System.out.print("Enter a number (enter 0 or a negative number to stop): ");
            double input = scanner.nextDouble();
            
            // Check if the input is 0 or negative, or if the array is full
            if (input <= 0 || index == 10) {
                break;  // Exit the loop if input is 0 or negative, or the array is full
            }
            
            // Assign the valid input to the array
            numbers[index] = input;
            index++;  // Increment the index for the next input
        }

        // Calculate the total sum of all entered numbers
        for (int i = 0; i < index; i++) {
            total += numbers[i];  // Add each number to the total
        }

        // Display the entered numbers
        System.out.println("The numbers you entered are:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
        }

        // Display the sum of the numbers
        System.out.println("The total sum of the numbers is: " + total);
        
       
        scanner.close();
    }
}
