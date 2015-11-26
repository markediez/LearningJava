/*
 * Author: Mark Diez
 * Date: 25 November 2015
 * Ex 4.23
 * Determines 2 biggest integer
 */

// import scanner
import java.util.Scanner;

public class Ex_421 {
	public static void main(String[] args) {
		// initialize scanner, biggest int, and counter
		Scanner scn = new Scanner(System.in);
		int largest;
		int secondBiggest;
		int counter = 2;
		int input;

		// prompt for integer
		System.out.print("Enter an integer value: ");
		// set biggest int to integer
		largest = scn.nextInt();

		System.out.print("Enter an integer value: ");
		input = scn.nextInt();

		if(input > largest) {
			secondBiggest = largest;
			largest = input;
		} else {
			secondBiggest = input;
		}

		// while the user has not inputted 10 integers
		while(counter < 10) {
			// prompt for integer
			System.out.print("Enter an integer value: ");
			input = scn.nextInt();

			// test to see if it is bigger than the current biggest
			if (input > largest) {
				secondBiggest = largest;
				largest = input;
			} else if (input > secondBiggest)
				secondBiggest  = input;
			// add counter
			counter++;
		}
			

		System.out.printf("%nThe biggest integer in the list is %d%n", largest);
	}
}