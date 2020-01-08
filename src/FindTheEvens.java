import java.util.Scanner;
import java.util.function.Supplier;

public class FindTheEvens {

	public static void main(String[] args) {
		
		/* 	Find the evens
			Ask the user for a number. 
			Display all the even numbers from 0 to that number 
			and also keep track of the number of evens you found. 
			
			Hint: you may need to google how to find an even number in Java.

			Examples
			Enter a number:
			8

			2 4 6 8 
			I just found 4 even numbers!
		 */
		
		int userInput = getInput();
		System.out.println(findEvens(userInput));
		System.out.println("I just found " + countEvens(userInput) + " even number(s)!");

	}
	
	public static Integer getInput() {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a positive whole number.");
		int output = input.nextInt();
		
		while(output <= 0 ) {
			System.out.println("The number needs to be positive.");
			output = input.nextInt();
		}
		
		input.close();
		return output;
		 

	}

	public static String findEvens(int i) {
		
		int counter = 2;
		String output = "";
		
		while(counter <= i) {
			
			//Check for evenness
			if(counter%2 == 0) {
				output += Integer.toString(counter) + " ";
			}
			counter++;
		}
		
		return output;
	}

	public static Integer countEvens(int i) {
		
		int counter = 1;
		int numEvens = 0; //count evens 
		
		while(counter <= i) {
			
			if(counter%2 == 0) {
				numEvens++; //increment evens
			}
			counter++;
		}
		return numEvens;
	}

}
