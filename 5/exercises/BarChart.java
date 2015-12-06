/* 
 * Author: Mark Diez
 * Date: 05 December 2015
 * Ex. 5.16
 * Enter 5 numbers, output bar graph
 */

import java.util.Scanner;

public class BarChart {
    public static void main(String[] args) {
        Scanner usr = new Scanner(System.in);
        int length1 = 0;
        int length2 = 0;
        int length3 = 0;
        int length4 = 0;
        int length5 = 0;

        // ask
        length1 = getBar(usr);
        length2 = getBar(usr);
        length3 = getBar(usr);
        length4 = getBar(usr);
        length5 = getBar(usr);

        // print
        printBar(length1);
        printBar(length2);
        printBar(length3);
        printBar(length4);
        printBar(length5);
    }

    public static void printBar(int length) {
        for(int i = 1; i <= length; i++) {
            System.out.printf("*");
        }
        System.out.println();
    }

    public static int getBar(Scanner scn) {
        int val = 0;

        do {
            System.out.print("Enter a number between 1 and 30: ");    
            val = scn.nextInt();
        } while(val > 30 || val < 1);
        
        return val;
    }
}