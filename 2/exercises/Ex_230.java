/**
 * Author: Mark Diez
 * Date: 21 November 2015
 * Takes a 5 digit number and separates each digit with a space
 */

import java.util.Scanner;

public class Ex_230 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.print("Enter a 5 digit number: ");
		int num = scn.nextInt();

		int dig1 = num / 10000;
		num = num % 10000;

		int dig2 = num / 1000;
		num = num % 1000;

		int dig3 = num / 100;
		num = num % 100;

		int dig4 = num / 10;
		num = num % 10;

		System.out.printf("%d %d %d %d %d%n",
							dig1, dig2, dig3, dig4, num);
	}
}