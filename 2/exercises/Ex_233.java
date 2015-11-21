/**
 * Author: Mark Diez
 * Date: 21 November 2015
 * Takes height and weight and outputs BMI
 *		along with the BMI Info
 */

import java.util.Scanner;

public class Ex_233 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.print("Enter weight in pounds: ");
		double weight = scn.nextDouble();

		System.out.print("Enter height in inches: ");
		double height = scn.nextDouble();

		double bmi = (weight * 703) / (height * height);

		// Show Chart
		System.out.println("===================================");
		System.out.println("BMI Values");
		System.out.println("===================================");
		System.out.println("Underweight: less than 18.5");
		System.out.println("Normal: between 18.5 and 24.9");
		System.out.println("Overweight: between 25.0 and 29.9");
		System.out.println("Obese: 30 or greater");
		System.out.println("===================================");
		System.out.printf("Your BMI is %f%n", bmi);
	}
}
