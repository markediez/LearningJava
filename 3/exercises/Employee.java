/*
 * Author: Mark Diez
 * Date: 22 November 2015
 * Exercise 3.13
 * Employee class
 */

public class Employee {
	// Instance Variables
	private String firstName;
	private String lastName;
	private double monthlySalary;

	// Getter and Setter
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public double getMonthlySalary() {
		return monthlySalary;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setMonthlySalary(double amount) {
		if(amount > 0)
			this.monthlySalary = amount;
	}
}