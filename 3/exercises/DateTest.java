/*
 * Author: Mark Diez
 * Date: 22 November 2015
 * Exercise 3.14
 * Driver Class for Date Class
 */

public class DateTest {
	public static void main(String[] args) {
		Date d = new Date(12,8,1994);

		System.out.print("Current Date on d is ");
		d.displayDate();

		d.setMonth(11);
		d.setDay(22);
		d.setYear(2015);

		System.out.print("Current Date on d is ");
		d.displayDate();
	}
}