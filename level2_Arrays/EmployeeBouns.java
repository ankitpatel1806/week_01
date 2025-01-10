//Bonus Calculation for Employees
import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declare arrays for employee data
        double[] salary = new double[10];
        int[] yearsOfService = new int[10];
        double[] newSalary = new double[10];
        double[] bonus = new double[10];

        // Variables for totals
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        // Loop for input
        for (int i = 0; i < 10; i++) {
            // Input salary and years of service with validation
            System.out.print("Enter salary for employee " + (i + 1) + ": ");
            salary[i] = scanner.nextDouble();
            while (salary[i] < 0) {
                System.out.print("Invalid salary. Please enter again: ");
                salary[i] = scanner.nextDouble();
            }

            System.out.print("Enter years of service for employee " + (i + 1) + ": ");
            yearsOfService[i] = scanner.nextInt();
            while (yearsOfService[i] < 0) {
                System.out.print("Invalid years of service. Please enter again: ");
                yearsOfService[i] = scanner.nextInt();
            }

            // Calculate bonus
            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }

            // Calculate new salary
            newSalary[i] = salary[i] + bonus[i];

            // Update totals
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // Display results
        System.out.println("\nTotal bonus payout: " + totalBonus);
        System.out.println("Total old salary: " + totalOldSalary);
        System.out.println("Total new salary: " + totalNewSalary);
    }
}
