import javax.swing.*;

import java.awt.*;

import static java.awt.image.ImageObserver.HEIGHT;
import static java.awt.image.ImageObserver.WIDTH;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {

    public static void mainDraw(Graphics graphics){
        // create a line drawing function that takes 2 parameters:
        // the x and y coordinates of the line's starting point
        // and draws a line from that point to the center of the canvas.
        // fill the canvas with lines from the edges, every 20 px, to the center.

        int x = 1;
        int y = 1;
        vonal(graphics, x, y);

    }
    private static void vonal(Graphics graphics, int a, int b) {
        for (int i = 0; i <= WIDTH; i+=20) {
            graphics.drawLine(a * i, 0, WIDTH / 2, HEIGHT / 2);
            graphics.drawLine(WIDTH / 2, HEIGHT / 2, HEIGHT,  a * i);
            graphics.drawLine(0, b * i, WIDTH / 2, HEIGHT / 2);
            graphics.drawLine(WIDTH / 2, HEIGHT / 2, b * i, HEIGHT);

            }
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
    static class ImagePanel extends JPanel{
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);

        }
    }

}
