/* 
 * Author: Mark Diez
 * Date: 05 December 2015
 * Ex. 5.1
 * GUI target driver
 */

import javax.swing.JFrame;

public class TargetTest {
    public static void main(String[] args) { 
        int size = 500;

        JFrame app = new JFrame();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setSize(size,size);

        Target panel = new Target(size/2,size/2);

        app.add(panel);
        app.setVisible(true);

    }
}