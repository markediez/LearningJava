/*
 * Author: Mark Diez
 * Date: 21 December 2015
 * Ex. 6.15
 * Take 2 sides and generate the hypotenuse
 */

import java.util.Scanner;

public class Hypotenuse {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter side1: ");
        double side1 = scn.nextDouble();

        System.out.print("Enter side2: ");
        double side2 = scn.nextDouble();

        System.out.printf("Hypotenuse is %.1f%n", hypotenuse(side1, side2));
    }

    public static double hypotenuse(double a, double b) {
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        return c;
    }
}