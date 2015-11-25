/*
 * Author: Mark Diez
 * Date: 25 November 2015
 * Ex. 4.18
 * Use Person class to determine credit limit
 */

	// import scanner
import java.util.Scanner;

public class Ex_418_PersonTest {
	public static void main(String[] args) {
		// initialize scanner
		Scanner scn = new Scanner(System.in);

		// prompt for acc #, initial balance, and creditLimit
		System.out.print("Enter Account # ");
		int accountNumber = scn.nextInt();

		System.out.print("Enter Initial Balance: ");
		int initialBalance = scn.nextInt();

		System.out.print("Enter Credit Limit: ");
		int creditLimit = scn.nextInt();

		// initialize Person
		Ex_418_Person person = new Ex_418_Person(accountNumber, initialBalance, creditLimit);

		// space
		System.out.println();
		int expense = 0;
		// while the sentinel value is not entered
		while (expense != -1) {
			// prompt for expenses
			System.out.print("Enter an expense or -1 to finish: ");
			expense = scn.nextInt();

			// increase totalMonthExpense of person
			if (expense != -1)
				person.addExpense(expense);
		}

		// space
		System.out.println();
		expense = 0;
		while (expense != -1) {
			// prompt for expenses
			System.out.print("Enter credit applied or -1 to finish: ");
			expense = scn.nextInt();

			// increase totalMonthExpense of person
			if (expense != -1)
				person.addCredit(expense);
		}
	
		// displayStatus - balance and credit standing		
		// space
		System.out.println();	
		person.displayStatus();

	}
}

	

	

	

