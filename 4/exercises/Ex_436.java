/*
 * Author: Mark Diez
 * Date: 25 Nov 2015
 * Exericse 4.36
 * Decides whether the lenghts make a right triangle
 */

import java.util.Scanner;

public class Ex_436 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int c = scn.nextInt();

        System.out.print("Enter second integer: ");
        int b = scn.nextInt();
        if (b > c) {
            int tmp = c;
            c = b;
            b = tmp;
        }

        System.out.print("Enter third integer: ");
        int a = scn.nextInt();
        if (a > c) {
            int tmp = c;
            c = a;
            a = tmp;
        }        
        
        System.out.printf("a = %d : b = %d : c = %d%n",a,b,c);
        if ((a*a + b*b) == c*c) {
            System.out.println("It makes a right triangle!");
        } else {
            System.out.println("It doesn't make a right triangle!");
        }
    }
}