import javax.swing.*;
import java.awt.event.*;

public class AddSwing {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Addition");

        JLabel l1 = new JLabel("First Number:");
        JLabel l2 = new JLabel("Second Number:");
        JLabel l3 = new JLabel("Result:");

        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();
        JTextField t3 = new JTextField();

        JButton btn = new JButton("Add");

        // positions
        l1.setBounds(20, 30, 120, 25);
        l2.setBounds(20, 70, 120, 25);
        l3.setBounds(20, 110, 120, 25);

        t1.setBounds(140, 30, 100, 25);
        t2.setBounds(140, 70, 100, 25);
        t3.setBounds(140, 110, 100, 25);

        t3.setEditable(false);

        btn.setBounds(90, 160, 80, 30);

        // button logic
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int a = Integer.parseInt(t1.getText());
                    int b = Integer.parseInt(t2.getText());

                    int result = a + b;
                    t3.setText(String.valueOf(result));

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(frame, "Enter valid numbers");
                }
            }
        });

        frame.add(l1);
        frame.add(l2);
        frame.add(l3);
        frame.add(t1);
        frame.add(t2);
        frame.add(t3);
        frame.add(btn);

        frame.setSize(300, 250);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}