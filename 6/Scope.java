// Text Code
// scope class demonstrates field and local var scopes

public class Scope {
    // field , accessible to all
    private static int x = 1;

    // method main
    public static void main(String[] args) {
        int x = 5;  // local var x

        System.out.printf("local x in main is %d%n", x);

        useLocalVariable(); // use local var x in method useLocalVariable
        useField(); // uses class Scope's x
        useLocalVariable(); // useLocalVariable reinitializes local x
        useField(); // class Scope's field x retains its value

        System.out.printf("%nlocal x in main is %d%n", x);
    }

    // method useLocalVariable
    public static void useLocalVariable() {
        int x = 25;

        System.out.printf("%nlocal x on etnering method useLocalVariable is %d%n", x);
        ++x;
        System.out.printf("local x before exiting method useLocalVariable is %d%n", x);
    }

    public static void useField() {
        System.out.printf("%nfield x on entering method useField is %d%n",x);
        x *= 10;
        System.out.printf("field x before exiting method useField is %d%n", x);
    }
}