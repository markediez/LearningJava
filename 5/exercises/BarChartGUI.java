/* 
 * Author: Mark Diez
 * Date: 05 December 2015
 * Ex. 5.2
 * Alter ex 5.16 to draw the graphs
 */

import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class BarChartGUI {
    public static void main(String[] args) {
        int length1 = 0;
        int length2 = 0;
        int length3 = 0;
        int length4 = 0;
        int length5 = 0;

        // ask
        length1 = getBar();
        length2 = getBar();
        length3 = getBar();
        length4 = getBar();
        length5 = getBar();x1

        // draw
        Bar bar = new Bar(length1, length2, length3, length4, length5);

        // show
        JFrame app = new JFrame();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
        app.add(bar);
        app.setSize(500,520);
        app.setVisible(true);
    }

    public static int getBar() {
        int val = 0;

        do {
            String input = JOptionPane.showInputDialog("Enter a number between 1 and 30: ");
            val = Integer.parseInt(input);
        } while(val > 30 || val < 1);
        
        return val;
    }
}