/*
 * Author: Mark Diez
 * Date: 09 December 2015
 * Ex 5.23
 * Show DeMorgan's Law in Action
 */

public class DeMorgan {
	public static void main(String[] args) {
		// DeMorgan Law
		// !(a && b) == (!a || !b)
		// !(a || b) == (!a && !b)
		int a = 1;
		int b = 3;
		int x = 5;
		int y = 7;
		int i = 9;
		int j = 11;
		int g = 13;
			

		// Original
		System.out.println("Original ------");
		System.out.println(!(x < 5) && !(y >= 7));
		System.out.println(!(a == b) || !(g != 5));
		System.out.println(!((x <= 8) && (y > 4)));
		System.out.println(!((i > 4) || (j <= 6)));
		// Converted
		System.out.println("Converted ------");
		System.out.println(!((x < 5) || (y >= 7)));
		System.out.println(!((a == b) && (g != 5)));
		System.out.println(!((x <= 8) && (y > 4)));
		System.out.println((!(x <= 8) || !(y > 4)));
		System.out.println((!(i > 4) && !(j <= 6)));
	}
}