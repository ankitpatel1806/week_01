import java.util.Scanner;

public class CalendarDisplay {

    // Method to get the name of the month
    public static String getMonthName(int month) {
        String[] months = {
            "January", "February", "March", "April", "May", "June", 
            "July", "August", "September", "October", "November", "December"
        };
        return months[month - 1];
    }

    // Method to get the number of days in a month
    public static int getNumberOfDays(int month, int year) {
        // Define the number of days in each month (excluding February)
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        // Check if the month is February (month 2)
        if (month == 2) {
            if (isLeapYear(year)) {
                return 29; // Leap year
            } else {
                return 28; // Non-leap year
            }
        }
        // Return the number of days for months other than February
        return daysInMonth[month - 1];
    }

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        // Leap year condition
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }
        return false;
    }

    // Method to calculate the first day of the month using Gregorian Calendar algorithm
    public static int getFirstDayOfMonth(int month, int year) {
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (1 + x + 31 * m0 / 12) % 7;
        return d0; // Return the weekday (0=Sunday, 1=Monday, ..., 6=Saturday)
    }

    // Method to display the calendar for a given month and year
    public static void displayCalendar(int month, int year) {
        // Get the name of the month and the number of days
        String monthName = getMonthName(month);
        int daysInMonth = getNumberOfDays(month, year);
        int firstDay = getFirstDayOfMonth(month, year);
        
        // Display the month name and year
        System.out.println("         " + monthName + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        
        // Print leading spaces for the first day of the month
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    "); // Add spaces for the days before the first day
        }
        
        // Print the days of the month
        for (int day = 1; day <= daysInMonth; day++) {
            // Print each day, right-justified with a width of 3
            System.out.printf("%3d ", day);
            
            // If Saturday (day 7) is reached, move to the next line
            if ((firstDay + day) % 7 == 0) {
                System.out.println();
            }
        }
        
        // Print a new line if the last line is not completed
        if ((firstDay + daysInMonth) % 7 != 0) {
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Take month and year as input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Get the month and year from the user
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        
        // Display the calendar for the given month and year
        displayCalendar(month, year);
    }
}
