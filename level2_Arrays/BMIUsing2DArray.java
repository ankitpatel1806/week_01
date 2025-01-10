// BMI Calculation with Multi-Dimensional Array
import java.util.Scanner;

public class BMIUsing2DArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of persons: ");
        int number = scanner.nextInt();

        double[][] personData = new double[number][3];  // 0 = weight, 1 = height, 2 = BMI
        String[] weightStatus = new String[number];

        // Input weight and height
        for (int i = 0; i < number; i++) {
            System.out.print("Enter weight of person " + (i + 1) + ": ");
            personData[i][0] = scanner.nextDouble();
            System.out.print("Enter height of person " + (i + 1) + ": ");
            personData[i][1] = scanner.nextDouble();

            // Calculate BMI
            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);

            // Determine weight status
            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] >= 18.5 && personData[i][2] <= 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (personData[i][2] >= 25 && personData[i][2] <= 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display results
        for (int i = 0; i < number; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");
            System.out.println("Height: " + personData[i][1] + " m");
            System.out.println("Weight: " + personData[i][0] + " kg");
            System.out.println("BMI: " + personData[i][2]);
            System.out.println("Status: " + weightStatus[i]);
        }
    }
}
