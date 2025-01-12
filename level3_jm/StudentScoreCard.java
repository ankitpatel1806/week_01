import java.util.Random;
import java.util.Scanner;
public class StudentScoreCard {
    // Method to generate random 2-digit marks for Physics, Chemistry, and Mathematics for each student
    public static int[][] generateRandomScores(int numStudents) {
        Random rand = new Random();
        int[][] scores = new int[numStudents][3]; // 2D array: [i][0] - Physics, [i][1] - Chemistry, [i][2] - Mathematics

        for (int i = 0; i < numStudents; i++) {
            // Random marks between 50 and 99 for each subject
            scores[i][0] = rand.nextInt(50, 100); // Physics
            scores[i][1] = rand.nextInt(50, 100); // Chemistry
            scores[i][2] = rand.nextInt(50, 100); // Mathematics
        }

        return scores;
    }
    // Method to calculate total, average, and percentage for each student
    public static double[][] calculateTotalAveragePercentage(int[][] scores) {
        double[][] results = new double[scores.length][4]; // 2D array: [i][0] - Total, [i][1] - Average, [i][2] - Percentage

        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2]; // Total marks
            double average = total / 3.0; // Average marks
            double percentage = (total / 300.0) * 100; // Percentage (out of 300)

            // Round off values to 2 decimal places
            results[i][0] = Math.round(total * 100.0) / 100.0;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }

        return results;
    }

    // Method to display the scorecard in a tabular format
    public static void displayScoreCard(int[][] scores, double[][] results) {
        System.out.println("Student No.\tPhysics\tChemistry\tMathematics\tTotal\tAverage\tPercentage");
        System.out.println("-----------------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%11d\t%d\t%d\t%d\t%.2f\t%.2f\t%.2f%%\n",
                              (i + 1),
                              scores[i][0],
                              scores[i][1],
                              scores[i][2],
                              results[i][0],
                              results[i][1],
                              results[i][2]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of students
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        // Step 1: Generate random scores for all students
        int[][] scores = generateRandomScores(numStudents);

        // Step 2: Calculate total, average, and percentage for each student
        double[][] results = calculateTotalAveragePercentage(scores);

        // Step 3: Display the scorecard for all students
        displayScoreCard(scores, results);

        // Close the scanner
        scanner.close();
    }
}
