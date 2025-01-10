//PROGRAM TO CALCULATE BOUNS OF EMPLOYEES
import java.util.Scanner;

class EmployeeBonus{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking as input Employee's salary and years of service
        System.out.print("Enter the employee's salary - ");
        double salary = sc.nextDouble();

        System.out.print("Enter the employee's years of service -  ");
        int yearsOfService = sc.nextInt();

        // Check if the employee is eligible for the bonus
        if (yearsOfService > 5) {
            // Calculating bonus
            double bonus = salary * 5 / 100;
            System.out.println("Bonus amount is INR " + bonus);
        } else {
            System.out.println("Employee is not eligible for bonus");
        }

        sc.close();
    }
}
