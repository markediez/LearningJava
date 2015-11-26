/*
 * Author: Mark Diez
 * Date: 25 November 2015
 * Exercise 4.31
 * Convert binary to decimal
 */

import java.util.Scanner;

public class Ex_431 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.print("Enter a binary number: ");
		int binary = scn.nextInt();

		System.out.printf("Its decimal equivalent is %d%n", getDec(binary));
	}

	public static int getDec(int binaryNumber) {
		int counter = 0;
		int decimal = 0;

		while (binaryNumber > 0) {
			if (binaryNumber % 2 == 1)
				decimal += pow(2, counter);

			binaryNumber /= 10;
			counter++;
		}

		return decimal;
	}

	public static int pow(int base, int exponent) {
		int answer = base;
		if (exponent == 0) {
			answer = 1;
		} else if (exponent == 1) {
			answer = base;
		} else {
			while (exponent > 1) {
				answer *= base;
				exponent--;
			}
		}
		
		return answer;
	}
}