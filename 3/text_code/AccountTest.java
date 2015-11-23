/*
 * Code from text
 * Driver class to make use of Account.java
 */

import java.util.Scanner;

public class AccountTest {
	public static void main(String[] args) {
		Account acc1 = new Account("Jane Green", 50.00);
		Account acc2 = new Account("John Blue", -7.14);

		// display
		displayAccount(acc1);
		displayAccount(acc2);

		// scanner for input
		Scanner input = new Scanner(System.in);

		System.out.printf("%nEnter deposit ammount for acc1: ");
		double depositAmount = input.nextDouble();
		System.out.printf("%nadding %.2f to acc1 balance%n%n",
			depositAmount);
		acc1.deposit(depositAmount);

		// display
		displayAccount(acc1);
		displayAccount(acc2);

		System.out.printf("%nEnter deposit ammount for acc2: ");
		depositAmount = input.nextDouble();
		System.out.printf("%nadding %.2f to acc2 balance%n%n",
			depositAmount);
		acc2.deposit(depositAmount);
		
		// display
		displayAccount(acc1);
		displayAccount(acc2);
	}

	// Exercise 3.15
	public static void displayAccount(Account accountToDisplay) {
		System.out.printf("%s balance: %.2f%n", 
			accountToDisplay.getName(), accountToDisplay.getBalance());
	}
}
