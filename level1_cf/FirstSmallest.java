//Program smallest number among three
import java.util.Scanner;

public class FirstSmallest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking as input three numbers
        System.out.print("Enter the first number: ");
        int firstNumber = sc.nextInt();
        System.out.print("Enter the second number: ");
        int secondNumber = sc.nextInt();
        System.out.print("Enter the third number: ");
        int thirdNumber = sc.nextInt();
		boolean isFirstSmallest;
        // Check if the first number is the smallest
        if (firstNumber < secondNumber && firstNumber < thirdNumber) {
            isFirstSmallest = true;
        } else {
            isFirstSmallest = false;
        }

		System.out.println("Is the first number the smallest? " + isFirstSmallest);
        sc.close();
    }
}
