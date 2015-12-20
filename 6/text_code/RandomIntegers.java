// Text Code
// shifted and scaled random ints
import java.security.SecureRandom;

public class RandomIntegers {
    public static void main(String[] args) {
        SecureRandom rand = new SecureRandom();

        for (int i = 1; i <=20; i++) {
            int face = 1 + rand.nextInt(6);

            System.out.printf("%d ", face);

            if(i % 5 == 0)
                System.out.println();
        }
    }
}