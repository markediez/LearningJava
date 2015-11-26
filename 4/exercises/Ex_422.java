/*
 * Author: Mark Diez
 * Date: 25 November 2015
 * Ex 4.22
 * output table with loops
 */

public class Ex_422 {
	public static void main(String[] args) {
		System.out.println("N        10*N      100*N      1000*N");
		System.out.println();	// space
		int counter = 1;
		while (counter <= 5){
			System.out.printf("%d        %d        %d        %d%n", 
				counter, counter * 10, counter * 100, counter * 1000);
			counter++;
		}
	}
}