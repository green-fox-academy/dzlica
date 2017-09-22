import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {

    public static void mainDraw(Graphics graphics) {
        int balfentX = 0;
        int balfentY = 0;
        int jobbfentX = WIDTH;
        int jobbfentY = 0;
        int feleX = WIDTH / 2;
        int egeszY = HEIGHT;

        int[] xPoints = {balfentX, jobbfentX, feleX};
        int[] yPoints = {balfentY, jobbfentY, egeszY};

        graphics.drawPolygon(xPoints, yPoints, 3);
        haromSzog(graphics, xPoints, yPoints, 3, 5);
    }

    private static void haromSzog(Graphics graphics, int[] xPoints, int[] yPoints, int i, int n) {

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
