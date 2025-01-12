import java.util.HashSet;
import java.util.Set;

public class OTPGenerator {

    // Method to generate a 6-digit OTP number
    public static int generateOTP() {
        // Generate a random 6-digit number between 100000 and 999999
        return 100000 + (int)(Math.random() * 900000);
    }

    // Method to check if OTPs are unique
    public static boolean areUniqueOTPs(int[] otps) {
        Set<Integer> otpSet = new HashSet<>();
        for (int otp : otps) {
            otpSet.add(otp);
        }
        // If the size of the set is equal to the array length, it means all OTPs are unique
        return otpSet.size() == otps.length;
    }

    public static void main(String[] args) {
        // Create an array to store the OTP numbers generated 10 times
        int[] otps = new int[10];

        // Generate 10 OTPs and store them in the array
        for (int i = 0; i < otps.length; i++) {
            otps[i] = generateOTP();
            System.out.println("Generated OTP " + (i + 1) + ": " + otps[i]);
        }

        // Check if all the OTPs are unique
        boolean unique = areUniqueOTPs(otps);
        if (unique) {
            System.out.println("\nAll OTPs are unique.");
        } else {
            System.out.println("\nSome OTPs are not unique.");
        }
    }
}
