/*
 * Author: Mark Diez
 * Date: 07 December 2015
 * Ex. 5.11
 * finds the smallest value of int based on the integers given
 */

import java.util.Scanner;

public class SmallestValue {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int smallestValue = 0;
		int total = getInt(scn, "How many integers are will you enter?");

		if(total > 0) {
			smallestValue = getInt(scn, "Enter an integer: ");
			for(int i = 1; i < total; i++) {
				int nextValue = getInt(scn, "Enter an integer: ");
				if(nextValue < smallestValue)
					smallestValue = nextValue;
			}
		}

		System.out.printf("Smallest integer entered is: %d", smallestValue);

	}

	public static int getInt(Scanner scn, String msg) {
		System.out.printf("%s ", msg);
		return scn.nextInt();
	}
}