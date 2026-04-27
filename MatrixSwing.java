import javax.swing.*;
import java.awt.event.*;

public class MatrixSwing {

    public static void main(String[] args) {

        JFrame f = new JFrame("Matrix Addition");

        JTextField a1=new JTextField(); JTextField a2=new JTextField();
        JTextField a3=new JTextField(); JTextField a4=new JTextField();

        JTextField b1=new JTextField(); JTextField b2=new JTextField();
        JTextField b3=new JTextField(); JTextField b4=new JTextField();

        JButton btn = new JButton("Add");

        a1.setBounds(30,30,40,30); a2.setBounds(80,30,40,30);
        a3.setBounds(30,70,40,30); a4.setBounds(80,70,40,30);

        b1.setBounds(160,30,40,30); b2.setBounds(210,30,40,30);
        b3.setBounds(160,70,40,30); b4.setBounds(210,70,40,30);

        btn.setBounds(100,120,80,30);

        btn.addActionListener(e -> {
            try {
                int c1 = Integer.parseInt(a1.getText()) + Integer.parseInt(b1.getText());
                int c2 = Integer.parseInt(a2.getText()) + Integer.parseInt(b2.getText());
                int c3 = Integer.parseInt(a3.getText()) + Integer.parseInt(b3.getText());
                int c4 = Integer.parseInt(a4.getText()) + Integer.parseInt(b4.getText());

                JOptionPane.showMessageDialog(f,
                        c1+" "+c2+"\n"+c3+" "+c4);
            } catch(Exception ex) {
                JOptionPane.showMessageDialog(f,"Enter valid numbers");
            }
        });

        f.add(a1);f.add(a2);f.add(a3);f.add(a4);
        f.add(b1);f.add(b2);f.add(b3);f.add(b4);
        f.add(btn);

        f.setSize(320,220);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}