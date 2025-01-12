import java.util.Random;
public class EmployeeBonus {
    // Method to generate random salary and years of service for each employee
    public static double[][] generateEmployeeData(int numEmployees) {
        Random rand = new Random();
        double[][] employeeData = new double[numEmployees][2]; // 2D array: [0] - salary, [1] - years of service

        for (int i = 0; i < numEmployees; i++) {
            // Random salary between 50000 and 99999 (5-digit salary)
            employeeData[i][0] = 50000 + (rand.nextDouble() * 50000);
            // Random years of service between 1 and 15 years
            employeeData[i][1] = 1 + rand.nextInt(15);
        }

        return employeeData;
    }
    // Method to calculate the new salary and bonus based on years of service
    public static double[][] calculateNewSalaryAndBonus(double[][] employeeData) {
        double[][] newEmployeeData = new double[employeeData.length][3]; // [0] - new salary, [1] - bonus, [2] - old salary      
        for (int i = 0; i < employeeData.length; i++) {
            double oldSalary = employeeData[i][0];
            double yearsOfService = employeeData[i][1];
            double bonus = 0;
            // Bonus calculation based on years of service
            if (yearsOfService > 5) {
                bonus = 0.05 * oldSalary; // 5% bonus
            } else {
                bonus = 0.02 * oldSalary; // 2% bonus
            }
            // New salary after adding the bonus
            double newSalary = oldSalary + bonus;

            // Store old salary, bonus, and new salary
            newEmployeeData[i][0] = newSalary;
            newEmployeeData[i][1] = bonus;
            newEmployeeData[i][2] = oldSalary;
        }
        return newEmployeeData;
    }
    // Method to calculate the sum of old salary, new salary, and total bonus
    public static void calculateSalariesAndBonuses(double[][] employeeData, double[][] newEmployeeData) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;
        System.out.println("Employee No | Old Salary | Bonus | New Salary");
        System.out.println("------------------------------------------------");
        // Calculate total old salary, new salary, and bonus, and display individual details
        for (int i = 0; i < employeeData.length; i++) {
            double oldSalary = newEmployeeData[i][2];
            double bonus = newEmployeeData[i][1];
            double newSalary = newEmployeeData[i][0];
            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;
            // Print details for each employee
            System.out.printf("%11d | %.2f | %.2f | %.2f\n", (i + 1), oldSalary, bonus, newSalary);
        }
        // Print the total values
        System.out.println("------------------------------------------------");
        System.out.printf("Total Old Salary: %.2f\n", totalOldSalary);
        System.out.printf("Total New Salary: %.2f\n", totalNewSalary);
        System.out.printf("Total Bonus Amount: %.2f\n", totalBonus);
    }
    public static void main(String[] args) {
        int numEmployees = 10; // Number of employees in Zara

        // Step 1: Generate random data for employees
        double[][] employeeData = generateEmployeeData(numEmployees);

        // Step 2: Calculate new salary and bonus for each employee
        double[][] newEmployeeData = calculateNewSalaryAndBonus(employeeData);

        // Step 3: Calculate and display total salary and bonus information
        calculateSalariesAndBonuses(employeeData, newEmployeeData);
    }
}
