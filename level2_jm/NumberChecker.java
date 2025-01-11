import java.util.Scanner;
public class NumberChecker {
    // Method to check if the number is positive or negative
    public static String isPositiveOrNegative(int num) {
        if (num > 0) {
            return "Positive";
        } else if (num < 0) {
            return "Negative";
        } else {
            return "Zero";
        }
    }
    // Method to check if the number is even or odd (only for positive numbers)
    public static String isEvenOrOdd(int num) {
        if (num % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }
    // Method to compare two numbers
    public static int compare(int num1, int num2) {
        if (num1 > num2) {
            return 1;
        } else if (num1 < num2) {
            return -1;
        } else {
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        // Take input for 5 numbers
        System.out.println("Enter 5 numbers: ");
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }
        // Loop through the array and check each number
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            String result = isPositiveOrNegative(num);
            System.out.print("Number " + num + " is " + result);

            // If number is positive, check whether it is even or odd
            if (result.equals("Positive")) {
                System.out.print(" and it is " + isEvenOrOdd(num));
            }
            System.out.println();
        }
        // Compare the first and last elements
        int comparisonResult = compare(numbers[0], numbers[4]);
        if (comparisonResult == 1) {
            System.out.println("The first number is greater than the last number.");
        } else if (comparisonResult == -1) {
            System.out.println("The first number is less than the last number.");
        } else {
            System.out.println("The first and last numbers are equal.");
        }
        // Close the scanner
        scanner.close();
    }
}
