/* 
 * Text Code
 * Counter-controlled repetition with While loop
 */ 

public class WhileCounter {
    public static void main(String[] args) {
        // init
        int counter = 1;

        // while loop
        while(counter <= 10) {
            // code
            System.out.printf("%d%n", counter);

            // code to change the condition
            counter++;
        }
    }
}