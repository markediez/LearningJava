/*
 * Author: Mark Diez
 * Date: 19 December 2015
 * Ex. 6.9 & 6.10
 * Rounds numbers
 */

import java.util.Scanner;

public class RoundingIntegers {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double num;

        System.out.print("Enter a floating point number to round: ");
        num = scn.nextDouble();

        System.out.printf("Original number is: %f%n", num);
        roundToInteger(num);
        roundToTenths(num);
        roundToHundredths(num);
        roundToThousandths(num);
    }

    public static void roundToInteger(double num) {
        System.out.printf("Rounded to the nearset integer: %.0f%n",
            Math.floor(num + 0.5));
    }

    public static void roundToTenths(double num) {
        System.out.printf("Rounded to nereast tenth: %.1f%n",
            Math.floor(num * 10 + 0.5) / 10);
    }

    public static void roundToHundredths(double num) {
        System.out.printf("Rounded to nereast hundredth: %.2f%n",
            Math.floor(num * 100 + 0.5) / 100);
    }

    public static void roundToThousandths(double num) {
        System.out.printf("Rounded to nereast thousandth: %.3f%n",
            Math.floor(num * 1000 + 0.5) / 1000);
    }
}