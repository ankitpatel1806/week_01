//Digit Frequency in a Number
import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int[] digits = new int[10];  // Array to store frequency of digits

        // Calculate frequency of digits
        while (number > 0) {
            int digit = number % 10;
            digits[digit]++;
            number /= 10;
        }

        // Display frequency of each digit
        System.out.println("Digit frequencies:");
        for (int i = 0; i < 10; i++) {
            if (digits[i] > 0) {
                System.out.println(i + ": " + digits[i]);
            }
        }
    }
}
