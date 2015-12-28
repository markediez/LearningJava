/*
 * Author: Mark Diez
 * Date: 22 December 2015
 * Ex. 6.34
 * Display a table of dec, binary, oct, and hex
 */

public class Table {
    public static void main(String[] args) {
        System.out.printf("%10s%10s%10s%10s%n", "Decimal", "Octal", "Hex", "Binary");
        for(int i = 1; i <= 256; i++) {
            System.out.printf("%10d%10d%10s    %d%n", i, getOctal(i), getHex(i), getBinary(i));
        }
    }

    public static int getOctal(int dec) {
        return 1;

    }

    public static String getHex(int dec) {
        return "i";
        6 % 2 = 0
        3 % 2 = 1
        1 % 2 = 1
        
    }

    public static long getBinary(int dec) {
        return 10;

    }
}