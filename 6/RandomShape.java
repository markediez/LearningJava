/*
 * Author: Mark Diez
 * Date: 19 December 2015
 * Ex. 6.2
 * Create a random shape
 */

import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JPanel;
import java.security.SecureRandom;

public class RandomShape extends JPanel{
    private static SecureRandom rng = new SecureRandom();
    private int width;
    private int height;

    public RandomShape(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (int i = 1; i <= 10; i++) {
            // random color
            Color ranColor = new Color(rng.nextInt(256),rng.nextInt(256),rng.nextInt(256));
            g.setColor(ranColor);

            // draw shape
            if(rng.nextInt(10) < 5)
                g.fillRect(rng.nextInt(width), rng.nextInt(height), rng.nextInt(width/2), rng.nextInt(height/2));
            else
                g.fillOval(rng.nextInt(width), rng.nextInt(height), rng.nextInt(width/2), rng.nextInt(height/2));
        }
    }
}