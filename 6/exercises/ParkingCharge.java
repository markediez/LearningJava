/*
 * Author: Mark Diez
 * Date: 19 December 2015
 * Ex. 6.8
 * Calculate parking charge of a customer
 *  and display a running total
 */

import java.util.Scanner;

public class ParkingCharge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double runningTotal = 0.0;
        double customerFee = 0.0;
        double hours = 1;

        // sentinel based loop
        while(hours > 0) {
            // ask for hours
            System.out.print("Enter hours parked, a negative value to end: ");
            hours = input.nextDouble();

            // makes sure fee is correct
            customerFee = (hours > 0) ? calculateCharges(hours) : 0;

            // show customer fee
            System.out.printf("%nCustomer Fee: $%.2f%n", customerFee);

            // show running total
            runningTotal += customerFee;
            System.out.printf("%nYesterday's Total: $%.2f%n", runningTotal);

        }


    }

    /**
     * Calculate the fee for the customer
     * @hours - number of hours parked
     * @return - returns the fee
     */
    public static double calculateCharges(double hours) {
        // minimum fee
        double fee = 2.00;

        // adds 50 cents per hour after 3 hours
        if(hours > 3.00)
            fee += Math.ceil(hours - 3.00) * 0.50;

        // returns 10 if the fee is > $10
        return (fee > 10) ? 10 : fee;
    }
}