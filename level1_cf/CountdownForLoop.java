//Program to countdown using ForLoop
import java.util.Scanner;
class CountdownForLoop{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get the countdown start value
        System.out.print("Enter the starting value for countdown - ");
        int counter = sc.nextInt();

        // Perform the countdown
        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }

        sc.close();
    }
}
