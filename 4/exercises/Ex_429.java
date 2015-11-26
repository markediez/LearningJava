/*
 * Author: Mark Diez
 * Date: 25 November 2015
 * Ex 4.29
 * Outputs a hollow square of asterisks between 1 and 20
 */

import java.util.Scanner;

public class Ex_429 {
	public static void main(String[] args) {
		boolean inRange = false;
		Scanner scn = new Scanner(System.in);
		int size = 0;

		// prompt for size
		while (inRange == false) {
			System.out.print("How big do you want the square (between 1 and 20): ");
			size = scn.nextInt();

			if(size > 0)
				if (size <= 20)
					inRange = true;
		}

		// draw square
		int counter = 0;
		while (counter < size) {
			System.out.print("*");
			counter++;
		}

		while(counter > 2) {
			System.out.print("\n*");
			int inner = 0;
			while(inner < size-2) {
				System.out.print(" ");
				inner++;
			}
			System.out.print("*");
			counter--;
		}

		System.out.println();

		if(size > 1) {
			counter = 0;
			while (counter < size) {
				System.out.print("*");
				counter++;
			}
			System.out.println();
		}
	}
}