import java.util.Scanner;

public class SumOfNaturalNumbers {
    // Method to find the sum of first n natural numbers
    public static int sumOfNaturalNumbers(int n) {
        int sum = 0;
        // Loop to sum all numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Taking user input for the value of n
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        // Calculate and display the sum
        int sum = sumOfNaturalNumbers(n);
        System.out.println("Sum of first " + n + " natural numbers is: " + sum);
        scanner.close();
    }
}
