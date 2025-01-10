//Program to Find number is divisible by 5 or not
import java.util.Scanner;

class DivisibleFive {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        System.out.print("Enter a number - ");
		int inputNumber = sc.nextInt();
		boolean isDivisibleByFive;
		
        // Checking if the number is divisible by 5
        if (inputNumber % 5 == 0) {
            isDivisibleByFive = true;
        } else {
            isDivisibleByFive = false;
        }
		
		System.out.println("Is the number " + inputNumber + " divisible by 5? " + isDivisibleByFive);
		sc.close();
    }
}
