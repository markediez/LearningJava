/*
 * Author: Mark Diez
 * Date: 21 December 2015
 * Ex. 6.18 and 6.19
 * Generate a square based on int and char
 */
import java.util.Scanner;
public class CustomSquare {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        System.out.print("Enter an int: ");
        asteriskSquare(scn.nextInt());

        System.out.print("Enter an int followed by a char: ");
        customSquare(scn.nextInt(), scn.next());
        
    }

    // 6.18
    public static void asteriskSquare(int val) {
        for(int i = 1; i <= val; i++) {
            for(int j = 1; j <= val; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 6.19
    public static void customSquare(int val, String c) {
        for(int i = 1; i <= val; i++) {
            for(int j = 1; j <= val; j++) {
                System.out.printf("%s", c);
            }
            System.out.println();
        }
    }
}