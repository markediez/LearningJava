/**
 * Author: Mark Diez
 * Date: 21 November 2015
 * Takes 2 numbers and tells if the first is a multiple of the second
 */

import java.util.Scanner;

public class Ex_226 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.print("Enter first integer: ");
		int num1 = scn.nextInt();

		System.out.print("Enter second integer: ");
		int num2 = scn.nextInt();

		if((num1 % num2) == 0) 
			System.out.printf("%d is a multiple of %d%n", num1, num2);
		
		if((num1 % num2) != 0) 
			System.out.printf("%d is not a multiple of %d%n", num1, num2);
	}
}