//Program to print table using for loop
import java.util.Scanner;

class GenerateTable{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking as input
        System.out.print("Enter a number to generate its multiplication table - ");
        int number = sc.nextInt();

        // Generating multiplication table of given number
 
        for (int currentMultiplier = 1; currentMultiplier <= 10; currentMultiplier++) {
            System.out.println(number + " x " + currentMultiplier + " = " + (number * currentMultiplier));
        }

        sc.close();
    }
}
