/* 
 * Author: Mark Diez
 * Date: 12 December 2015
 * Ex. 5.30
 * Taking the GW quiz
 */

import java.util.Scanner;

public class Scantron {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int correct = 0;
		String input;
		GlobalWarmingQuiz gwq = new GlobalWarmingQuiz();

		for(int i = 1; i <= 5; i++) {
			gwq.getQuestion(i);
			System.out.print("Enter letter of choice: ");
			input = scn.next();
			if (gwq.getAnswer(i, input))
				correct++;
		}

		if(correct == 5)
			System.out.println("Excellent");
		else if (correct == 4)
			System.out.println("Very good");
		else
			System.out.println("Time to brush up on your knowledge of global warming");
	}
}