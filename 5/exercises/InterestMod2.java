/*
 * Author: Mark Diez
 * Date: 08 December 2015
 * Ex. 5.18
 * Modified fig 5.6 to use ints
 */

public class InterestMod2 {
    public static void main(String[] args) {
        int amount;
        int dollars = 0;
        int cents = 0;
        int principal = 100000;

        // header
        System.out.printf("%s%20s%8s%n", "Year", "Amount on deposit", "Rate");

        // calculate
        for (int rate = 5; rate <= 10; rate++) {
            int tempPrincipal = principal;
            for (int year = 1; year <= 10; ++year) {
                tempPrincipal += getInterest(tempPrincipal, rate, year);
                dollars = tempPrincipal/100;
                cents = tempPrincipal % 100;

                // display
                System.out.printf("%4d%,17d.%2d %5d%s %n", year, dollars, cents, rate, "%");
            }
            System.out.println();
        }
    }

    public static int getInterest(int principal, int rate, int year) {
        principal *= rate;
        principal /= 100;
        return principal;
    }
}