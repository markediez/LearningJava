/*
 * Author: Mark Diez
 * Date: 24 November 2015
 * Ex 4.17
 * Calculates a driver's automobile average mileage
 */

// Import Scanner
import java.util.Scanner;

public class Ex_417 {
	public static void main(String[] args) {
		// Initialize Scanner
		Scanner scn = new Scanner(System.in);

		// Initialize average mileage
		double averageMileage = 0;
		// Initialize counter
		int counter = 0;
		// Initialize input
		int userInput = 0;

		// While the user does not input the sentinel value
		while(userInput != -1) {
		//  initialize trip 
			int distanceTravelled = 0;
			int gallonsUsed = 0;
		// 	Prompt the user for distance travelled and increment counter
			System.out.printf("Distance in miles travlled for trip #%d: ", ++counter);
			userInput = scn.nextInt();
		// 	if user does not input sentinel value
			if (userInput != -1) {
		//		store distance travelled
				distanceTravelled = userInput;
		// 		Prompt the user for gallons used
				System.out.print("Gallons used for this trip: ");
				userInput = scn.nextInt();

		// 		if user does not input sentinel value
				if (userInput != -1) {
		//			store gallons used
					gallonsUsed = userInput;
		// 			Intialize and calculate this trip's mileage
					double tripMileage = (double)distanceTravelled / gallonsUsed;
		// 			Show user this trips' mileage
					System.out.printf("%nThis trip's mileage was %.2f miles per gallon%n%n", tripMileage);
		// 			Sum up the mileage
					averageMileage += tripMileage;
				}	
			}
		
		}

		// Calculate average mileage
		averageMileage /= counter - 1;
		// Show user their average mileage
		System.out.printf("%nYour automobile's mileage is %.2f miles per gallon%n", averageMileage); 
	}
}
