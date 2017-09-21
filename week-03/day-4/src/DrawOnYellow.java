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


        drawLine(graphics, WIDTH / 3, 0, WIDTH / 3, HEIGHT, 5);
        drawLine(graphics, 2 * WIDTH / 3, 0, 2 * WIDTH / 3, HEIGHT, 5);
        drawLine(graphics, 0, HEIGHT / 3, WIDTH, HEIGHT / 3, 5);
        drawLine(graphics,0, 2 * HEIGHT / 3, WIDTH, 2 * HEIGHT / 3, 5);


    }


    private static void drawLine(Graphics graphics, int x, int y, int width, int height, int n) {

        if (n == 0) {
        }
        else {

            //drawLine(graphics, x, y, width, height, n-1);

            graphics.setColor(Color.BLACK);
            graphics.drawLine(x, y, width, height);
            //drawLine(graphics, x, y, width, height, n-1);
            drawLine(graphics, width / 3, 0, width / 3, height, n - 1);
            //drawLine(graphics, 2 * width / 3, 0, 2 * width / 3, height, n - 1);
            drawLine(graphics, 0, height / 3, width, height / 3, n - 1);
            //drawLine(graphics, 0, 2 * HEIGHT / 3, WIDTH, 2 * HEIGHT / 3, n - 1);
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

