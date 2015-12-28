/*
 * Author: Mark Diez
 * Date: 21 December 2015
 * Ex. 6.22
 * Converts between fahrenheit and celsius
 */

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double temp;
        String type;
        do {
            System.out.print("Enter temperature to convert (C or F): ");
            temp = scn.nextDouble();
            type = scn.next();

            switch(type) {
                case "C":
                    System.out.printf("%.2f C is converted to %.2f F",temp,fahrenheit(temp);
                    break;
                case "F":
                    System.out.printf("%.2f C is converted to %.2f F",temp,celsius(temp);
                    break;
            }
        } while(type.equals("D"));
    }

    public static double celsius(double fahrenheit) {
        return 5.0/9.0 * (fahrenheit - 32);
    }

    public static double fahrenheit(double celsius) {
        return 9.0/5.0 * celsius + 32;
    }
}
