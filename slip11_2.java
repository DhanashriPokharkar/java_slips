/* Write a program to design a screen using Awt that will take a user name and password. If the
user name and password are not same, raise an Exception with appropriate message. User
can have 3 login chances only. Use clear button to clear the TextFields. */

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class slip11_2 extends JFrame implements ActionListener {

    static String username = "AtharvK";
    static String password = "password";
    static int attempt = 0;

    JLabel l1, l2, l3;
    JTextField f1, f2;
    JButton b1, b2;

    slip11_2() {

        setLayout(new GridLayout(7, 1));

        l1 = new JLabel("Username");
        l2 = new JLabel("Password");
        l3 = new JLabel("");

        f1 = new JTextField(10);
        f2 = new JTextField(10);

        b1 = new JButton("Sign in");
        b1.addActionListener(this);
        b2 = new JButton("Clear");
        b2.addActionListener(this);

        add(l1);
        add(f1);
        add(l2);
        add(f2);
        add(l3);
        add(b1);
        add(b2);

        setSize(600, 600);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand() == "Clear") {
            f1.setText("");
            f2.setText("");
        }

        if (e.getActionCommand() == "Sign in") {
            if (f1.getText() == username && f2.getText() == password) {
                l3.setText("Signed in successfully");
            } else {
                attempt++;
                l3.setText("Incorrect attempt " + attempt);
            }
        }
    }

    public static void main(String args[]) {
        new slip4_2();
    }
}
