/*
 * Author: Mark Diez
 * Date: 21 December 2015
 * Ex. 6.21
 * Separates digits
 */

import java.util.Scanner;

public class SeparateDigits {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int data = 0;
        while(data < 1 || data > 99999) {
            System.out.println("Enter an integer between 1 and 99 999: ");
            data = scn.nextInt();
        }
        displayDigits(scn.nextInt());
    }

    public static int getQuotientInt(double num, double den) {
        return (int)(num / den);
    }

    public static int getQuotientRemainder(double num, double den) {
        return (int)(num % den);
    }

    public static void displayDigits(int value) {
        int digit = 1;
        int tempVal = value;
        while (getQuotientInt(tempVal, 10) > 0) {
            digit++;
            tempVal /= 10;
        }

        for (int i = digit-1; i >= 0; i--) {
            System.out.printf("%d ", getQuotientInt(value, Math.pow(10, i)));
            value = getQuotientRemainder(value, Math.pow(10, i));
        }

        System.out.println();
    }
}