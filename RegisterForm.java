import javax.swing.*;
import java.awt.event.*;

public class RegisterForm {

    public static void main(String[] args) {

        JFrame f = new JFrame("Registration Form");

        JLabel l1 = new JLabel("Name:");
        JLabel l2 = new JLabel("Email:");
        JLabel l3 = new JLabel("Phone:");
        JLabel l4 = new JLabel("Age:");
        JLabel l5 = new JLabel("Gender:");
        JLabel l6 = new JLabel("Address:");
        JLabel l7 = new JLabel("City:");
        JLabel l8 = new JLabel("State:");
        JLabel l9 = new JLabel("Country:");
        JLabel l10 = new JLabel("Password:");

        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();
        JTextField t3 = new JTextField();
        JTextField t4 = new JTextField();
        JTextField t6 = new JTextField();
        JTextField t7 = new JTextField();
        JTextField t8 = new JTextField();
        JTextField t9 = new JTextField();

        JPasswordField t10 = new JPasswordField();

        String gender[] = {"Male","Female"};
        JComboBox cb = new JComboBox(gender);

        JButton btn = new JButton("Submit");

        // positions
        l1.setBounds(20,20,100,25); t1.setBounds(120,20,150,25);
        l2.setBounds(20,50,100,25); t2.setBounds(120,50,150,25);
        l3.setBounds(20,80,100,25); t3.setBounds(120,80,150,25);
        l4.setBounds(20,110,100,25); t4.setBounds(120,110,150,25);
        l5.setBounds(20,140,100,25); cb.setBounds(120,140,150,25);
        l6.setBounds(20,170,100,25); t6.setBounds(120,170,150,25);
        l7.setBounds(20,200,100,25); t7.setBounds(120,200,150,25);
        l8.setBounds(20,230,100,25); t8.setBounds(120,230,150,25);
        l9.setBounds(20,260,100,25); t9.setBounds(120,260,150,25);
        l10.setBounds(20,290,100,25); t10.setBounds(120,290,150,25);

        btn.setBounds(100,330,100,30);

        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String data =
                        "Name: " + t1.getText() +
                        "\nEmail: " + t2.getText() +
                        "\nPhone: " + t3.getText() +
                        "\nAge: " + t4.getText() +
                        "\nGender: " + cb.getSelectedItem() +
                        "\nAddress: " + t6.getText() +
                        "\nCity: " + t7.getText() +
                        "\nState: " + t8.getText() +
                        "\nCountry: " + t9.getText();

                JOptionPane.showMessageDialog(f, data);
            }
        });

        f.add(l1); f.add(t1);
        f.add(l2); f.add(t2);
        f.add(l3); f.add(t3);
        f.add(l4); f.add(t4);
        f.add(l5); f.add(cb);
        f.add(l6); f.add(t6);
        f.add(l7); f.add(t7);
        f.add(l8); f.add(t8);
        f.add(l9); f.add(t9);
        f.add(l10); f.add(t10);
        f.add(btn);

        f.setSize(320,420);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}