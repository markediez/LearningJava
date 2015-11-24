/*
 * Text Code
 * Example of while loops and definite repitition
 * through counter-controlled repetition and 
 * the control variable
 */

import java.util.Scanner;

public class ClassAverage {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		// init phase
		int total = 0;
		int gradeCounter = 1;

		// processing phase
		while(gradeCounter <= 10) {
			System.out.print("Enter grade: ");
			int grade = scn.nextInt();
			total = total + grade;
			gradeCounter = gradeCounter + 1;
		}

		// termination phase
		int average = total / 10;

		// display total average
		System.out.printf("%nTotal of all 10 grades is %d%n", total);
	}
}