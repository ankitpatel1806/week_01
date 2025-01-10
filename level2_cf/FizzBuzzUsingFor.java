// Program of FizzBuzz
import java.util.Scanner;
class FizzBuzzUsingFor{
    public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);

        // Taking as input
        System.out.print("Enter a number to generate FizzBuzz - ");
        int number = sc.nextInt();
		
		//Check if number is less than 0
		if(number<0){
			return;
		}
		
        // Generating FizzBuzz pattern
        for(int sequence=0;sequence<=number;sequence++){
			//Check for the condition if number is divisible by 3 and 5
			if(sequence%3==0 && sequence%5==0){
				System.out.println("FizzBuzz");
			}
			//Check for the condition if number is divisible by 3 
			else if(sequence%3==0){
				System.out.println("Fizz");
			}
			//Check for the condition if number is divisible by 5
			else if(sequence%5==0){
				System.out.println("Buzz");
			}
			else{
				System.out.println(sequence);
			}
		}	
        sc.close();
    }
}