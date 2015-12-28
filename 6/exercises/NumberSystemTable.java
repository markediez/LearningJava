/*
 * Author: Mark Diez
 * Date: 22 December 2015
 * Ex. 6.34
 * Display a table of dec, binary, oct, and hex
 */

public class NumberSystemTable {
    public static void main(String[] args) {
        System.out.printf("%10s%10s%10s%10s%n", "Decimal", "Octal", "Hex", "Binary");
        for(int i = 1; i <= 256; i++) {
            System.out.printf("%10d%10s%10s    %s%n", i, getOctal(i), getHex(i), getBinary(i));
        }
    }

    public static String getOctal(int dec) {
        String reverseString = "";
        int digit = -1;
        
        // get octal in reverse
        while (dec > 0) {
            digit = dec % 8;
            reverseString = reverseString.concat(Integer.toString(digit));
            dec /= 8;
        }

        return reverseString(reverseString);
    }

    

    public static String getHex(int dec) {
        String reverseString = "";
        int digit = -1;
        
        // get hex in reverse
        while(dec > 0) {
            digit = dec % 16;

            switch(digit) {
                case 10:
                    reverseString = reverseString.concat("A");
                    break;
                case 11:
                    reverseString = reverseString.concat("B");
                    break;
                case 12:
                    reverseString = reverseString.concat("C");
                    break;
                case 13:
                    reverseString = reverseString.concat("D");
                    break;
                case 14:
                    reverseString = reverseString.concat("E");
                    break;
                case 15:
                    reverseString = reverseString.concat("F");
                    break;
                default:
                    reverseString = reverseString.concat(Integer.toString(digit));
            }

            dec /= 16;
        }

        return reverseString(reverseString);
        
    }

    public static String getBinary(int dec) {
        String reverseString = "";
        int digit = -1;

        // gets the binary but backwards
        while(dec > 0) {
            digit = dec % 2;
            reverseString = reverseString.concat(Integer.toString(digit));
            dec /= 2;
        }

        // re-writes the string properly

        return reverseString(reverseString);
    }

    public static String reverseString(String s) {
        String str = "";
        for(int i = s.length()-1; i >= 0; i--) {
            str = str.concat(s.substring(i, i+1));
        }

        return str;
    }
}