// program to calculate Average marks 
public class AverageMarksCalculator {

    public static void main(String[] args) {
       

        // User input for marks in each subject
        int marksMaths = 94;
        int marksPhysics = 95;
        int marksChemistry = 96;

        // Calculate total marks and average percentage
        int totalMarks = marksMaths + marksPhysics + marksChemistry;
        double averageMarks = totalMarks / 3.0;
        double averagePercentage = (averageMarks / 100) * 100;

        // Output the result
        System.out.println("Sam’s average mark in PCM is " + averagePercentage + "%");
    }
}
