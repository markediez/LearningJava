/*
 * Author: Mark Diez
 * Date: 25 November 2015
 * Ex. 4.38
 * Enforcing Privacy with Cryptography
 * Decrypts
 */

import java.util.Scanner;

public class Ex_438D {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter encrypted data (4 digit int): ");
        int data = scn.nextInt();

        System.out.printf("Decrypting %d ... %n",data);

        int dig4 = data % 10;
        data /= 10;

        int dig3 = data % 10;
        data /= 10;

        int dig2 = data % 10;
        data /=10;

        // + 7 digit then % 10
        data = decrypt(data);
        dig2 = decrypt(dig2);
        dig3 = decrypt(dig3);
        dig4 = decrypt(dig4);
        // swap first with third
        int tmp = data;
        data = dig3;
        dig3 = tmp;

        // swap second with fourth
        tmp = dig2;
        dig2 = dig4;
        dig4 = tmp;

        int decryption = data + dig2*10 + dig3*100 + dig4*1000;

        // output encrypted digits
        System.out.printf("Decrypted: %d%n", decryption);
    }

    public static int decrypt(int digit) {
        if (digit >= 7) {
            digit -=7;
        } else {
            digit +=3;
        }

        return digit;
    }
}