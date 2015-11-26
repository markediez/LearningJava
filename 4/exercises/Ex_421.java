/*
 * Author: Mark Diez
 * Date: 25 November 2015
 * Ex 4.21
 * Determines biggest integer
 */

// import scanner
import java.util.Scanner;

public class Ex_421 {
	public static void main(String[] args) {
		// initialize scanner, biggest int, and counter
		Scanner scn = new Scanner(System.in);
		int largest;
		int counter = 1;
		int input;

		// prompt for integer
		System.out.print("Enter an integer value: ");
		// set biggest int to integer
		largest = scn.nextInt();

		// while the user has not inputted 10 integers
		while(counter < 10) {
			// prompt for integer
			System.out.print("Enter an integer value: ");
			input = scn.nextInt();

			// test to see if it is bigger than the current biggest
			if (input > largest)
				largest = input;
			
			// add counter
			counter++;
		}
			

		System.out.printf("%nThe biggest integer in the list is %d%n", largest);
	}
}