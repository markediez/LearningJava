/*
 * Author: Mark Diez
 * Date: 10 December 2015
 * Ex 5.25
 * Diamond with loops mod
 */
import java.util.Scanner;

public class DiamondMod {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int input = 0;

		// checks if out of range or even 
		while((input < 1 || input > 19) || (input % 2 == 0)) {
			System.out.print("Enter an odd number between 1 and 19: ");
			input = scn.nextInt();
		}
			

		int i = 1;
		boolean halfway = false;
		int space = input / 2;
		while(i != -1) {
			for(int j = 1; j <= space; j++) 
				System.out.print(' ');

			for(int j = 1; j <= i; j++)
				System.out.print('*');

			System.out.print('\n');
			if(i == input)
				halfway = true;
			
			if (halfway) {
				i -= 2;
				space++;
			}
			else {
				i += 2;
				space--;
			}
		}
	}
}