/*
 * Author: Mark Diez
 * Date: 22 December 2015
 * Ex. 6.33
 * Modification of Craps text code
 */
import java.security.SecureRandom;
import java.util.Scanner;

public class CrapsMod {
    private static final SecureRandom randomNumbers = new SecureRandom();
    private enum Status { CONTINUE, WON, LOST };

    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int myPoint = 0;
        Status gameStatus;
        double balance = 1000.00;
        double wage = 0;
        String cont = "";

        do {
            // get wage
            while(wage < 1 || wage > balance) {
                // display balance
                System.out.printf("Your balance is %.2f%n", balance);
                System.out.print("How much are you waging? ");
                wage = scn.nextDouble();
            }

            System.out.println();
            // roll
            int sumOfDice = rollDice();

            switch(sumOfDice) {
                case SEVEN:
                case YO_LEVEN:
                    gameStatus = Status.WON;
                    break;
                case SNAKE_EYES:
                case TREY:
                case BOX_CARS:
                    gameStatus = Status.LOST;
                    break;
                default:
                    gameStatus = Status.CONTINUE;
                    myPoint = sumOfDice;
                    System.out.printf("Point is %d%n", myPoint);
                    break;
            }

            // continue roll
            while (gameStatus == Status.CONTINUE) {
                sumOfDice = rollDice();

                if(sumOfDice == myPoint)
                    gameStatus = Status.WON;
                else
                    if(sumOfDice == SEVEN)
                        gameStatus = Status.LOST;
            }

            // status
            if(gameStatus == Status.WON) {
                System.out.println("Player wins");
                balance += wage;
            }
            else {
                System.out.println("Player loses");
                balance -= wage;
            }

            chatter();
            System.out.print("Continue (q to quit)? ");
            cont = scn.next();
            System.out.println();
            wage = 0;
        } while(balance > 0 && !cont.equals("q"));

        if (balance <= 0)
            System.out.println("Sorry. You busted!");
        else
            System.out.printf("Congrats, you cashed out $%.2f%n", balance);
    }

    public static int rollDice() {
        int die1 = 1 + randomNumbers.nextInt(6);
        int die2 = 1 + randomNumbers.nextInt(6);

        int sum = die1 + die2;

        System.out.printf("Player rolled %d + %d = %d%n",
            die1, die2, sum);

        return sum;
    }

    public static void chatter() {
        int chatter = randomNumbers.nextInt(3);
        System.out.println();
        switch(chatter) {
            case 0:
                System.out.println("Oh, you're going for broke, huh?");
                break;
            case 1:
                System.out.println("Aw c'mon, take a chance!");
                break;
            case 2:
                System.out.println("You're up big. Now's the time to cash in your chips!");
                break;
        }
    }
}