/*
 * Author: Mark Diez
 * Date: 21 December 2015
 * Ex. 6.29
 * Coin Toss
 */

import java.util.Scanner;
import java.security.SecureRandom;

public class CoinToss {
    private enum Coin {HEADS, TAILS};
    private static SecureRandom rng = new SecureRandom();
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int input = 0;
        int heads = 0;
        int tails = 0;
        do {
            System.out.printf("Heads: %d Tails %d%n", heads, tails);
            System.out.printf("1. Toss Coin%n2. Quit%n%nEnter choice: ");
            input = scn.nextInt();

            switch(input) {
                case 1:
                    if(flip() == Coin.HEADS)
                        heads++;
                    else
                        tails++;
                    break;
                case 2:
                    System.out.println("Goodbye!");
                    break;
            }
        } while(input != 2);
    }

    public static Coin flip() {
        return rng.nextInt(2) == 1? Coin.HEADS : Coin.TAILS;
    }
}