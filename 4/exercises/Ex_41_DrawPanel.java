/*
 * Author: Mark Diez
 * Date: 23 November 2015
 * Exercise 4.1
 * Draws lines from its origin to the center
  */

import java.awt.Graphics;
import javax.swing.JPanel;

public class Ex_41_DrawPanel extends JPanel {
	// instance variables

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		draw(g, 0, 0);
		draw(g, getWidth(), getHeight());
		draw(g, getWidth(), 0);
		draw(g, 0, getHeight());
		
	}

	private void draw(Graphics g, int xOrigin, int yOrigin) {
		// init
		int lineCounter = 0;
		int multiple = getWidth() / 15;
		boolean q2q4 = false;

		// check which quadrant the origin comes from
		if (xOrigin < getWidth()/2)
			if (yOrigin < getHeight()/2)
				q2q4 = true;

		if (xOrigin > getWidth() / 2)
			if (yOrigin > getHeight() / 2)
				q2q4 = true;

		// process
		while (lineCounter < 15) {
			int xDest = multiple * lineCounter;
			int yDest;
			if(q2q4)
				yDest = xDest * -1 + getHeight();
			else 
				yDest = xDest;

			g.drawLine(xOrigin, yOrigin, xDest, yDest);
			lineCounter++;
		}
	}
}