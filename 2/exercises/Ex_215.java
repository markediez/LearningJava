/**
 * Author: Mark Diez
 * Date: 21 November 2015
 * This program takes 2 integers and outputs 
 *  	its arithmetic solutions
 */

import java.util.Scanner;

public class Ex_215 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Declare variables
		int number1, number2;

		// Prompt and fill variables
		System.out.print("Enter first number >> ");
		number1 = input.nextInt();

		System.out.print("Enter second number >> ");
		number2 = input.nextInt();

		// Output solution
		System.out.printf("%d + %d = %d%n", number1, number2,
							(number1 + number2));
		
		System.out.printf("%d - %d = %d%n", number1, number2,
							(number1 - number2));

		System.out.printf("%d * %d = %d%n", number1, number2,
							(number1 * number2));

		System.out.printf("%d / %d = %d r%d%n", number1, number2,
							(number1 / number2),
							(number1 % number2));
	}
}