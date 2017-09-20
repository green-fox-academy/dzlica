import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainboxBoxFunction {

    public static void mainDraw(Graphics graphics) {
        // create a square drawing function that takes 2 parameters:
        // the square size, and the fill color,
        // and draws a square of that size and color to the center of the canvas.
        // create a loop that fills the canvas with rainbow colored squares.

        int a = 50;
        int colorR = 255;
        int colorG = 83;
        int colorB = 13;
        square(graphics, a, colorR, colorB, colorG);

        a = 30;
        colorR = 232;
        colorG = 12;
        colorB = 122;
        square(graphics, a, colorR, colorB, colorG);

        a = 70;
        colorR = 20;
        colorG = 232;
        colorB = 48;
        square(graphics, a, colorR, colorB, colorG);


    }

    private static void square(Graphics graphics, int a, int colorR, int colorG, int colorB) {
        graphics.setColor(new Color(colorR, colorG, colorB));
        graphics.drawRect((WIDTH - a) / 2, (HEIGHT - a) / 2, a, a);
    }


    //    Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);

        }
    }
}

