import java.util.Scanner;
public class SpringSeason {
    // Method to check if the date falls in Spring Season
    public static boolean isSpringSeason(int month, int day) {
        // Check for dates between March 20 and June 20
        return (month == 3 && day >= 20) || (month > 3 && month < 6) || (month == 6 && day <= 20);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Taking user input for month and day
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter day of the month (1-31): ");
        int day = scanner.nextInt();

        // Check if it's Spring Season and display the result
        if (isSpringSeason(month, day)) {
            System.out.println("It's Spring Season!");
        } else {
            System.out.println("Not Spring Season.");
        }
        scanner.close();
    }
}
