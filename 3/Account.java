/*
 * Code from text
 */

// Class Declaration
public class Account {
	// Instance Variables
	private String name;
	private double balance;

	// Constructor
	public Account(String name, double balance) {
		this.name = name;

		// Validates to avoid negative value
		if(balance > 0.0)
			this.balance = balance;
	}

	// method to deposit money into the account
	public void deposit(double amount) {
		// Validate proper amount
		if(amount > 0.0)
			balance = balance + amount;
	}

	// 3.11 exercise
	public void withdraw(double amount) {
		// Validate proper amount
		if(amount > balance)
			System.out.println("Withdrawal amount exceeded account balance");

		if(amount > balance)
			amount = 0;

		if(amount < 0)
			amount = 0;

		balance = balance - amount;
	}

	// method to set the name in the object
	public void setName(String name) {
		this.name = name;
	}

	// method to retrieve the name from the object
	public String getName() {
		return name;
	}

	// method to get balance
	public double getBalance() {
		return balance;
	}
}