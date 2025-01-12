import java.util.Arrays;
import java.util.Scanner;
public class NumberCheckerp4 {

    // Method to find the count of digits in the number
    public static int countDigits(int number) {
        return String.valueOf(number).length();
    }

    // Method to store the digits of the number in an array
    public static int[] storeDigits(int number) {
        String numberStr = String.valueOf(number);
        int[] digits = new int[numberStr.length()];
        for (int i = 0; i < numberStr.length(); i++) {
            digits[i] = Character.getNumericValue(numberStr.charAt(i));
        }
        return digits;
    }

    // Method to reverse the digits array
    public static int[] reverseArray(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    // Method to compare two arrays and check if they are equal
    public static boolean areArraysEqual(int[] array1, int[] array2) {
        return Arrays.equals(array1, array2);
    }

    // Method to check if a number is a palindrome using the digits array
    public static boolean isPalindrome(int number, int[] digits) {
        int[] reversedDigits = reverseArray(digits);
        return areArraysEqual(digits, reversedDigits);
    }

    // Method to check if a number is a Duck Number using the digits array
    public static boolean isDuckNumber(int[] digits) {
        // A Duck Number must have a non-zero digit other than the first digit
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] != 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
        int number = sc.nextInt();  // You can change this number to test with other numbers
        
        // Step 1: Count digits
        int digitCount = countDigits(number);
        System.out.println("Number of digits in " + number + ": " + digitCount);
        
        // Step 2: Store digits in array
        int[] digits = storeDigits(number);
        System.out.println("Digits of " + number + ": " + Arrays.toString(digits));
        
        // Step 3: Reverse the digits array
        int[] reversedDigits = reverseArray(digits);
        System.out.println("Reversed digits: " + Arrays.toString(reversedDigits));
        
        // Step 4: Check if the number is a palindrome
        boolean isPalindrome = isPalindrome(number, digits);
        System.out.println("Is " + number + " a palindrome? " + isPalindrome);
        
        // Step 5: Check if the number is a Duck Number
        boolean isDuck = isDuckNumber(digits);
        System.out.println("Is " + number + " a Duck Number? " + isDuck);
    }
}
