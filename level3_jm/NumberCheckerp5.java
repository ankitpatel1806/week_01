import java.util.Arrays;
import java .util.Scanner;
public class NumberCheckerp5 {

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) return false;  // Numbers less than or equal to 1 are not prime
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;  // Number is divisible by i, hence not prime
            }
        }
        return true;  // Number is prime
    }

    // Method to check if a number is a neon number
    public static boolean isNeon(int number) {
        int square = number * number;
        int sumOfDigits = 0;
        while (square != 0) {
            sumOfDigits += square % 10;
            square /= 10;
        }
        return sumOfDigits == number;
    }

    // Method to check if a number is a spy number
    public static boolean isSpy(int number) {
        int sum = 0;
        int product = 1;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            product *= digit;
            number /= 10;
        }
        return sum == product;
    }

    // Method to check if a number is an automorphic number
    public static boolean isAutomorphic(int number) {
        int square = number * number;
        String squareStr = String.valueOf(square);
        String numberStr = String.valueOf(number);
        return squareStr.endsWith(numberStr);
    }

    // Method to check if a number is a buzz number
    public static boolean isBuzz(int number) {
        return number % 7 == 0 || number % 10 == 7;
    }

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
        int number = sc.nextInt();  // You can change this number to test with other numbers

        // Step 1: Check if the number is prime
        boolean prime = isPrime(number);
        System.out.println("Is " + number + " a prime number? " + prime);

        // Step 2: Check if the number is a neon number
        boolean neon = isNeon(number);
        System.out.println("Is " + number + " a neon number? " + neon);

        // Step 3: Check if the number is a spy number
        boolean spy = isSpy(number);
        System.out.println("Is " + number + " a spy number? " + spy);

        // Step 4: Check if the number is an automorphic number
        boolean automorphic = isAutomorphic(number);
        System.out.println("Is " + number + " an automorphic number? " + automorphic);

        // Step 5: Check if the number is a buzz number
        boolean buzz = isBuzz(number);
        System.out.println("Is " + number + " a buzz number? " + buzz);
    }
}
