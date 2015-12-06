/* 
 * Author: Mark Diez
 * Date: 05 December 2015
 * Ex. 5.1
 * GUI target
 */

import javax.swing.JPanel;
import java.awt.Graphics;

public class Target extends JPanel {
    // Instance Var
    private int x;
    private int y;

    // Constructor
    public Target(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void paintComponent(Graphics g) {
        int r = 10;
        int numOfCircles = 12;

        for (int i = 1; i <= numOfCircles; i++) {
            r = 10 * i;
            g.drawOval(x - r, y - r, 2 * r, 2 * r);
        }
    }
}