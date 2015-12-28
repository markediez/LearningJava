/*
 * Author: Mark Diez
 * Date: 21 December 2015
 * Ex. 6.30
 * Guess the number game
 */

import java.util.Scanner;
import java.security.SecureRandom;

public class Guess {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        SecureRandom rng = new SecureRandom();
        int num = rng.nextInt(1000) + 1;
        int guess = -1;

        System.out.println("I'm thinking of a number between 1 and 1000...\n");

        while(guess != num) {
            System.out.print("Enter an integer: ");
            guess = scn.nextInt();

            if(guess > num)
                System.out.println("Too high!");

            if (guess < num)
                System.out.println("Too low!");
        }

        System.out.println("Congratulations!");

    }
}