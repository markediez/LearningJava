/*
 * Author: Mark Diez
 * Date: 25 November 2015
 * Ex. 4.19
 * Calculate commission 
 */

// import Scanner
import java.util.Scanner;

public class Ex_419 {
	public static void main(String[] args) {
		// initialize scanner
		Scanner scn = new Scanner(System.in);
		// initialize double income and grossSale
		double income = 200;
		double grossSale = 0;

		// initialize sentinel var
		double input = 0;
		//	while sentinal var is not the value
		while(input != -1.0) {
			// prompt for a sale
			System.out.print("Input price of sale, -1 to end: ");			
			// get sale
			input = scn.nextDouble();
			// add sale to gross sale
			if(input > 0 )
				grossSale += input;
		}
			
		// calculate income [200 + .9 * grossSale]
		income += .9 * grossSale;

		// display income
		System.out.printf("%nYour income this week is $%.2f%n", income);

	}	
}