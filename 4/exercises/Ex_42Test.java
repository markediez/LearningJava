/*
 * Author: Mark Diez
 * Date: 24 November 2015
 * Driver class for ex4.2
 */

import javax.swing.JFrame;

public class Ex_42Test extends JFrame {
	public static void main(String[] args) {
		Ex_42_DrawPanel panel = new Ex_42_DrawPanel();
		JFrame app = new JFrame();

		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		app.setSize(500,500);
		app.add(panel);
		app.setVisible(true);
	}
}