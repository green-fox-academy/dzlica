import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class NewTriangle {
    public static void mainDraw(Graphics graphics) {


        int size = 400;

        graphics.setColor(Color.RED);

        drawTriange(graphics, 20, 20, 400, 6);
    }

    private static void triangle(Graphics gaphics, int xPoint, int yPoint, int size) {

        int[] xPoints = {xPoint, xPoint + size, xPoint + size / 2};
        int[] yPoints = {yPoint, yPoint, yPoint + size};
        gaphics.drawPolygon(xPoints, yPoints, 3);

    }

    private static void drawTriange(Graphics graphics, int xPoint, int yPoint, int size, int n) {
        if (n == 0) {
            return;
        }
        triangle(graphics, xPoint, yPoint, size);
        drawTriange(graphics, xPoint, yPoint, size / 2, n - 1);
        drawTriange(graphics, xPoint + size / 2, yPoint, size / 2, n - 1);
        drawTriange(graphics, xPoint + size / 4, yPoint + size / 2, size / 2, n - 1);

    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new NewTriangle.ImagePanel());
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
