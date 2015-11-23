/*
 * Author: Mark Diez
 * Date: 22 November 2015
 * Exercise 3.14
 * Date Class
 */

public class Date {
	// Instance Variables
	private int month;
	private int day;
	private int year;

	// Constructor
	public Date(int month, int day, int year) {
		this.month = month;
		this.day = day;
		this.year = year;
	}

	public void displayDate() {
		System.out.printf("%d/%d/%d%n", month, day, year);
	}
	// Getter and Setter
	public int getMonth() {
		return month;
	}

	public int getDay() {
		return day;
	}

	public int getYear() {
		return year;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
}