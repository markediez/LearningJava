/*
 * Author: Mark Diez
 * Date: 07 December 2015
 * Ex. 5.17
 * Calculating Sales application with switch statement
 */

import java.util.Scanner;

public class CalculatingSales {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int prodNum = 0;
		int quantity = 0;
		double total = 0;
		do {
			System.out.print("Enter the product number followed by the quantity, -1 to end: ");

			prodNum = scn.nextInt();

			if(prodNum != -1)
				quantity = scn.nextInt();

			if(prodNum > 0 && quantity > 0) {
				switch(prodNum) {
					case 1:
						total += 2.89 * quantity;
						break;
					case 2:
						total += 4.50 * quantity;
						break;
					case 3:
						total += 9.98 * quantity;
						break;
					case 4:
						total += 4.49 * quantity;
						break;
					case 5:
						total += 6.87 * quantity;
				}
			}

		} while (prodNum != -1 && quantity != -1);

		System.out.printf("%nTotal is $%,.2f%n", total);
	}
}