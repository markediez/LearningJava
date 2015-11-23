/*
 * Author: Mark Diez
 * Date: 22 November 2015
 * Exercise 3.16
 * Driver class for HeartRates.java
 */

public class HeartRatesTest {
	public static void main(String[] args) {
		HeartRates patient = new HeartRates("Mark", "Diez", 12, 8, 1994);

		System.out.println("===========================");
		System.out.printf ("Patient Name     : %s %s%n",patient.getFirstName(), patient.getLastName());
		System.out.printf ("Date of Birth    : %d/%d/%d%n",patient.getBirthMonth(),patient.getBirthDay(),patient.getBirthYear());
		System.out.printf ("Maximum Heartrate: %d%n", patient.getMaxHeartRate(11,22,2015));
		System.out.printf ("Target Heartrate : Between %.2f and %.2f%n", patient.getLowTargetHeartRate(11,22,2015),patient.getHighTargetHeartRate(11,22,2015));
		System.out.println("===========================");
	}
}
