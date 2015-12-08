/*
 * Author: Mark Diez
 * Date: 07 December 2015
 * Ex. 5.13
 * Calculate product of factorials from 1 - 20
 * 100! would potentially generate an arithmetic overflow error
 */

public class Factorial {
	public static void main(String[] args) {
		System.out.println("EQUATION    PRODUCT");
		for(int i = 1; i <= 20; i++) {
			long total = 1L;
			for (int j = i; j > 0; j--) {
				total *= j;
			}
			System.out.printf("%2d%-10s%,-20d%n", i, "!", total);
		}
	}
}
