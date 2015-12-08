/*
 * Author: Mark Diez
 * Date: 07 December 2015
 * Ex. 5.14
 * Modified fig 5.6
 */

public class InterestMod {
    public static void main(String[] args) {
        double amount;
        double principal = 1000.0;

        // header
        System.out.printf("%s%20s%8s%n", "Year", "Amount on deposit", "Rate");

        // calculate
        for (int rate = 5; rate <= 10; rate++) {
            for (int year = 1; year <= 10; ++year) {
                amount = principal * Math.pow(1.0 + rate/100.0, year);

                // display
                System.out.printf("%4d%,20.2f %5d%s %n", year, amount, rate, "%");
            }
            System.out.println();
        }
    }
}