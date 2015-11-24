/*
 * Text Code
 * Shows the difference between postfix and prefix increment/decrement
 */

public class Increment {
	public static void main(String[] args) {
		int c = 5;

		System.out.printf("Initial value of c: %d%n", c);
		System.out.printf("Preincrementing c: %d%n", ++c);
		System.out.printf("Value of c: %d%n", c);

		c = 5;
		System.out.printf("Initial value of c: %d%n", c);
		System.out.printf("Postincrementing c: %d%n", c++);
		System.out.printf("Value of c: %d%n", c);
	}
}