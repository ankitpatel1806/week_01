public class StudentGradeCalculator {
    public static int[][] generateMarks(int numberOfStudents) {
        int[][] marks = new int[numberOfStudents][3];
        for (int i = 0; i < numberOfStudents; i++) {
            marks[i][0] = (int) (Math.random() * 51) + 50;
            marks[i][1] = (int) (Math.random() * 51) + 50;
            marks[i][2] = (int) (Math.random() * 51) + 50;
        }
        return marks;
    }
    public static double[][] calculatePercentage(int[][] marks) {
        double[][] results = new double[marks.length][4];
        for (int i = 0; i < marks.length; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
            results[i][0] = total;
            results[i][1] = average;
            results[i][2] = percentage;
        }
        return results;
    }
    public static String[][] calculateGrades(double[][] results) {
        String[][] grades = new String[results.length][2];
        for (int i = 0; i < results.length; i++) {
            double percentage = results[i][2];
            String grade = "";
            if (percentage >= 90) grade = "A";
            else if (percentage >= 80) grade = "B";
            else if (percentage >= 70) grade = "C";
            else if (percentage >= 60) grade = "D";
            else grade = "F";
            grades[i][0] = String.valueOf(percentage);
            grades[i][1] = grade;
        }
        return grades;
    }
    public static void main(String[] args) {
        int[][] marks = generateMarks(5);
        double[][] results = calculatePercentage(marks);
        String[][] grades = calculateGrades(results);
        System.out.println("Marks | Total | Average | Percentage | Grade");
        for (int i = 0; i < marks.length; i++) {
            System.out.printf("%d, %d, %d | %.2f | %.2f%% | %s\n",
                    marks[i][0], marks[i][1], marks[i][2],
                    results[i][0], results[i][1], grades[i][1]);
        }
    }
}