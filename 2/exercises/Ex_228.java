/**
 * Author: Mark Diez
 * Date: 21 November 2015
 * Takes in the radius and outputs the diamater, circum., and area
 */

import java.util.Scanner;

public class Ex_228 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.print("Enter the radius of the circle: ");
		int radius = scn.nextInt();


		// show
		System.out.printf("Diameter is %d%n", (2*radius));
		System.out.printf("Circumference is %f%n", (2*Math.PI*radius));
		System.out.printf("Area is %f%n", (Math.PI * radius * radius));
	}
}