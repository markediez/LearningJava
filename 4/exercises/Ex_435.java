/*
 * Author: Mark Diez
 * Date: 25 Nov 2015
 * Exericse 4.35
 * Decides whether 3 lengths can make a triangle
 */

import java.util.Scanner;

public class Ex_435 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int s1 = scn.nextInt();

        System.out.print("Enter second integer: ");
        int s2 = scn.nextInt();

        System.out.print("Enter third integer: ");
        int s3 = scn.nextInt();

        System.out.printf("Integers entered are: %d %d %d%n", s1, s2, s3);
        boolean triangle = true;

        if ((s1 + s2) < s3)
            triangle = false;

        if ((s1 + s3) < s2)
            triangle = false;

        if ((s2 + s3) < s1)
            triangle = false;

        if (triangle == true) {
            System.out.println("It makes a triangle!");
        } else {
            System.out.println("It doesn't make a triangle!");
        }
    }
}