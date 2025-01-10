//Student Marks, Percentage, and Grade
import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int number = scanner.nextInt();

        double[][] marks = new double[number][3];
        double[] percentages = new double[number];
        String[] grades = new String[number];

        // Input marks
        for (int i = 0; i < number; i++) {
            System.out.print("Enter marks for Physics, Chemistry, and Math for student " + (i + 1) + ": ");
            for (int j = 0; j < 3; j++) {
                marks[i][j] = scanner.nextDouble();
                while (marks[i][j] < 0) {
                    System.out.print("Invalid marks. Enter positive marks: ");
                    marks[i][j] = scanner.nextDouble();
                }
            }

            // Calculate percentage
            double totalMarks = 0;
            for (int j = 0; j < 3; j++) {
                totalMarks += marks[i][j];
            }
            percentages[i] = (totalMarks / 300) * 100;

            // Calculate grade
            if (percentages[i] >= 90) {
                grades[i] = "A";
            } else if (percentages[i] >= 80) {
                grades[i] = "B";
            } else if (percentages[i] >= 70) {
                grades[i] = "C";
            } else if (percentages[i] >= 60) {
                grades[i] = "D";
            } else {
                grades[i] = "F";
            }
        }

        // Display results
        for (int i = 0; i < number; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");
            System.out.println("Marks: " + marks[i][0] + ", " + marks[i][1] + ", " + marks[i][2]);
            System.out.println("Percentage: " + percentages[i]);
            System.out.println("Grade: " + grades[i]);
        }
    }
}
