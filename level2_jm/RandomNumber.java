import java.util.Arrays;
public class RandomNumber {
    // Method to generate an array of 4-digit random numbers
    public static int[] generate4DigitRandomArray(int size) {
        int[] randomNumbers = new int[size];
        // Generate random 4-digit numbers
        for (int i = 0; i < size; i++) {
            randomNumbers[i] = (int) (Math.random() * 9000) + 1000; // Random 4-digit number
        }
        return randomNumbers;
    }
    // Method to find the average, min, and max values of the array
    public static double[] findAverageMinMax(int[] numbers) {
        double[] results = new double[3];
        // Find the sum of the array for average calculation
        double sum = 0;
        int min = numbers[0];
        int max = numbers[0];
        // Loop through the numbers to find the min, max, and sum
        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        // Calculate the average
        double average = sum / numbers.length;
        results[0] = average;  
        results[1] = min;     
        results[2] = max;      
        return results;
    }
    public static void main(String[] args) {
        int size = 5;  // We need 5 random numbers
        // Generate an array of 5 random 4-digit numbers
        int[] randomNumbers = generate4DigitRandomArray(size);
        // Find the average, min, and max
        double[] results = findAverageMinMax(randomNumbers);
        // Display the results
        System.out.println("Generated 4-digit random numbers: " + Arrays.toString(randomNumbers));
        System.out.println("Average: " + results[0]);
        System.out.println("Minimum: " + results[1]);
        System.out.println("Maximum: " + results[2]);
    }
}
