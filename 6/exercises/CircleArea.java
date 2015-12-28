/*
 * Author: Mark Diez
 * Date: 21 December 2015
 * Ex. 6.20
 * calculates area of a circle
 */

import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter ther radius: ");
        System.out.printf("The area is %.2f%n", circleArea(scn.nextDouble()));
    }

    public static double circleArea(double r) {
        return Math.PI * r * r;
    }
}