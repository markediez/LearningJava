/*
 * Author: Mark Diez
 * Date: 09 December 2015
 * Ex. 5.20
 * Estimate of PI
 */

public class ValueOfPi {
	public static void main(String[] args) {
		int denominator = 1;
		double pi = 4.0;
		System.out.println("TERM     VALUE");
		for(int i = 1; i <= 200000; i++) {
			System.out.printf ("%-9d%f%n", i, pi);

			denominator += 2;
			double nextTerm = (i % 2 == 1) ? -1*4.0 / denominator : 4.0/denominator;
			pi += nextTerm;
		}
		// 191,043 == first instance of 3.14159
	}
}
