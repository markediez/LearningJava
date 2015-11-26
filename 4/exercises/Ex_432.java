/*
 * Author: Mark Diez
 * Date: 25 November 2015
 * Ex 4.32
 * Checkered pattern with loops
 */

public class Ex_432 {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            int j = 0;
            while(j < 10) {
                if (i % 2 == 1) {
                    System.out.print(" ");
                    System.out.print("*");
                } else {
                    System.out.print("*");
                    System.out.print(" ");
                }
                j++;
            }
            System.out.println();
            i++;
        }
    }
}