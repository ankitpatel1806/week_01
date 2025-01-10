//Program to calculate power of number
import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking sc from user
        System.out.print("Enter the base number: ");
        int number = sc.nextInt();

        System.out.print("Enter the power: ");
        int power = sc.nextInt();

        // Initializing result variable
        int result = 1;

        // Calculating the power using a loop
        for (int i = 1; i <= power; i++) {
            result *= number;
        }

        // Displaying the result
        System.out.println(number + " raised to the power " + power + " is: " + result);

        sc.close();
    }
}
