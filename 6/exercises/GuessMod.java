/*
 * Author: Mark Diez
 * Date: 22 December 2015
 * Ex. 6.31
 * Guess the number game mod
 */

import java.util.Scanner;
import java.security.SecureRandom;

public class GuessMod {

    public static void main(String[] args) {
        SecureRandom rng = new SecureRandom();
        Scanner scn = new Scanner(System.in);
        int num = rng.nextInt(1000) + 1;
        int guess = -1;
        int count = 0;

        System.out.println("I'm thinking of a number between 1 and 1000...\n");

        while(guess != num) {
            System.out.print("Enter an integer: ");
            guess = scn.nextInt();
            check(guess, num);
            count++;
        }

        System.out.println("\nCongratulations!");
        extra(count);
    }

    public static void check(int guess, int ans) {
        if(guess > ans)
            System.out.println("Too high!");

        if (guess < ans)
             System.out.println("Too low!");
    }

    public static void extra(int count) {
        if (count < 10) {
            System.out.println("Either you know the secret or you got lucky!");
        } else if (count == 10) {
            System.out.println("Aha! You know the secret!");
        } else {

        }
    }
}