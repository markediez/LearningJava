/*
 * Author: Mark Diez
 * Date: 21 December 2015
 * Ex. 6.17
 * Determines if the value is odd or even
 */

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int val;
        boolean run = true;

        do {
            System.out.print("Enter an integer, end to quit: ");
            if(!scn.hasNext("end")) {
                val = scn.nextInt();
                System.out.printf("%d %s even%n", val, isEven(val)?"is":"is not");
            } else {
                run = false;
            }
        } while (run);
    }

    public static boolean isEven(int value) {
        return value % 2 == 0 ? true : false;
    }
}