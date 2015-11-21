/**
 * Author: Mark Diez
 * Date: 21 November 2015
 * Take 3 ints and output sum, average, product, smallest 
 *		and largest numbers
 */

import java.util.Scanner;

public class Ex_217 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first integer >> ");
		int number1 = input.nextInt();

		System.out.print("Enter second integer >> ");
		int number2 = input.nextInt();

		System.out.print("Enter third integer >> ");
		int number3 = input.nextInt();

		// sum, avg, prod
		int sum = number1 + number2 + number3;
		System.out.printf("Sum is %d%n", sum);
		System.out.printf("Average is %d%n", (sum / 3));
		System.out.printf("Product is %d%n", (number1*number2*number3));

		// smallest
		int smallest = 0;
		if (number1 <= number2)
			smallest = number1;

		if (number2 < number1)
			smallest = number2;

		if (number3 < smallest)
			smallest = number3;

		System.out.printf("Smallest number is %d%n", smallest);
		
		// largest
		int largest = 0;
		if (number1 >= number2)
			largest = number1;

		if (number2 > number1)
			largest = number2;

		if (number3 > largest)
			largest = number3;

		System.out.printf("Largest number is %d%n", largest);
	}
}