import java.util.Scanner;
public class BMICalculator {
    // Method to calculate BMI
    public static double calculateBMI(double weight, double heightInCm) {
        double heightInMeters = heightInCm / 100;  // Convert height to meters
        return weight / (heightInMeters * heightInMeters);
    }
    // Method to determine the BMI status
    public static String determineBMIStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 24.9) {
            return "Normal weight";
        } else if (bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Arrays to store the weight, height, and BMI of 10 people
        double[][] bmiData = new double[10][3];
        // Take input for weight and height of 10 people
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (in kg) for person " + (i + 1) + ": ");
            bmiData[i][0] = scanner.nextDouble();  // weight

            System.out.print("Enter height (in cm) for person " + (i + 1) + ": ");
            bmiData[i][1] = scanner.nextDouble();  // height in cm

            // Calculate BMI and store in the array
            bmiData[i][2] = calculateBMI(bmiData[i][0], bmiData[i][1]);
        }
        // Display the results
        System.out.println("\nBMI Data:");
        for (int i = 0; i < 10; i++) {
            double bmi = bmiData[i][2];
            String status = determineBMIStatus(bmi);
            System.out.println("Person :" +(i+1) +" Weight = " +bmiData[i][0] +" kg, Height = "+bmiData[i][1] +" cm, BMI = "+ bmi+" Status =  "+status);
        }
        // Close scanner
        scanner.close();
    }
}
