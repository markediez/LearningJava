/*
 * Text Code
 * Soldify knowledge, more of implementing
 * Pseudocode that has been refined view top down structure
 */

import java.util.Scanner;

public class Analysis {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		// initializing
		int passes = 0;
		int failures = 0;
		int studentCounter = 1;

		// processing
		while (studentCounter <= 10) {
			System.out.print("Enter result (1 = pass, 2 = fail): ");
			int result = scn.nextInt();

			if (result == 1) 
				passes = passes + 1;
			else
				failures = failures + 1;

			studentCounter = studentCounter + 1;
		}

		// terminating
		System.out.printf("Passed: %d%nFailed: %d%n", passes, failures);

		if (passes > 8)
			System.out.println("Bonus to instructor!");
	}
}