import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class KeyPad extends JPanel implements ActionListener {
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, be, bp, bm, bs, bd, bdd;
    JTextArea jtf;

    KeyPad() {
        setLayout(new GridLayout(4, 4));

        // temp text feild
        jtf = new JTextArea("", 10, 20);
        // jtf.setSize(40,40);
        add(jtf);

        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        b0 = new JButton("0");

        be = new JButton("=");
        bp = new JButton("+");
        bm = new JButton("-");
        bs = new JButton("*");
        bd = new JButton("/");
        bdd = new JButton(".");

        b0.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);

        be.addActionListener(this);
        bp.addActionListener(this);
        bm.addActionListener(this);
        bs.addActionListener(this);
        bd.addActionListener(this);
        bdd.addActionListener(this);

        add(b1);
        add(b2);
        add(b3);
        add(bp);
        add(b4);
        add(b5);
        add(b6);
        add(bm);
        add(b7);
        add(b8);
        add(b9);
        add(bs);
        add(b0);
        add(bdd);
        add(be);
        add(bd);
    }

    public void actionPerformed(ActionEvent e) {
        String tok = e.getActionCommand();

        if (tok.charAt(0) == '=')
            calculate();

        jtf.setText(jtf.getText() + e.getActionCommand());
    }

    void calculate() {
        String eqn = jtf.getText();

        int val = 0;
        String nnum = "";

        for (int i = 0; i < eqn.length(); i++) {
            char tok = eqn.charAt(i);

            if (tok == '+') {
                val = val + Integer.parseInt(nnum);
                nnum = "";
            }
            if (tok == '-') {
                val = val - Integer.parseInt(nnum);
                nnum = "";
            }
            if (tok == '*') {
                val = val * Integer.parseInt(nnum);
                nnum = "";
            }
            if (tok == '/') {
                val = val / Integer.parseInt(nnum);
                nnum = "";
            }

            if (tok == '0' || tok == '1' || tok == '2' || tok == '3' || tok == '4' || tok == '5' || tok == '6'
                    || tok == '7' || tok == '8' || tok == '9') {
                nnum += tok;
            }
        }

        jtf.setText(Integer.toString(val));
    }
}

class ResultInput extends JPanel {
    JTextArea jtf;

    ResultInput() {
        jtf = new JTextArea("", 10, 20);
        // jtf.setSize(40,40);

        add(jtf);
    }
}

public class a5a1 extends JFrame {

    a5a1() {
        setLayout(new GridLayout(0, 1));
        // add(new ResultInput());
        add(new KeyPad());
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String args[]) {
        new a5a1();
    }
}