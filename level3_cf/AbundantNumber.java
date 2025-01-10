//Program to Check wheather number is AbundantNumber
import java.util.Scanner;
public class AbundantNumber {
    public static void main(String[] args) {
   
        Scanner sc = new Scanner(System.in);
        
 
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        

        int sum = 0;
        
        // Loop through all numbers from 1 to number-1
        for (int i = 1; i < number; i++) {
            // Check if i is a divisor of number
            if (number % i == 0) {
                sum += i;
            }
        }
        
        // Check if the sum of divisors is greater than the number
        if (sum > number) {
            System.out.println("Abundant Number");
        } else {
            System.out.println("Not an Abundant Number");
        }
        
        // Close the scanner object
        sc.close();
    }
}
