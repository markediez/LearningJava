/*
 * Author: Mark Diez
 * Date: 19 December 2015
 * Ex. 6.1
 * Draw a target with alternating random colors
 */

import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JPanel;
import java.security.SecureRandom;

public class Target extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        SecureRandom sr = new SecureRandom();

        Color a = new Color (sr.nextInt(256),sr.nextInt(256),sr.nextInt(256));
        Color b = new Color (sr.nextInt(256),sr.nextInt(256),sr.nextInt(256));

        int d = 200;
        for(int i = 1; i <= 5; i++) {
            if (i%2 == 1)
                g.setColor(a);
            else
                g.setColor(b);

            g.fillOval(25*i, 25*i, d, d);
            d -= 50;
        }
    }
}