/* Text Code
 * Break example
 */

public class BreakTest {
	public static void main(String[] args) {
		int count;

		for(count =1; count <= 10; count++) {
			if(count==5)
				break;

			System.out.printf("%d%n", count);
		}

		System.out.printf("Broke out of the loop when count = %d%n", count);
	}
}