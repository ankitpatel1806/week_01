//Find Largest and Second-Largest Digits
import java.util.Scanner;

public class LargestSecondLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int[] digits = new int[10];
        int index = 0;

        // Extract digits and store in array
        while (number > 0) {
            digits[index] = number % 10;
            number /= 10;
            index++;
        }

        // Find largest and second largest
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);
    }
}
