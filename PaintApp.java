import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PaintApp extends JFrame {

    int x,y;

    public PaintApp() {

        setTitle("Paint");
        setSize(400,400);

        addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                x=e.getX();
                y=e.getY();
                repaint();
            }
        });

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void paint(Graphics g) {
        g.fillOval(x,y,5,5);
    }

    public static void main(String[] args) {
        new PaintApp();
    }
}