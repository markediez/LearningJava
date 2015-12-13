/* 
 * Author: Mark Diez
 * Date: 10 December 2015
 * Ex. 5.29
 * 12 days of christmas lyrics with loops and switch
 */

public class TwelveDaysOfChristmas {
	public static void main(String[] args) {
		String day = "";
		for(int i = 1; i <= 12; i++) {
			switch(i) {
				case 1:
					day = "First";
					break;
				case 2:
					day = "Second";
					break;
				case 3:
					day = "Third";
					break;
				case 4:
					day = "Fourth";
					break;
				case 5:
					day = "Fifth";
					break;
				case 6:
					day = "Sixth";
					break;
				case 7:
					day = "Seventh";
					break;
				case 8:
					day = "Eigth";
					break;
				case 9:
					day = "Ninth";
					break;
				case 10:
					day = "Tenth";
					break;
				case 11:
					day = "Eleventh";
					break;
				case 12:
					day = "Twelfth";
					break;
			}
		
			System.out.printf("On the %s day of Christmas my true love sent to me%n", day);

			switch(i) {
				case 12:System.out.println("Twelve Drummers Drumming");
				case 11:System.out.println("Eleven Pipers Piping");
				case 10:System.out.println("Ten Lord a-Leaping");
				case 9:	System.out.println("Nine Ladies Dancing");
				case 8:	System.out.println("Eight Maids a-Milking");
				case 7:	System.out.println("Seven Swans a-Swimming");
				case 6:	System.out.println("Six Geese a-Laying");
				case 5:	System.out.println("Five Gold Rings");
				case 4:	System.out.println("Four Calling Birds");
				case 3: System.out.println("Three French Hens");
				case 2: System.out.println("Two Turtle Doves");
				case 1: System.out.printf("%sa Partridge in a Pear Tree%n",(i==1 ?"":"and "));		
			}

			System.out.println();
		}
	}
}