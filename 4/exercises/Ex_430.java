/*
 * Author: Mark Diez
 * Date: 25 November 2015
 * Ex 4.30
 * Determines if a 5 digit number is a palindrome
 */

import java.util.Scanner;

public class Ex_430 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		boolean palindrome = true;
		int input = 0;

		while(invalidInput(input) == true) {
			System.out.print("Enter a 5 digit integer: ");
			input = scn.nextInt();
		}

		int tenThousandths = input / 10000;
		int thousandths = (input % 10000) / 1000;
		int hundredths = (input % 10000 % 1000) / 100;
		int tenths = (input % 10000 % 1000 % 100) / 10;
		int ones = (input % 10000 % 1000 % 100 % 10);

		if (ones != tenThousandths)
			if(tenths != thousandths)
				palindrome = false;

		if(palindrome == true)
			System.out.printf("%d is a palindrome%n", input);
		else
			System.out.printf("%d is not a palindrome%n", input);

	}

	public static boolean invalidInput(int input) {
		boolean invalid = false;

		// more than 5 digits
		if (input / 10000 >= 10) 
			invalid = true;

		// less than 5 digits
		if (input / 10000 <= 0) 
			invalid = true;

		return invalid;
	}
}