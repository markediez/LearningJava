/*
 * Author: Mark Diez
 * Date: 21 December 2015
 * Ex. 6.25
 * Find primes and display them
 */

public class Prime {
    public static void main(String[] args) {
        System.out.println("Prime Numbers ====");
        for(int i = 2; i <= 100; i++) {
            if (isPrime(i))
                System.out.println(i);
        }
    }

    public static boolean isPrime(int val) {
        for (int i = (int)Math.sqrt(val); i >= 2; i--) {
            if(val % i == 0)
                return false;
        }

        return true;
    }
}