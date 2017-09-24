import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Square_grid {

    public static void mainDraw(Graphics graphics){

        int size = 600;
        graphics.setColor(Color.BLACK);
        graphics.fillRect(0, 0, 600, 600);


        kocka(graphics, 100, 100, 100, 4);

    }

    private static void nagykocka(Graphics graphics, int x1, int y1, int size) {

        graphics.fillRect(x1, y1, size, size);

    }

    private static void kocka(Graphics graphics, int x1, int y1, int size, int n) {

        if (n == 0) {
            return;
        }
        if (n == 4) {
            graphics.setColor(Color.BLUE);
        }
        if (n == 3) {
            graphics.setColor(Color.MAGENTA);
        }
        if (n == 2) {
            graphics.setColor(Color.GREEN);
        }
        if (n == 1) {
            graphics.setColor(Color.orange);
        }

        nagykocka(graphics, x1, y1, size);
        kocka(graphics, x1 - 2 * size / 3, y1 - 2 * size / 3, size / 3, n - 1); //balfelso
        kocka(graphics, x1 + size / 3, y1 - 2 * size / 3, size / 3, n - 1); //felsokozepso
        kocka(graphics, x1 + size + size / 3, y1 - 2 * size / 3, size / 3, n - 1); //jobbfelso
        kocka(graphics, x1 - 2 * size / 3, y1 + size / 3, size / 3,  n - 1); //balszelso
        kocka(graphics, x1 + size + size / 3, y1 + size / 3, size / 3, n -1); //jobbszelso
        kocka(graphics, x1 - 2 * size / 3, y1 + size + size / 3, size / 3, n - 1); //balalso
        kocka(graphics, x1 + size / 3, y1 + size + size / 3,  size / 3, n -1); //alsokozep
        kocka(graphics, x1 + size + size / 3, y1 + size + size / 3, size / 3, n -1); //jobbalso


    }


    // Don't touch the code below
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
