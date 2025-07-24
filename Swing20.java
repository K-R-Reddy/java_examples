import java.awt.*;
import javax.swing.*;
public class Swing20 {
    Swing20(){
        JFrame f=new JFrame("Panel Example");
        JPanel p1=new JPanel();
        p1.setBounds(40, 30, 200, 200);
        p1.setBackground(Color.gray);
        JButton b1=new JButton("Button 1");
        b1.setBounds(50, 100, 95, 30);
        b1.setForeground(Color.white);
        b1.setBackground(Color.blue);
        p1.add(b1);
        JButton b2=new JButton("Button 2");
        b2.setBounds(50, 150, 95, 30);
        p1.add(b2);
        b2.setForeground(Color.white);
        b2.setBackground(Color.red);
        f.add(p1);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new Swing20();
    }
}