//Program to Calculate Discounted price and Amount for a Course fee
import java.util.Scanner;
public class DiscountCourseFee {

    public static void main(String[] args) {
		// Make scanner object to use in code
		Scanner scanner = new Scanner(System.in);
        // take input and initialize the variables
        double fee = scanner.nextDouble();  
        double discountPercent = scanner.nextDouble();

        // Calculate the discount amount
        double discountAmount = (discountPercent / 100) * fee;

        // Calculate the final fee after applying the discount
        double finalFee = fee - discountAmount;

        // Output the result
        System.out.println("The discount amount is INR " + discountAmount + " and final discounted fee is INR " + finalFee);
    }
}