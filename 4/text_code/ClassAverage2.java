/*
 * Text Code
 * Same as ClassAverage.java but with a sentinel value
 * 	instead of a control value
 */

import java.util.Scanner;

public class ClassAverage2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		// init phase
		int total = 0;
		int gradeCounter = 0;

		// processing phase
		System.out.print("Enter grade or -1 to quit: ");
		int grade = scn.nextInt();

		while(grade != -1) {
			total = total + grade;
			gradeCounter = gradeCounter + 1;

			System.out.print("Enter grade or -1 to quit: ");
			grade = scn.nextInt();
		}

		// termination phase
		if(gradeCounter != 0) {
			double average = (double)total / gradeCounter;

			// display total average
			System.out.printf("%nClass Average is %.2f%n", average);
		} else 
			System.out.println("No grades were entered");
		
	}
}