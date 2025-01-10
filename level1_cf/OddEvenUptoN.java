// Program to find odd and Even in range using for loop
import java.util.Scanner;

public class OddEvenUptoN{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a number - ");
        int upperLimit = sc.nextInt();

        // Check if the input is a natural number
        if (upperLimit <= 0) {
            System.out.println("Please enter a natural number");
        } else {
            // Iterate from 1 to the number and check odd/even
            for (int currentNumber = 1; currentNumber <= upperLimit; currentNumber++) {
                if (currentNumber % 2 == 0) {
                    System.out.println(currentNumber + " is an even number");
                } else {
                    System.out.println(currentNumber + " is an odd number");
                }
            }
        }
        sc.close();
    }
}
