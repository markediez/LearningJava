/* 
 * Author: Mark Diez
 * Date: 05 December 2015
 * Ex. 5.2
 * Draw Panel for the graph
 */

import javax.swing.JPanel;
import java.awt.Graphics;

public class Bar extends JPanel {
    private int length1;
    private int length2;
    private int length3;
    private int length4;
    private int length5;

    public Bar(int length1, int length2, int length3, int length4, int length5) {
        this.length1 = length1;
        this.length2 = length2;
        this.length3 = length3;
        this.length4 = length4;
        this.length5 = length5;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        paintGraph(g);

        paintBar(length1, 30, g);
        paintBar(length2, 130, g);
        paintBar(length3, 230, g);
        paintBar(length4, 330, g);
        paintBar(length5, 430, g);
    }

    public void paintGraph(Graphics g) {
        g.drawLine(20, 20, 20, 480);
        g.drawLine(20, 480, 480, 480);
    }

    public void paintBar(int count, int loc, Graphics g) {
        for (int i = 1; i <= count; i++) {
            g.drawRect(loc, 480 - 15*i, 40, 15);
        }
    }

}