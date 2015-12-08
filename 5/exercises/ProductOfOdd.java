/*
 * Author: Mark Diez
 * Date: 07 December 2015
 * Ex. 5.12
 * Calculate product of odd number from 1 -15
 */

public class ProductOfOdd {
	public static void main(String[] args) {
		int product = 1;

		for(int i = 1; i <= 15; i++) 
			product *= i;

		System.out.printf("%,d is the product of odd numbers from 1 and 15", product);
	}	
}