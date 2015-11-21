/**
 * Author: Mark Diez
 * Date: 21 November 2015
 * shows the squares and cubes from 0 to 10
 */

public class Ex_231 {
	public static void main(String[] args) {
		System.out.println("number square cube");

		int curr = 0;
		System.out.printf( "%d      %d      %d%n",
							curr, curr*curr, curr*curr*curr);
		
		curr = 1;
		System.out.printf( "%d      %d      %d%n",
							curr, curr*curr, curr*curr*curr);

		curr = 2;
		System.out.printf( "%d      %d      %d%n",
							curr, curr*curr, curr*curr*curr);

		curr = 3;
		System.out.printf( "%d      %d      %d%n",
							curr, curr*curr, curr*curr*curr);

		curr = 4;
		System.out.printf( "%d      %d     %d%n",
							curr, curr*curr, curr*curr*curr);

		curr = 5;
		System.out.printf( "%d      %d     %d%n",
							curr, curr*curr, curr*curr*curr);

		curr = 6;
		System.out.printf( "%d      %d     %d%n",
							curr, curr*curr, curr*curr*curr);

		curr = 7;
		System.out.printf( "%d      %d     %d%n",
							curr, curr*curr, curr*curr*curr);

		curr = 8;
		System.out.printf( "%d      %d     %d%n",
							curr, curr*curr, curr*curr*curr);

		curr = 9;
		System.out.printf( "%d      %d     %d%n",
							curr, curr*curr, curr*curr*curr);

		curr = 10;
		System.out.printf( "%d     %d    %d%n",
							curr, curr*curr, curr*curr*curr);
	}
}