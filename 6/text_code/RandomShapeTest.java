/*
 * Author: Mark Diez
 * Date: 19 December 2015
 * Ex. 6.2
 * test random shapes
 */

import javax.swing.JFrame;

public class RandomShapeTest {
    public static void main(String[] args) {
        RandomShape panel = new RandomShape(500,500);
        JFrame app = new JFrame();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setSize(500,500);
        app.add(panel);
        app.setVisible(true);
    }
}