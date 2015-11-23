/*
 * Author: Mark Diez
 * Date: 22 November 2015
 * Exercise 3.17
 * Modified to make use of Date, HeartRates, etc. classes made from
 *		previous exercises to avoid re-writing getter and setters for them
 * HealthProfile.class
 */

public class HealthProfile {
	private String firstName;
	private String lastName;
	private String gender;
	private Date dateOfBirth;
	private double heightInInches;
	private double weightInPounds;
	private HeartRates heartRate;

	public HealthProfile(String firstName, String lastName, String gender, 
							int birthMonth, int birthDay, int birthYear,
							double height, double weight) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.dateOfBirth = new Date(birthMonth, birthDay, birthYear);
		this.heartRate = new HeartRates(firstName, lastName, birthMonth, birthDay, birthYear);
		this.heightInInches = height;
		this.weightInPounds = weight;
	}

	public double getBMI() {
		return (weightInPounds * 703) / (heightInInches * heightInInches);
	}

	public int getAge(int currMonth, int currDay, int currYear) {
		return heartRate.getAge(currMonth, currDay, currYear);
	}

	public void displayDateOfBirth() {
		dateOfBirth.displayDate();
	}

	public int getMaxHeartRate(int currMonth, int currDay, int currYear) {
		return heartRate.getMaxHeartRate(currMonth, currDay, currYear);
	}

	public double getLowTargetHeartRate(int currMonth, int currDay, int currYear) {
		return heartRate.getLowTargetHeartRate(currMonth, currDay, currYear);
	}

	public double getHighTargetHeartRate(int currMonth, int currDay, int currYear) {
		return heartRate.getHighTargetHeartRate(currMonth, currDay, currYear);
	}

	// Getters
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
	
	public String getGender() {
		return gender;
	}

	public double getHeight() {
		return heightInInches;
	}

	public double getWeight() {
		return weightInPounds;
	}
}