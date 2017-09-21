import javax.swing.*;

import java.awt.*;
import java.awt.image.ImageObserver;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class DrawOnYellow {

    public static void mainDraw(Graphics graphics){

        graphics.setColor(Color.YELLOW);
        graphics.fillRect(0, 0, WIDTH, HEIGHT);
        graphics.setColor(Color.BLACK);
        graphics.drawLine(WIDTH / 3, 0, WIDTH / 3, HEIGHT);
        graphics.drawLine(2 * WIDTH / 3, 0, 2 * WIDTH / 3, HEIGHT);
        graphics.drawLine(0, HEIGHT / 3, WIDTH, HEIGHT / 3);
        graphics.drawLine(0, 2 * HEIGHT / 3, WIDTH, 2 * HEIGHT / 3);

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

