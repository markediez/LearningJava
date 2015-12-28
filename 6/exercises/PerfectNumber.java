/*
 * Author: Mark Diez
 * Date: 21 December 2015
 * Ex. 6.24
 * Displays perfect numbers between 1 and 1000
 */

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.printf("%-10s%s%n", "Number", "Factors");
        for(int i = 2; i <= 1000; i++) {
            if(isPerfect(i)){
                System.out.printf("%-10d",i);
                displayFactors(i);
                System.out.println();
            }
        }
    }

    public static boolean isPerfect(int num) {
        int sum = 0;
        // grab factors
        for(int i = num-1; i >= 1; i--) {
            if(num % i == 0)
                sum += i;
        }
        // check if they add to equal num
        return (sum == num)?true:false;
    }

    public static void displayFactors(int num) {
        for(int i = num-1; i >= 1; i--) {
            if(num % i == 0)
                System.out.printf("%d ", i);
        }
    }
}