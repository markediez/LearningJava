/*
 * Author: Mark Diez
 * Date: 10 December 2015
 * Ex 5.26
 * alternative to continue;
 */

public class StructuredAlternative2 {
	public static void main(String[] args) {
		// Fig 5.13
		int count;
		for(count =1; count <= 10; count++) {
			if(count==5)
				continue;

			System.out.printf("%d", count);
		}

		// Change
		System.out.println();
		for (count =1; count <=10; count++) {
			if(count != 5)
				System.out.printf("%d", count);
		}

	}
}