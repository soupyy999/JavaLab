import javax.swing.*;
import java.awt.event.*;

public class CalculatorSwing {

    public static void main(String[] args) {

        JFrame f = new JFrame("Calculator");

        JLabel l1 = new JLabel("Number 1:");
        JLabel l2 = new JLabel("Number 2:");
        JLabel l3 = new JLabel("Result:");

        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();
        JTextField t3 = new JTextField();

        JButton add = new JButton("+");
        JButton sub = new JButton("-");
        JButton mul = new JButton("*");
        JButton div = new JButton("/");

        l1.setBounds(20,30,100,25);
        l2.setBounds(20,70,100,25);
        l3.setBounds(20,110,100,25);

        t1.setBounds(120,30,100,25);
        t2.setBounds(120,70,100,25);
        t3.setBounds(120,110,100,25);

        t3.setEditable(false);

        add.setBounds(20,160,50,30);
        sub.setBounds(80,160,50,30);
        mul.setBounds(140,160,50,30);
        div.setBounds(200,160,50,30);

        ActionListener a = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int x = Integer.parseInt(t1.getText());
                    int y = Integer.parseInt(t2.getText());

                    if(e.getSource()==add) t3.setText(""+(x+y));
                    if(e.getSource()==sub) t3.setText(""+(x-y));
                    if(e.getSource()==mul) t3.setText(""+(x*y));
                    if(e.getSource()==div) {
                        if(y==0) JOptionPane.showMessageDialog(f,"Divide by 0 not allowed");
                        else t3.setText(""+(x/y));
                    }
                } catch(Exception ex) {
                    JOptionPane.showMessageDialog(f,"Enter valid numbers");
                }
            }
        };

        add.addActionListener(a);
        sub.addActionListener(a);
        mul.addActionListener(a);
        div.addActionListener(a);

        f.add(l1); f.add(l2); f.add(l3);
        f.add(t1); f.add(t2); f.add(t3);
        f.add(add); f.add(sub); f.add(mul); f.add(div);

        f.setSize(300,250);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}