/*
 * Author: Mark Diez
 * Date: 24 November 2015
 * Exercise 4.2
 * DrawPanel displays a design
 */

import java.awt.Graphics;
import javax.swing.JPanel;

public class Ex_42_DrawPanel extends JPanel {
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		drawPattern(g, 0, 0);
		drawPattern(g, getWidth(), getHeight());
		drawPattern(g, 0, getHeight());
		drawPattern(g, getWidth(), 0);
		
	}

	private void drawPattern(Graphics g, int xOrigin, int yOrigin) {
		int increment = 1;

		// init
		// get origin
		int quadrant = getQuadrant(xOrigin, yOrigin);
		int multipleX = getWidth() / 15;
		int multipleY = getHeight() / 15;

		while(increment <= 15) {
			int xDest = 0;

			if (quadrant == 1)
				xDest = getWidth() - multipleX * increment;
			else
				if (quadrant == 2)
					xDest = multipleX * increment;
				else
					if (quadrant == 3)
						xDest = multipleX * increment;
					else
						xDest = getWidth() - multipleX * increment;
			

			// if from top



			// if top
			if (quadrant <= 2) {
				g.drawLine(xOrigin, yOrigin, xDest, getHeight());
				yOrigin = multipleY * increment;
			} else {
				g.drawLine(xOrigin, yOrigin, xDest, 0);
				yOrigin = getHeight() - multipleY * increment;
			}

			increment++;
		}
	}

	/**
	 * This method figures out which quadrant the origin is located
	 * @return - 1/2/3/4 depending on the quadrant
	 */
	private int getQuadrant(int x, int y) {
		if (x < getWidth() / 2) {
			if(y < getHeight() / 2)
				return 2;
			else
				return 3;
		} else {
			if(y < getHeight() / 2)
				return 1;
			else
				return 4;
		}
	}
}