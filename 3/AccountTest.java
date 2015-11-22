/*
 * Code from text
 * Driver class to make use of Account.java
 */

import java.util.Scanner;

public class AccountTest {
	public static void main(String[] args) {
		// Get input with scanner
		Scanner scn = new Scanner(System.in);	// argument in scanner tells
												// where to get input from
												// System.in = the keyboard

		// Initialize an account
		Account myAccount = new Account(); // () is required after Account

		// Show inital values of myAccount
		System.out.printf("Initial name is: %s%n%n", myAccount.getName());

		// prompt for and read name
		System.out.println("Please enter the name:");
		String theName = scn.nextLine();
		myAccount.setName(theName);
		System.out.println(); // output blank line

		System.out.printf("Initial name is: %s%n%n", myAccount.getName());
	}
}