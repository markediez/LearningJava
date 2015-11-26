/*
 * Author: Mark Diez
 * Date: 25 November 2015
 * Ex 4.33
 * Infinite loop of the multiple of 2
 */

public class Ex_433 {
    public static void main(String[] args) {
        int multiple = 2;

        int x  = 0;
        while(x < 10) {
            System.out.println(multiple);
            multiple *= 2;
        }

        // when the loop runs, it just outputs 0
        // i think this is due to arithmetic overflow
        // which eventually happens when multiple goes
        // over the integer limit
    }
}