/*
 * Author: Mark Diez
 * Date: 26 November 2015
 * Ex. 4.39
 */

public class Ex_439 {
    public static void main(String[] args) {
        System.out.println("YEAR  POPULATION      ");

        long pop = 7383665625L;
        int count = 1;        

        while (count <= 75) {
            System.out.printf ("%d     %d%n", count, pop);
            pop *= 1.13;
            count++;    
        }
        
    }
}