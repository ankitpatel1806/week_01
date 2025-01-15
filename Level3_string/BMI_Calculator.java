import java.util.Scanner;
public class BMI_Calculator {
    public static String[][] calculateBMI(double[][] weightHeight) {
        String[][] result = new String[10][4];

        for (int i = 0; i < 10; i++) {
            double weight = weightHeight[i][0];
            double heightInCm = weightHeight[i][1];
            double heightInMeters = heightInCm / 100;
            double bmi = weight / (heightInMeters * heightInMeters);
            String status = getStatus(bmi);

            result[i][0] = String.format("%.2f", weight); // Weight
            result[i][1] = String.format("%.2f", heightInCm); // Height in cm
            result[i][2] = String.format("%.2f", bmi); // BMI
            result[i][3] = status; // Status
        }
        return result;
    }
    public static String getStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            return "Normal weight";
        } else if (bmi >= 25 && bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obesity";
        }
    }
    public static void displayBMIResults(String[][] result) {
        System.out.printf("%-10s %-10s %-10s %-20s\n", "Weight", "Height", "BMI", "Status");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%-10s %-10s %-10s %-20s\n", result[i][0], result[i][1], result[i][2], result[i][3]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] weightHeight = new double[10][2];

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter weight (kg) for person " + (i + 1) + ": ");
            weightHeight[i][0] = sc.nextDouble();
            System.out.println("Enter height (cm) for person " + (i + 1) + ": ");
            weightHeight[i][1] = sc.nextDouble();
        }
        String[][] bmiResults = calculateBMI(weightHeight);
        displayBMIResults(bmiResults);
		sc.close();
    }
}
