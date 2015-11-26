/*
 * Author: Mark Diez
 * Date: 25 November 2015
 * Ex. 4.24
 * modify self fig 4.12 to validate
 */

public class Ex_424 {
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

			if (result == 1) {
				passes = passes + 1;
				studentCounter = studentCounter + 1;
			}
			else {
				failures = failures + 1;
				studentCounter = studentCounter + 1;
			}

		}

		// terminating
		System.out.printf("Passed: %d%nFailed: %d%n", passes, failures);

		if (passes > 8)
			System.out.println("Bonus to instructor!");
	
	}
}