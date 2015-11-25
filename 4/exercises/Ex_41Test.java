/*
 * Author: Mark Diez
 * Date: 24 November 2015
 * Driver class
 */

import javax.swing.JFrame;

public class Ex_41Test {
	public static void main(String[] args) {
		int frameHeight = 500;
		int frameWidth = 500;

		Ex_41_DrawPanel panel = new Ex_41_DrawPanel();

		JFrame app = new JFrame();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.add(panel);
		app.setSize(frameWidth, frameHeight);
		app.setVisible(true);
	}
}