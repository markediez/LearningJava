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
		System.out.printf("%s balance: %.2f%n", 
			acc1.getName(), acc1.getBalance());
		System.out.printf("%s balance: %.2f%n", 
			acc2.getName(), acc2.getBalance());

		// scanner for input
		Scanner input = new Scanner(System.in);

		System.out.print("%nEnter deposit ammount for acc1: ");
		double depositAmount = input.nextDouble();
		System.out.printf("%nadding %.2f to acc1 balance%n%n",
			depositAmount);
		acc1.deposit(depositAmount);

		// display
		System.out.printf("%s balance: %.2f%n", 
			acc1.getName(), acc1.getBalance());
		System.out.printf("%s balance: %.2f%n", 
			acc2.getName(), acc2.getBalance());

		System.out.print("%nEnter deposit ammount for acc2: ");
		depositAmount = input.nextDouble();
		System.out.printf("%nadding %.2f to acc2 balance%n%n",
			depositAmount);
		acc2.deposit(depositAmount);
		
		// display
		System.out.printf("%s balance: %.2f%n", 
			acc1.getName(), acc1.getBalance());
		System.out.printf("%s balance: %.2f%n", 
			acc2.getName(), acc2.getBalance());
	}
}
