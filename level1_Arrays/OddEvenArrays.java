//program to find even and odd and store in array 
import java.util.Scanner;

public class OddEvenArrays {
  public static void main (String[] args){
    
	//take an object for taking a input
   Scanner input =  new Scanner (System.in);
   
    // get user input 
	System.out.print (" Enter the positive number  ");
	int number =  input.nextInt();
	
	//check if the input is natural number 
	if(number<=0) {
	 System.out.println(" erorr: Please enter a natural number greater then 0." );
	 return;
	}
	
	// create arrays for odd and even numbers
	int[] even = new int[number/2 +1];
	int[] odd = new int [number/2+1];
	
	int oddIndex=0, evenIndex =0;
	
	for (int i =1; i<=number; i++) {
	 if (i%2 ==0) {
	    even[evenIndex++] = i; 
            } else {
                odd[oddIndex++] = i;  
            }
        }
	 // Print the odd numbers array
        System.out.print("Odd Numbers: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(odd[i] + " ");
        }
        System.out.println();

        // Print the even numbers array
        System.out.print("Even Numbers: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(even[i] + " ");
        }
        System.out.println();

        // Close the input object
        input.close();
    }
}