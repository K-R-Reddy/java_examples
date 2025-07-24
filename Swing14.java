import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class Swing14 extends JFrame implements ActionListener {
    JButton b;Container c;
   Swing14() {
        c=getContentPane();
        c.setLayout(new FlowLayout());
        b=new JButton("color");
        b.addActionListener(this);
        c.add(b);
        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Color Chooser Example");
   }
    public void actionPerformed(ActionEvent e) {
        Color initialcolor = Color.RED;
        Color color = JColorChooser.showDialog(this, "Choose a color", initialcolor);
            c.setBackground(color);
    }


    public static void main(String[] args) {
        new Swing14();
    }
    
}
