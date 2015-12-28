/*
 * Author: Mark Diez
 * Date: 22 December 2015
 * Ex. 6.32
 * Calculates the distance between two points
 */

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        System.out.print("Enter a point separated by a space: ");
        int x1 = scn.nextInt();
        int y1 = scn.nextInt();

        System.out.print("Enter a point separated by a space: ");
        int x2 = scn.nextInt();
        int y2 = scn.nextInt();

        System.out.printf("The distance between (%d,%d) and (%d,%d) is %.2f%n",
            x1,y1,x2,y2,distance(x1,y1,x2,y2));        
    }

    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1,2) + Math.pow(y2 - y1, 2));
    }
}