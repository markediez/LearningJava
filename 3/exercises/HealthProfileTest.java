/*
 *
 */

import java.util.Scanner;

public class HealthProfileTest {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		// Prompt for profile
		System.out.print("Enter first name: ");
		String firstName = scn.nextLine();

		System.out.print("Enter last name: ");
		String lastName = scn.nextLine();

		System.out.print("Enter gender: ");
		String gender = scn.nextLine();

		System.out.print("Enter birth month (in number): ");
		int birthMonth = scn.nextInt();

		System.out.print("Enter birth day: ");
		int birthDay = scn.nextInt();

		System.out.print("Enter birth year: ");
		int birthYear = scn.nextInt();

		System.out.print("Enter height in inches: ");
		double height = scn.nextDouble();

		System.out.print("Enter weight in pounds: ");
		double weight = scn.nextDouble();

		HealthProfile profile = new HealthProfile(firstName, lastName, gender,
													birthMonth, birthDay, birthYear,
													height, weight);

		// Profile
		System.out.println("===================================");
		System.out.println("Health Profile");
		System.out.println("===================================");
		System.out.printf ("Name: %s,%s%n", profile.getLastName(), profile.getFirstName());
		System.out.printf ("Gender: %s%n", profile.getGender());
		System.out.printf ("Age: %d%n", profile.getAge(11,22,2015));
		System.out.print ("Date of Birth: ");
		profile.displayDateOfBirth();
		System.out.printf ("Height: %.2f inches%n", profile.getHeight());
		System.out.printf ("Weight: %.2f pounds%n", profile.getWeight());
		System.out.printf ("BMI: %.2f%n", profile.getBMI());
		System.out.printf ("Maximum Heartrate: %d%n", profile.getMaxHeartRate(11,22,2015));
		System.out.printf ("Target Heartrate: Between %.0f and %.0f%n", profile.getLowTargetHeartRate(11,22,2015), profile.getHighTargetHeartRate(11,22,2015));
		System.out.println("===================================");
		System.out.println("BMI Chart");
		System.out.println("===================================");
		System.out.println("Underweight: less than 18.5");
		System.out.println("Normal: between 18.5 and 24.9");
		System.out.println("Overweight: between 25.0 and 29.9");
		System.out.println("Obese: 30 or greater");
		System.out.println("===================================");
	}
}