/*
 * Author: Mark Diez
 * Date: 22 November 2015
 * Exercise 3.16
 * HeartRates class
 */

public class HeartRates {
	// Instance Variables
	private String firstName;
	private String lastName;
	private int birthMonth;
	private int birthDay;
	private int birthYear;

	// Constructor
	public HeartRates(String firstName, String lastName,
						int birthMonth, int birthDay, int birthYear) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthYear = birthYear;
		this.birthDay = birthDay;
		this.birthMonth = birthMonth;
	}

	public int getAge(int currMonth, int currDay, int currYear) {
		int age = currYear - birthYear;

		if(currMonth < birthMonth)
			age = age - 1;

		if(currMonth == birthMonth)
			if(currDay < birthDay)
				age = age - 1;

		return age;
	}

	public int getMaxHeartRate(int currMonth, int currDay, int currYear) {
		return 220 - getAge(currMonth, currDay, currYear);
	}

	public double getLowTargetHeartRate(int currMonth, int currDay, int currYear) {
		return getMaxHeartRate(currMonth, currDay, currYear) * 0.5;
	}

	public double getHighTargetHeartRate(int currMonth, int currDay, int currYear) {
		return getMaxHeartRate(currMonth, currDay, currYear) * 0.85;
	}

	// Getters
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getBirthMonth() {
		return birthMonth; 
	}

	public int getBirthDay() {
		return birthDay; 
	}

	public int getBirthYear() { 
		return birthYear;
	}

	// Setters
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setBirthMonth(int birthMonth) {
		this.birthMonth = birthMonth;
	}

	public void setBirthDay(int birthDay) {
		this.birthDay = birthDay;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
}