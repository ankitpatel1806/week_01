//Program to CountDown Using While
import java.util.Scanner;

class CountdownWhile{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get the countdown start value from user
        System.out.print("Enter the starting value for countdown - ");
        int counter = sc.nextInt();

        // Countdown
        while (counter >= 1) {
            System.out.println(counter);
            counter--; // Decrementing the counter
        }

        sc.close();
    }
}
