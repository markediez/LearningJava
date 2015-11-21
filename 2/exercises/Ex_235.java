/**
 * Author: Mark Diez
 * Date: 21 November 2015
 * Calculates how much car pooling can save $$$
 */

import java.util.Scanner;

public class Ex_235 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.print("Enter total miles driven per day: ");
		double milesPerDay = scn.nextDouble();

		System.out.print("Enter cost of gas per gallon: ");
		double gasCost = scn.nextDouble();

		System.out.print("Enter average miles travelled per gallon: ");
		double mpg = scn.nextDouble();

		System.out.print("Enter parking fees per day: ");
		double parkingFee = scn.nextDouble();

		System.out.print("Enter toll fee per day: ");
		double tollFee = scn.nextDouble();

		double cost = (milesPerDay / mpg) * gasCost + parkingFee + tollFee;
		System.out.printf("You spend $%f per day driving to work.%n", cost);
	}
}