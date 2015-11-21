/**
 * Author: Mark Diez
 * Date: 21 November 2015
 * This program outputs if a number is odd or even
 */

import java.util.Scanner;

public class Ex_225 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.print("Enter an integer: ");
		int num = scn.nextInt();

		if((num%2) == 0)
			System.out.println("Number entered is even");
	
		if((num%2) == 1)
			System.out.println("Number entered is odd");
	}
}
