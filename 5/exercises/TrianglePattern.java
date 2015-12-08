/*
 * Author: Mark Diez
 * Date: 07 December 2015
 * Ex. 5.15
 * Pattern with for loops
 */

public class TrianglePattern {
	public static void main(String[] args) {
		// a
		for(int i = 1; i <= 10; i++) {
			for(int j = i; j > 0; j--) {
				System.out.print('*');
			}
			System.out.println();
		}

		System.out.println();

		// b
		for(int i = 10; i > 0; i--) {
			for(int j = i; j > 0; j--) {
				System.out.print('*');
			}
			System.out.println();
		}

		System.out.println();

		// c
		for(int i = 10; i > 0; i--) {
			for (int j = 10 - i; j > 0; j--) {
				System.out.print(' ');
			}

			for (int j2 = i; j2 > 0; j2--) {
				System.out.print('*');
			}

			System.out.println();
		}

		System.out.println();

		// d
		for(int i = 1; i <= 10; i++) {
			for (int j = 10 - i; j > 0; j--) {
				System.out.print(' ');
			}

			for (int j2 = i; j2 > 0; j2--) {
				System.out.print('*');
			}

			System.out.println();
		}

	}
}