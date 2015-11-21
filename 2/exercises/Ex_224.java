/**
 * Author: Mark Diez
 * Date: 21 November 2015
 * This program takes 5 integers
 *		and outputs the largest and smallest number
 */

import java.util.Scanner;

public class Ex_224 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		// Get numbers
		System.out.print("Enter 1 of 5 integers: ");
		int num1 = scn.nextInt();

		System.out.print("Enter 2 of 5 integers: ");
		int num2 = scn.nextInt();

		System.out.print("Enter 3 of 5 integers: ");
		int num3 = scn.nextInt();

		System.out.print("Enter 4 of 5 integers: ");
		int num4 = scn.nextInt();

		System.out.print("Enter 5 of 5 integers: ");
		int num5 = scn.nextInt();

		// Get largest
		int largest = num5;
		if (num1 > largest)
			largest = num1;

		if (num2 > largest)
			largest = num2;

		if (num3 > largest)
			largest = num3;

		if (num4 > largest)
			largest = num4;

		// Get smallest
		int smallest = num5;
		if (num1 < smallest)
			smallest = num1;

		if (num2 < smallest)
			smallest = num2;

		if (num3 < smallest)
			smallest = num3;

		if (num4 < smallest)
			smallest = num4;
	
		System.out.printf("Largest number is %d%n", largest);
		System.out.printf("Smallest numbers is %d%n", smallest);
	}
}