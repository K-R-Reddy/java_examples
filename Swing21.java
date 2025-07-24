import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class Swing21 extends JFrame implements ActionListener {
    static JFrame f;
    static JTextField l;
    String s0, s1, s2;

    Swing21() {
        s0 = s1 = s2 = "";
    }

    public static void main(String[] args) {
        f = new JFrame("Swing Calculator");

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        Swing21 s = new Swing21();

        l = new JTextField(16);
        l.setEditable(false);

        // Create buttons
        JButton b0 = new JButton("0");
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");
        JButton b7 = new JButton("7");
        JButton b8 = new JButton("8");
        JButton b9 = new JButton("9");
        JButton ba = new JButton("+");
        JButton bs = new JButton("-");
        JButton bm = new JButton("*");
        JButton bd = new JButton("/");
        JButton be = new JButton("C");
        JButton beq = new JButton("=");
        JButton beql = new JButton(".");

        // Register listeners
        JButton[] buttons = { b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, ba, bs, bm, bd, be, beq, beql };
        for (JButton btn : buttons) {
            btn.addActionListener(s);
        }

        // Create panel and set layout
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(5, 4, 5, 5)); // rows, columns, hgap, vgap

        // Add display at top in a separate panel
        JPanel topPanel = new JPanel();
        topPanel.add(l);

        // Add buttons in order
        p.add(b7); p.add(b8); p.add(b9); p.add(bd);
        p.add(b4); p.add(b5); p.add(b6); p.add(bm);
        p.add(b1); p.add(b2); p.add(b3); p.add(bs);
        p.add(beql); p.add(b0); p.add(beq); p.add(ba);
        p.add(be);  // Clear button at the end

        // Set background and frame details
        p.setBackground(Color.blue);
        f.add(topPanel, BorderLayout.NORTH);
        f.add(p, BorderLayout.CENTER);
        f.setSize(250, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();

        if ((s.charAt(0) >= '0' && s.charAt(0) <= '9') || s.equals(".")) {
            if (!s1.equals("")) {
                s2 = s2 + s;
            } else {
                s0 = s0 + s;
            }
            l.setText(s0 + s1 + s2);
        } else if (s.equals("C")) {
            s0 = s1 = s2 = "";
            l.setText("");
        } else if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
            if (!s0.equals("") && s1.equals("")) {
                s1 = s;
                l.setText(s0 + s1);
            }
        } else if (s.equals("=")) {
            if (!s0.equals("") && !s1.equals("") && !s2.equals("")) {
                double result = 0;
                double d0 = Double.parseDouble(s0);
                double d2 = Double.parseDouble(s2);

                switch (s1) {
                    case "+":
                        result = d0 + d2;
                        break;
                    case "-":
                        result = d0 - d2;
                        break;
                    case "*":
                        result = d0 * d2;
                        break;
                    case "/":
                        if (d2 == 0) {
                            l.setText("Error: Div by 0");
                            s0 = s1 = s2 = "";
                            return;
                        } else {
                            result = d0 / d2;
                        }
                        break;
                }

                s0 = Double.toString(result);
                s1 = s2 = "";
                l.setText(s0);
            }
        }
    }
}
