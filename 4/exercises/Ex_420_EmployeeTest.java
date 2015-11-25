/*
 * Author: Mark Diez
 * Date: 25 November 2015
 * Ex. 4.20
 * Test Employee class
 */

// import scanner
import java.util.Scanner;

public class Ex_420_EmployeeTest {
	public static void main(String[] args) {
	// initialize scanner
		Scanner scn = new Scanner(System.in);

	// call method to initilize 3 employees
		Ex_420_Employee a = getEmployee(scn);
		Ex_420_Employee b = getEmployee(scn);
		Ex_420_Employee c = getEmployee(scn);

	// output gross weekly salary for 3 employees
		a.displayGrossIncome();
		b.displayGrossIncome();
		c.displayGrossIncome();
	}

	// method to get employee info
	public static Ex_420_Employee getEmployee(Scanner scn) {
		System.out.print("Enter name: ");
		String name = scn.next();
		// prompt for hoursWorked for each employee
		System.out.print("Enter hours worked: ");
		double hoursWorked = scn.nextDouble();
		// prompt for ratePerHour for each employee
		System.out.print("Enter hourly rate: ");
		double rate = scn.nextDouble();

		scn.nextLine();

		return new Ex_420_Employee(name, hoursWorked, rate);
	}
}