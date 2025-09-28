import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Calc extends JFrame implements ActionListener {
    JTextField textF;
    JButton[] buttons = new JButton[16];
    String[] btnTexts = { "1", "2", "3", "+", "4", "5", "6", "-", "7", "8", "9", "*", "0", ".", "=", "/" };

    Calc() {
        setLayout(new GridLayout(1, 1));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTextField textF = new JTextField(100);
        add(textF);

        JPanel keypad = new JPanel();
        keypad.setLayout(new GridLayout(4, 4));

        for (int i = 0; i < 16; i++) {
            buttons[i] = new JButton(btnTexts[i]);
            buttons[i].addActionListener(this);
            keypad.add(buttons[i]);
        }

        add(keypad);
        setSize(500, 500);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String tok = e.getActionCommand();

        if (tok.charAt(0) == '=') {
        }
        // calculate();
        textF.setText(textF.getText() + e.getActionCommand());
    }
}

public class slip12_2 {
    public static void main(String args[]) {
        new Calc();
    }
}
