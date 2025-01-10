//Program to calculate factor of number
import java.util.Scanner;

public class FactorNumber {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // Get the input value
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        System.out.println("Factors of " + number + " are:");
        
        // Loop to find factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
        
        
        sc.close();
    }
}
