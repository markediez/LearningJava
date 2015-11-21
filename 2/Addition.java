// Code from text

// import - keyword to import a library
// library - pre-written code that we can use 
import java.util.Scanner;

public class Addition {
    public static void main(String[] main) {
        // Scanner gets input from user
        Scanner input = new Scanner(System.in);
        
        // int - data structure, for whole number
        // number1, number2, sum, are variables
        int number1;
        int number2;
        int sum;

        System.out.print("Enter first integer: "); // prompt
        // .nextInt() grabs the next whole number 
        //          the user enters
        number1 = input.nextInt();

        System.out.print("Enter second integer: ");
        number2 = input.nextInt();

        sum = number1 + number2;
        
        // %d - placeholder for an integer
        System.out.printf("Sum is %d%n", sum);
    }
}
