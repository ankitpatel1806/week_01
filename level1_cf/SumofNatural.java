//Program to find sum of natrual number
import java.util.Scanner;

class SumofNatural{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		// Taking input 
		System.out.print("Enter the number - ");
		int inputNumber = sc.nextInt();
		
        // Check if the number is a natural number
        if (inputNumber > 0) {
		
            // Calculate the sum of the first n natural numbers
            int sumOfNaturalNumbers = inputNumber * (inputNumber + 1) / 2;
            System.out.println("The sum of the first " + inputNumber + " natural numbers is " + sumOfNaturalNumbers);
        } else {
            System.out.println("The number is not a natural number");
        }
		
		sc.close();
    }
}
