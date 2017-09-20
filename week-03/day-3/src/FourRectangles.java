import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

    public static void mainDraw(Graphics graphics){
        // draw four different size and color rectangles.

        graphics.setColor(Color.GREEN);
        graphics.drawRect(0, 0, WIDTH / 2, HEIGHT / 2);
        graphics.setColor(Color.RED);
        graphics.drawRect(WIDTH / 2, 0, WIDTH / 2, HEIGHT / 2);
        graphics.setColor(Color.MAGENTA);
        graphics.drawRect(0, HEIGHT / 2, WIDTH / 2, HEIGHT / 2);
        graphics.setColor(Color.ORANGE);
        graphics.drawRect(WIDTH / 2, HEIGHT / 2, WIDTH / 2, HEIGHT / 2);




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
