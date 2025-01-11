import java.util.Scanner;
public class ChocolateDivision {
    // Method to divide chocolates and find the remainder
    public static int[] divideChocolates(int numberOfChocolates, int numberOfChildren) {
        int[] result = new int[2];
        // Find the number of chocolates per child and the remaining chocolates
        result[0] = numberOfChocolates / numberOfChildren; // Chocolates per child
        result[1] = numberOfChocolates % numberOfChildren; // Remaining chocolates
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Taking user input for the number of chocolates and children
        System.out.print("Enter number of chocolates: ");
        int numberOfChocolates = scanner.nextInt();
        System.out.print("Enter number of children: ");
        int numberOfChildren = scanner.nextInt();
        // Find and display the result
        int[] result = divideChocolates(numberOfChocolates, numberOfChildren);
        System.out.println("Chocolates per child: " + result[0]);
        System.out.println("Remaining chocolates: " + result[1]);
        scanner.close();
    }
}
