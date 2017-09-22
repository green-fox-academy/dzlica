 import javax.swing.*;
 import java.awt.*;
 import java.awt.image.ImageObserver;
 import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class WellowDrawingWithSquare {

    public static void mainDraw(Graphics graphics){

        graphics.setColor(Color.YELLOW);
        graphics.fillRect(0, 0, WIDTH, HEIGHT);

        graphics.setColor(Color.BLACK);
        kocka(graphics, 0, 0, WIDTH, HEIGHT, 4);
    }

    private static void kocka(Graphics graphics, int balfent_x, int balfent_y, int jobblent_x, int jobblent_y, int n) {
        if (n == 0) {
            return;
        }
        int egyharmad_x = balfent_x + ((jobblent_x - balfent_x) / 3);
        int ketharmad_x = egyharmad_x + ((jobblent_x - balfent_x) / 3);
        int egyharmad_y = balfent_y + ((jobblent_y - balfent_y) / 3);
        int ketharmad_y = egyharmad_y + ((jobblent_y - balfent_y) / 3);

        graphics.drawLine(egyharmad_x, balfent_y, egyharmad_x, jobblent_y);
        graphics.drawLine(ketharmad_x, balfent_y, ketharmad_x, jobblent_y);
        graphics.drawLine(balfent_x, egyharmad_y, jobblent_x, egyharmad_y);
        graphics.drawLine(balfent_x, ketharmad_y, jobblent_x, ketharmad_y);

        kocka(graphics, egyharmad_x, balfent_y, ketharmad_x, egyharmad_y, n - 1);
        kocka(graphics, balfent_x, egyharmad_y, egyharmad_x, ketharmad_y, n - 1);
        kocka(graphics, ketharmad_x, egyharmad_y, jobblent_x, ketharmad_y, n - 1);
        kocka(graphics, egyharmad_x, ketharmad_y, ketharmad_x, jobblent_y, n - 1);
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