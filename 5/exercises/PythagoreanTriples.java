/*
 * Author: Mark Diez
 * Date: 09 December 2015
 * Ex. 5.21
 * Generate a table of pythagorean triples
 */

public class PythagoreanTriples {
	public static void main(String[] args) {
		System.out.printf("%3s%5s%5s%n","a","b","c");

		for(int c = 1; c <= 500; c++) {
			for(int b = 1; b <= c; b++) {
				for (int a = 1; a <= b; a++) {
					if(a*a+b*b==c*c)
						System.out.printf("%3d%5d%5d%n",a,b,c);
				}
			}
		}
	}
}