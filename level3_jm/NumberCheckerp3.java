import java.util.Arrays;
import java.util.Scanner;
public class NumberCheckerp3 {

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

    // Method to find the sum of the digits of a number
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    // Method to find the sum of the squares of the digits of a number
    public static double sumOfSquaresOfDigits(int[] digits) {
        double sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    // Method to check if the number is a Harshad Number
    public static boolean isHarshadNumber(int number, int[] digits) {
        int sum = sumOfDigits(digits);
        return number % sum == 0;
    }

    // Method to find the frequency of each digit in the number
    public static int[][] digitFrequency(int[] digits) {
        int[] frequency = new int[10]; // To store frequency of digits 0 to 9

        // Count the frequency of each digit
        for (int digit : digits) {
            frequency[digit]++;
        }

        // Create a 2D array to store the digit and its frequency
        int[][] freqArray = new int[10][2];
        for (int i = 0; i < 10; i++) {
            freqArray[i][0] = i;        // Store the digit
            freqArray[i][1] = frequency[i]; // Store the frequency of the digit
        }

        return freqArray;
    }

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();  // You can change this number to test with other numbers
        
        // Step 1: Count digits
        int digitCount = countDigits(number);
        System.out.println("Number of digits in " + number + ": " + digitCount);
        
        // Step 2: Store digits in array
        int[] digits = storeDigits(number);
        System.out.println("Digits of " + number + ": " + Arrays.toString(digits));
        
        // Step 3: Find the sum of the digits
        int sumOfDigits = sumOfDigits(digits);
        System.out.println("Sum of digits: " + sumOfDigits);
        
        // Step 4: Find the sum of the squares of the digits
        double sumOfSquares = sumOfSquaresOfDigits(digits);
        System.out.println("Sum of squares of digits: " + sumOfSquares);
        
        // Step 5: Check if the number is a Harshad Number
        boolean isHarshad = isHarshadNumber(number, digits);
        System.out.println("Is " + number + " a Harshad Number? " + isHarshad);
        
        // Step 6: Find the frequency of each digit
        int[][] frequency = digitFrequency(digits);
        System.out.println("Digit frequency: ");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i][1] > 0) {
                System.out.println("Digit " + frequency[i][0] + " appears " + frequency[i][1] + " time(s)");
            }
        }
    }
}
