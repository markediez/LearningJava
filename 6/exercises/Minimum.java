/*
 * Author: Mark Diez
 * Date: 21 December 2015
 * Ex. 6.23
 * Find minimum float number
 */

import java.util.Scanner;

public class Minimum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        System.out.printf("Minimum is %f%n",minimum3(scn.nextDouble(), scn.nextDouble(), scn.nextDouble()));
    }

    public static double minimum3(double a, double b, double c) {
        return Math.min(a, Math.min(b,c));
    }
}