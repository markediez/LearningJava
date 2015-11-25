/*
 * Author: Mark Diez
 * Date: 25 November 2015
 * Exercise 4.18
 * Person class, used to keep track of a Person's credit
 */

public class Ex_418_Person {
	// instance var
		// acc #, balance, totalMonthExpense, 
		// totalCredit, credLimit
	private int accountNumber;
	private int balance;
	private int totalMonthExpense;
	private int totalCredit;
	private int creditLimit;

	// constructor
		// initialize acc#, initial balance, creditLimit
	public Ex_418_Person(int accountNumber, int balance, int creditLimit) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.creditLimit = creditLimit;
	}

	// methods
		// method to add totalMonthExpense
	public void addExpense(int amount) {
		if (amount > 0)
			totalMonthExpense += amount;
	}

		// method to add credit
	public void addCredit(int amount) {
		if (amount > 0)
			totalCredit += amount;
	}

		// method to display status
	public void displayStatus() {
		balance += totalMonthExpense - totalCredit;
		System.out.printf("New balance is: %d%n", balance);

		if (balance > creditLimit)
			System.out.println("Credit limit exceeded.");
	}

		// getters and setters as needed
}
	

	