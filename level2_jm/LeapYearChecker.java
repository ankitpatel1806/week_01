import java.util.Scanner;
public class LeapYearChecker {
    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        // Leap year conditions
        return (year >= 1582) && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Take user input for year
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        // Check if year is a leap year
        if (isLeapYear(year)) {
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " is not a Leap Year");
        }
        // Close scanner
        scanner.close();
    }
}
