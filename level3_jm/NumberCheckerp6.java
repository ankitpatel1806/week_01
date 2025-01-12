import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class NumberCheckerp6 {

    // Method to find the factors of a number and return them as an array
    public static int[] findFactors(int number) {
        ArrayList<Integer> factorsList = new ArrayList<>();
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                factorsList.add(i);
            }
        }
        // Convert ArrayList to array
        int[] factors = new int[factorsList.size()];
        for (int i = 0; i < factorsList.size(); i++) {
            factors[i] = factorsList.get(i);
        }
        return factors;
    }

    // Method to find the greatest factor of a number using the factors array
    public static int greatestFactor(int[] factors) {
        int greatest = Integer.MIN_VALUE;
        for (int factor : factors) {
            if (factor > greatest) {
                greatest = factor;
            }
        }
        return greatest;
    }

    // Method to find the sum of the factors using the factors array
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find the product of the factors using the factors array
    public static int productOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find the product of the cube of the factors using the factors array
    public static double productOfCubesOfFactors(int[] factors) {
        double product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }

    // Method to check if a number is a perfect number
    public static boolean isPerfectNumber(int number) {
        int[] factors = findFactors(number);
        int sum = sumOfFactors(factors);
        return sum == number;
    }

    // Method to check if a number is an abundant number
    public static boolean isAbundantNumber(int number) {
        int[] factors = findFactors(number);
        int sum = sumOfFactors(factors);
        return sum > number;
    }

    // Method to check if a number is a deficient number
    public static boolean isDeficientNumber(int number) {
        int[] factors = findFactors(number);
        int sum = sumOfFactors(factors);
        return sum < number;
    }

    // Method to check if a number is a strong number
    public static boolean isStrongNumber(int number) {
        int temp = number;
        int sum = 0;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == number;
    }

    // Helper method to calculate the factorial of a number
    private static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
        int number = sc.nextInt();;  // You can change this number to test with other numbers

        // Step 1: Find factors of the number
        int[] factors = findFactors(number);
        System.out.println("Factors of " + number + ": " + Arrays.toString(factors));

        // Step 2: Find the greatest factor
        int greatest = greatestFactor(factors);
        System.out.println("Greatest factor of " + number + ": " + greatest);

        // Step 3: Find the sum of factors
        int sumOfFactors = sumOfFactors(factors);
        System.out.println("Sum of factors of " + number + ": " + sumOfFactors);

        // Step 4: Find the product of factors
        int productOfFactors = productOfFactors(factors);
        System.out.println("Product of factors of " + number + ": " + productOfFactors);

        // Step 5: Find the product of the cube of the factors
        double productOfCubes = productOfCubesOfFactors(factors);
        System.out.println("Product of cubes of factors of " + number + ": " + productOfCubes);

        // Step 6: Check if the number is a perfect number
        boolean isPerfect = isPerfectNumber(number);
        System.out.println("Is " + number + " a perfect number? " + isPerfect);

        // Step 7: Check if the number is an abundant number
        boolean isAbundant = isAbundantNumber(number);
        System.out.println("Is " + number + " an abundant number? " + isAbundant);

        // Step 8: Check if the number is a deficient number
        boolean isDeficient = isDeficientNumber(number);
        System.out.println("Is " + number + " a deficient number? " + isDeficient);

        // Step 9: Check if the number is a strong number
        boolean isStrong = isStrongNumber(number);
        System.out.println("Is " + number + " a strong number? " + isStrong);
    }
}
