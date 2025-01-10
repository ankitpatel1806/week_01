//Program to check age for voting 
import java.util.Scanner;
class EligibleToVote{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking age as input
        System.out.print("Enter the person's age: ");
        int age = sc.nextInt(); // Store the input in the age variable

        // Check if the person is eligible to vote
        if (age >= 18) {
            System.out.println("The person's age is " + age + " and can vote");
        } else {
            System.out.println("The person's age is " + age + " and cannot vote");
        }

        sc.close();
    }
}
