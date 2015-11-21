/**
 * Author: Mark Diez
 * Date: 21 November 2015
 * gets 5 numbers, tells how many +, -, and 0s
 */

import java.util.Scanner;

public class Ex_232 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

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

		int pos = 0;
		int neg = 0;
		int zero = 0;

		if (num1 > 0)
			pos = pos +1;
		if (num1 < 0)
			neg = neg +1;
		if (num1 == 0)
			zero = zero +1;

		if (num2 > 0)
			pos = pos +1;
		if (num2 < 0)
			neg = neg +1;
		if (num2 == 0)
			zero = zero +1;

		if (num3 > 0)
			pos = pos +1;
		if (num3 < 0)
			neg = neg +1;
		if (num3 == 0)
			zero = zero +1;

		if (num4 > 0)
			pos = pos +1;
		if (num4 < 0)
			neg = neg +1;
		if (num4 == 0)
			zero = zero +1;

		if (num5 > 0)
			pos = pos +1;
		if (num5 < 0)
			neg = neg +1;
		if (num5 == 0)
			zero = zero +1;
		
		System.out.printf("Number of positive input: %d%n", pos);
		System.out.printf("Number of negative input: %d%n", neg);
		System.out.printf("Number of zero input: %d%n", zero);	
	}
}