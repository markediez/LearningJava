// Text Code
// find max number in three double numbers
import java.util.Scanner;

public class MaximumFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 3 floating-point values separated by spaces:" );
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();

        // determin max
        double result = maximum(num1,num2,num3);

        // output
        System.out.println("Maximum is: " + result);
    }

    public static double maximum(double x, double y, double z) {
        double maxValue = x;

        if(y > maxValue) 
            maxValue = y;

        if(z > maxValue)
            maxValue = z;

        return maxValue;
    }
}