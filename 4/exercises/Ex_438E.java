/*
 * Author: Mark Diez
 * Date: 25 November 2015
 * Ex. 4.38
 * Enforcing Privacy with Cryptography
 * Encrypts
 */

import java.util.Scanner;

public class Ex_438E {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter data (4 digit int): ");
        int data = scn.nextInt();

        System.out.printf("Encrypting %d ... %n",data);

        int dig4 = data % 10;
        data /= 10;

        int dig3 = data % 10;
        data /= 10;

        int dig2 = data % 10;
        data /=10;

        // + 7 digit then % 10
        dig4 += 7;
        dig3 += 7;
        dig2 += 7;
        data += 7;

        dig4 %= 10;
        dig3 %= 10;
        dig2 %= 10;
        data %= 10;
        // swap first with third
        int tmp = data;
        data = dig3;
        dig3 = tmp;

        // swap second with fourth
        tmp = dig2;
        dig2 = dig4;
        dig4 = tmp;

        int encryption = data + dig2*10 + dig3*100 + dig4*1000;

        // output encrypted digits
        System.out.printf("Encrypted: %d%n", encryption);
    }
}