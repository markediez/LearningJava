/**
 * Author: Mark Diez
 * Date: 21 November 2015
 * Takes curr population and curr growth rate
 * Shows estimated population in 1 to 5 years
 */

import java.util.Scanner;

public class Ex_234 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.print("Enter current population: ");
		long currPopulation = scn.nextLong();
		
		System.out.print("Enter annual growth rate: ");
		double currAnnualGrowthRate = scn.nextDouble();

		System.out.printf("Population in 1 year: %f%n",(currPopulation * currAnnualGrowthRate));
		System.out.printf("Population in 2 years: %f%n,", (currPopulation * currAnnualGrowthRate * currAnnualGrowthRate));
		System.out.printf("Population in 3 years: %f%n", (currPopulation * currAnnualGrowthRate * currAnnualGrowthRate * currAnnualGrowthRate));
		System.out.printf("Population in 4 years: %f%n", (currPopulation * currAnnualGrowthRate * currAnnualGrowthRate * currAnnualGrowthRate * currAnnualGrowthRate));
		System.out.printf("Population in 5 years: %f%n", (currPopulation * currAnnualGrowthRate * currAnnualGrowthRate * currAnnualGrowthRate * currAnnualGrowthRate * currAnnualGrowthRate));


	}
}