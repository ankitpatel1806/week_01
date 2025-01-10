//Program to find largest number Amongs three
import java.util.Scanner;

class LargestBetweenThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Takeing input
        System.out.print("Enter the first number -  ");
        int firstNumber = sc.nextInt();

        System.out.print("Enter the second number - ");
        int secondNumber = sc.nextInt();

        System.out.print("Enter the third number -  ");
        int thirdNumber = sc.nextInt();

        // Initialize results
        boolean isFirstLargest = false;
        boolean isSecondLargest = false;
        boolean isThirdLargest = false;

        // Determine largest number
        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            isFirstLargest = true;
        } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            isSecondLargest = true;
        } else if (thirdNumber > firstNumber && thirdNumber > secondNumber) {
            isThirdLargest = true;
        }

        System.out.println("Is the first number the largest? " + isFirstLargest);
        System.out.println("Is the second number the largest? " + isSecondLargest);
        System.out.println("Is the third number the largest? " + isThirdLargest);

        // Close the scanner
        sc.close();
    }
}
