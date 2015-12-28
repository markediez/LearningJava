/*
 * Author: Mark Diez
 * Date: 28 December 2015
 * Ex. 6.35 - 6.39
 * A digital math work sheet for students
 */

import java.util.Scanner;
import java.security.SecureRandom;

public class CAI {
	private static SecureRandom rng = new SecureRandom();
	private static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		do {
			// Get choice
			int type = getType();
			
			// get difficulty
			int level = getDifficulty();
			
			// start program
			start(type, level);
		} while (true);
	}

	/**
	 * Starts the program based on type and difficulty
	 * @type - type of problems
	 * @level - difficulty
	 */

	public static void start(int type, int level) {
		int key;
		int answer;
		int count = 1;
		int correct = 0;	
		
		while (++count <= 10) {
			key = getQuestion(type, level);
			answer = scn.nextInt();

			// Check
			if (answer != key) {
				getEncouragement();
			} else {
				getCompliment();
				correct++;
			}
		}

		// Show grade
		if(correct < 8) {
			System.out.println("Please ask your teacher for extra help.");
		} else {
			System.out.println("Congratulations, you are ready to go to the next level!");
		}
	}

	/**
	 * Sets the type of problems
	 */
	public static int getType() {
		int answer = -1;

		while(answer < 1 || answer > 4) {
			System.out.println("1. Addition Only");
			System.out.println("2. Subtraction Only");
			System.out.println("3. Multiplication Only");
			System.out.println("4. Mixed");

			System.out.print("\nEnter choice >> ");
			answer = scn.nextInt();
		}

		return answer;
	}

	/**
	 * Sets the difficulty
	 */
	public static int getDifficulty() {
		int answer = -1;

		while(answer < 1 || answer > 2) {
			System.out.println("1. Single digit numbers");
			System.out.println("2. Double digit numbers");

			System.out.print("\nEnter choice >> ");
			answer = scn.nextInt();
		}

		return answer;
	}

	/**
	 * Generate and output the question then return the answer
	 * @type - type of problems
	 * @level - difficulty
	 * @return - answer
	 */
	public static int getQuestion(int type, int level) {
		String sign = "";
		int answer = 0;
		int num1, num2;

		if (level == 1) {
			num1 = rng.nextInt(10);
			num2 = rng.nextInt(10);
		} else {
			num1 = rng.nextInt(100);
			num2 = rng.nextInt(100);
		}

		switch(type) {
			case 1:
				sign = "+";
				answer = num1 + num2;
				break;
			case 2:
				sign = "-";
				answer = num1 - num2;
				break;
			case 3:
				sign = "x";
				answer = num1 * num2;
				break;
			case 4:
				answer = getQuestion(rng.nextInt(3)+1, level);
				break;
		}

		// Avoid repeating the question
		if(type != 4)
			System.out.printf("How much is %d %s %d? ", num1, sign, num2);

		return answer;
	}

	/**
	 * Prints a compliment based on a randomly generated number
	 */
	public static void getCompliment() {

		switch(rng.nextInt(4)) {
			case 0:
				System.out.println("Very good!");
				break;
			case 1:
				System.out.println("Excellent!");
				break;
			case 2:
				System.out.println("Nice work!");
				break;
			case 3:
				System.out.println("Keep up the good work!");
				break;
		}

		System.out.println();
	}

	/**
	 * Prints an encouragement based on a randomly generated number
	 */
	public static void getEncouragement() {

		switch(rng.nextInt(4)) {
			case 0:
				System.out.println("No. Please try again: ");
				break;
			case 1:
				System.out.println("Wrong. Try once more.");
				break;
			case 2:
				System.out.println("Don't give up: ");
				break;
			case 3:
				System.out.println("No. Keep trying: ");
				break;
		}

		System.out.println();
	}
}