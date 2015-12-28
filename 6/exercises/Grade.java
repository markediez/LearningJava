/*
 * Author: Mark Diez
 * Date: 21 December 2015
 * Ex. 6.28
 * Finds letter grade
 */
import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int input = -1;

        while (input < 0 || input > 100) {
            System.out.print("Enter your average: ");        
            input = scn.nextInt();    
        }

        switch(qualityPoints(input)) {
            case 4:
                System.out.println("A, excellent.");
                break;
            case 3:
                System.out.println("B, good.");
                break;
            case 2:
                System.out.println("C, average.");
                break;
            case 1:
                System.out.println("D, pass...?");
                break;
            case 0:
                System.out.println("F");
                break;
        }
        
    }

    public static int qualityPoints(int score) {
        if(score >= 90)
            return 4;
        else
            if (score >= 80)
                return 3;
            else
                if (score >= 70)
                    return 2;
                else
                    if (score >= 60)
                        return 1;
                    else
                        return 0;
    }
}