/*
 * Text Code
 * First Drawing Application
 */

import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel extends JPanel {

	// draws an X from the corners of the panel
	// ** added the override b/c i think it is important
	//		to note that this derived from JPanel
	//		even though I theoretically don't know that yet
	@Override
	public void paintComponent(Graphics g)
	{
		// call paintComponent to ensure the panel displays correctly
		super.paintComponent(g);

		int width = getWidth();
		int height = getHeight();

		// draw a line from the upper-left to the lower-right
		g.drawLine(0, 0, width, height);

		// draw a ling from the lower-left to the upper-right
		g.drawLine(0, height, width, 0);
	}
}