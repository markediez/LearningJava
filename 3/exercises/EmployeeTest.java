/*
 * Author: Mark Diez
 * Date: 22 November 2015
 * Exercise 3.13
 * Driver class to use Employee.java
 */

public class EmployeeTest {
	public static void main(String[] args) {
		// Create Employees
		Employee a = new Employee();
		Employee b = new Employee();

		a.setMonthlySalary(1654.32);
		b.setMonthlySalary(2234.50);

		// Show Yearly
		System.out.printf("%nEmployee A's yearly salary is %.2f%n", a.getMonthlySalary()*12);
		System.out.printf("Employee B's yearly salary is %.2f%n", b.getMonthlySalary()*12);

		System.out.println("They got a 10% increase");

		// Increase Salary
		double newMonthly = a.getMonthlySalary() * 1.10;
		a.setMonthlySalary(newMonthly);
		newMonthly = b.getMonthlySalary() * 1.10;
		b.setMonthlySalary(newMonthly);

		// Show Yearly
		System.out.printf("%nEmployee A's yearly salary is %.2f", a.getMonthlySalary()*12);
		System.out.printf("%nEmployee B's yearly salary is %.2f", b.getMonthlySalary()*12);
	}
}