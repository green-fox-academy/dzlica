import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {

    public static void mainDraw(Graphics graphics){

        int a = WIDTH / 20;
        int b = HEIGHT / 20;

        for (int i = 1; i <= WIDTH; i+= WIDTH / 20) {
            graphics.setColor(Color.MAGENTA);
            graphics.drawLine((4 * a) + i, 0, WIDTH, i + b);
            graphics.setColor(Color.GREEN);
            graphics.drawLine(0, i + b, i + a, HEIGHT);

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
