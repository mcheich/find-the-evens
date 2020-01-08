import java.util.Scanner;

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

	}
	
	public static Integer getInput() {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a positive number.");
		int output = input.nextInt();
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

}
