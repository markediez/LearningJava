/*
 * Author: Mark Diez
 * Date: 26 November 2015
 * Ex 4.37
 * Factorial work
 */

import java.util.Scanner;

public class Ex_437 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // test case a
        System.out.print("Enter a nonnegative number: ");
        int a = scn.nextInt();
        System.out.printf("%d! = %d%n", a, factorial(a));

        // b
        double e = 0.0;
        System.out.print("Enter number of terms used to find ~e: ");
        int count = scn.nextInt();
        while (count > 0) {
            e += 1 / factorial(count);
            count--;
        }
        System.out.printf("e = %f%n", e);

        // c
        System.out.print("Enter number of terms used to find ~e: ");
        int countC = scn.nextInt();
        double e2 = 0.0;
        int i = 0;
        while(i <= countC) {
            e2 += (double)pow(countC, i) / factorial(count);
            i++;
        }
        System.out.printf("e^%d = %f%n", countC, e2);

    }

    public static int pow(int base, int exponent) {
        int ans = base;

        if (exponent == 0) {
            ans = 1;
        } else if (exponent == 1) {
            ans = base;
        } else {
            while (exponent > 1) {
                ans *= base;
                exponent--;
            }
        }

        return ans;
    }

    public static int factorial(int num) {
        int ans = 1;

        if (num == 0 ) {
            ans = 1;
        } else {
            while(num > 0) {
                ans *= num;
                num--;
            }
        }

        return ans;
    }
}