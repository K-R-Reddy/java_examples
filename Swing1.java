import javax.swing.*;
public class Swing1 {
    public static void main(String[] args) {
        JFrame j=new JFrame();
        JButton b=new JButton("Hello");
        b.setBounds(20, 50, 100, 50);
        JButton ib=new JButton(new ImageIcon("Vishnu logo.png"));
        ib.setBounds(20, 150, 250, 250);
        j.add(ib);
        j.add(b);
        j.setSize(500, 500);
        j.setLayout(null);
        j.setVisible(true);
    }
}
