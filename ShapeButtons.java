import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ShapeButtons extends JFrame implements ActionListener {

    String shape="";

    public ShapeButtons() {

        setTitle("Shapes");
        setSize(400,400);
        setLayout(new FlowLayout());

        String s[]={"Circle","Rectangle","Line","Oval"};

        for(String name:s) {
            JButton b=new JButton(name);
            b.addActionListener(this);
            add(b);
        }

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        shape=e.getActionCommand();
        repaint();
    }

    public void paint(Graphics g) {
        super.paint(g);

        if(shape.equals("Circle")) g.drawOval(150,150,100,100);
        if(shape.equals("Rectangle")) g.drawRect(150,150,120,80);
        if(shape.equals("Line")) g.drawLine(100,100,300,300);
        if(shape.equals("Oval")) g.drawOval(150,150,120,80);
    }

    public static void main(String[] args) {
        new ShapeButtons();
    }
}