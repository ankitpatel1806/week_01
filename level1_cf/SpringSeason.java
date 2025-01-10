//program to check Spring or not 
import java.util.Scanner;

class SpringSeason {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking day and month from user as input
        System.out.print("Enter month - ");
        int month = sc.nextInt();
        System.out.print("Enter day - ");
        int day = sc.nextInt();

        // Check if the date falls in the Spring season
        if ((month == 3 && day >= 20 && day <= 31) || 
            (month == 4) || 
            (month == 5) || 
            (month == 6 && day >= 1 && day <= 20)) {
            System.out.println("It's a Spring Season.");
        } else {
            System.out.println("Not a Spring Season.");
        }

        sc.close();
    }
}
