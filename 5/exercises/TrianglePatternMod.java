/*
 * Author: Mark Diez
 * Date: 09 December 2015
 * Ex 5.22
 * Mod. 5.15 to be on one line
 */

public class TrianglePatternMod {
	public static void main(String[] args) {
		// rows
		for(int i = 1; i <= 10; i++) {
			// column
			build('*', i);
			build(' ', 10 -i);
			build('*', 11 - i);
			build(' ', i - 1);
			build(' ', i);
			build('*', 10 -i);
			build(' ', 11 - i);
			build('*', i - 1);
			// next row
			System.out.println();
		}

	}

	public static void build(char c, int size) {
		for(int j = 1; j <= size; j++)
			System.out.print(c);
	}
}