/*
 * Author: Mark Diez
 * Date: 25 November 2015
 * Ex. 4.20
 * Employee class
 */

// Employee.java
public class Ex_420_Employee {
	// instance var
	private String name;
	private double hoursWorked;
	private double ratePerHour;

	// constructor takes in hoursWorked and ratePerHour
	public Ex_420_Employee(String name, double hoursWorked, double ratePerHour) {
		this.name = name;
		this.hoursWorked = hoursWorked;
		this.ratePerHour = ratePerHour;
	}

	// methods 
		// method to get salary
	public void displayGrossIncome() {
		// regular pay + overtime pay
		double overTimePay = 0;
		double regularPay = 0;

		if (hoursWorked > 40) {
			overTimePay = ratePerHour * 1.5 * (hoursWorked - 40);
			regularPay = 40 * ratePerHour;
		} else {
			regularPay = hoursWorked * ratePerHour;
		}

		double grossIncome = overTimePay + regularPay;
		System.out.printf("%n%s's gross income is $%.2f%n", name, grossIncome);
	}
		
}