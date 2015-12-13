/* 
 * Author: Mark Diez
 * Date: 12 December 2015
 * Ex. 5.32
 * Calculate tax to pay under FairTax
 * info received from www.fairtax.org
 */

import java.util.Scanner;

public class FairTax {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		double tax;
		// 30% b/c tax is inclusive, not exclusive
		double totalExpense = 0.30;

		System.out.println("Enter all your expense:");

		double input = 0.0;
		while(input >= 0) {
			System.out.print("input negative value to quit >> $");

			if(input > 0)
				totalExpense += expense;
		}

		// Calculate tax and show
		System.out.printf("%nYou would pay $%,.2f as federal tax under the Fair Tax Law.%n", totalExpense * tax);
	}
}