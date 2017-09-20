import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {

    public static void mainDraw(Graphics graphics){
        // fill the canvas with a checkerboard pattern.

        int x = 0;
        int y = 0;

        for (int i = 0; i < WIDTH; i += WIDTH / 10) {
            graphics.setColor(Color.RED);
            graphics.fillRect(i + x, 0, WIDTH / 10, HEIGHT / 10);
            x += WIDTH / 5;
            }
        for (int j = WIDTH / 10; j < WIDTH; j += WIDTH / 10) {
            graphics.setColor(Color.BLACK);
            graphics.fillRect(j + y, 0, WIDTH / 10, HEIGHT / 10);
            y += WIDTH / 5;

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

