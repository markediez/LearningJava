/*
 * Author: Mark Diez
 * Date: 10 December 2015
 * Ex 5.24
 * Diamond with loops
 */

public class Diamond {
	public static void main(String[] args) {
		int i = 1;
		boolean halfway = false;
		int space = 4;
		while(i != -1) {
			for(int j = 1; j <= space; j++) 
				System.out.print(' ');

			for(int j = 1; j <= i; j++)
				System.out.print('*');

			System.out.print('\n');
			if(i == 9)
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