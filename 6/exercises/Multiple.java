/*
 * Author: Mark Diez
 * Date: 21 December 2015
 * Ex. 6.16
 * determines if a given value is a multiple of another value
 */

import java.util.Scanner;

public class Multiple {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int base, val;

        do {
            System.out.print("Enter a pair of integers, end to quit: ");
            if(!scn.hasNext("end")) {
                base = scn.nextInt();
                val = scn.nextInt();
                System.out.printf("%d %s a multiple of %d%n", val, isMultiple(base, val)?"is":"is not", base);
            }
        } while (!scn.hasNext("end"));
    }
    
    public static boolean isMultiple(int base, int value) {
        return (value % base == 0) ? true : false;
    }
}