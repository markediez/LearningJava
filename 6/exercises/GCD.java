/*
 * Author: Mark Diez
 * Date: 21 December 2015
 * Ex. 6.27
 * finds the greatest common divisor
 */
import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter two integers: ");
        int dig1 = scn.nextInt();
        int dig2 = scn.nextInt();
        System.out.printf("GCD between %d and %d is %d%n",
                dig1, dig2, getGCD(dig1, dig2));     
    }

    public static int getGCD(int a, int b) {
        // euclid algorithm
        int biggest = a;
        int smallest = b;
        if(biggest < b) {
            biggest = b;
            smallest = a;
        }

        if (biggest % smallest == 0) {
            return smallest;
        } else {
            return getGCD(smallest, biggest % smallest);
        }

    }
}