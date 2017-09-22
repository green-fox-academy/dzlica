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
        haromSzog(graphics, xPoints, yPoints, balfentX, balfentY, jobbfentX, jobbfentY, egeszY, 3, 5);
    }

    private static void haromSzog(Graphics graphics, int[] xPoints, int[] yPoints, int balfentX, int balfentY, int jobbfentX, int jobbfentY, int egeszY, int i, int n) {
        if (n == 0) {
            return;
        }

        int feleX = jobbfentX / 2;
        int negyedX = feleX / 2;

        haromSzog(graphics, xPoints = new int[] {balfentX, jobbfentX, feleX}, yPoints = new int[] {balfentY, jobbfentY, egeszY}, balfentX / 2, balfentY / 2, jobbfentX / 2, jobbfentY / 2, egeszY / 2, 3, n - 1);
        graphics.drawPolygon(xPoints, yPoints, 3);

        haromSzog(graphics, xPoints = new int[] {feleX, feleX * 2, feleX + negyedX}, yPoints = new int [] {jobbfentY, jobbfentY, egeszY / 2}, balfentX, balfentY, jobbfentX, jobbfentY, egeszY, 3, n - 1);
        graphics.drawPolygon(xPoints, yPoints, 3);

        haromSzog(graphics, xPoints = new int[] {negyedX, feleX + negyedX, feleX}, yPoints = new int[] {egeszY / 2, egeszY / 2, egeszY}, balfentX, balfentY, jobbfentX, jobbfentY, egeszY, 3, n -1);
        graphics.drawPolygon(xPoints, yPoints, 3);
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
