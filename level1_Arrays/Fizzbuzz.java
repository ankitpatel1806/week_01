//Program of fizzbuzz using array

import java.util.Scanner;
public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        if (number > 0) {
            String[] results = new String[number + 1]; // Array size is number + 1 (to include 0)
            for (int i = 0; i <= number; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    results[i] = "FizzBuzz";  // Multiples of both 3 and 5
                } else if (i % 3 == 0) {
                    results[i] = "Fizz";  // Multiples of 3
                } else if (i % 5 == 0) {
                    results[i] = "Buzz";  // Multiples of 5
                } else {
                    results[i] = String.valueOf(i);  // Regular number
                }
            }
            for (int i = 0; i <= number; i++) {
                System.out.println("Position " + (i) + " = " + results[i]);
            }
        } else {
            System.out.println("Please enter a positive integer.");
        }

        scanner.close();
    }
}
