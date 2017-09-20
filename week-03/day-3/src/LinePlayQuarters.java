import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlayQuarters {

    public static void mainDraw(Graphics graphics){
        // divide the canvas into 4 parts
        // and repeat this pattern in each quarter:
        // [https://github.com/greenfox-academy/teaching-materials/blob/master/workshop/drawing/line-play/r1.png]

        int a = WIDTH / 30;
        int b = HEIGHT / 30;

        for (int i = 1; i <= WIDTH / 2; i+= WIDTH / 30) {
            graphics.setColor(Color.MAGENTA);
            graphics.drawLine((WIDTH / 2 + i), 0, WIDTH, i + b);
            graphics.setColor(Color.GREEN);
            graphics.drawLine(0, HEIGHT / 2 + i, i + a, HEIGHT);
            graphics.setColor(Color.RED);
            graphics.drawLine(0, b + i, WIDTH / 2 - i, 0);
            graphics.setColor(Color.CYAN);
            graphics.drawLine(WIDTH - i, HEIGHT, WIDTH, HEIGHT / 2 + i);

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