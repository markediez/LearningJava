/*
 * Author: Mark Diez
 * Date: 19 December 2015
 * Ex. 6.1
 * Display target
 */

import javax.swing.JFrame;

public class TargetTest {
    public static void main(String[] args) {
        Target panel = new Target();
        JFrame app = new JFrame();

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setSize(275,275);
        app.add(panel);
        app.setVisible(true);
    }
}
