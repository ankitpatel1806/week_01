//Program to Calculate Discounted price and Amount for a Course fee
public class CourseFeeDiscount {

    public static void main(String[] args) {
        // Declare and initialize the variables
        double fee = 125000;  // Original course fee
        double discountPercent = 10;  // Discount percentage

        // Calculate the discount amount
        double discountAmount = (discountPercent / 100) * fee;

        // Calculate the final fee after applying the discount
        double finalFee = fee - discountAmount;

        // Output the result
        System.out.println("The discount amount is INR " + discountAmount + " and final discounted fee is INR " + finalFee);
    }
}
