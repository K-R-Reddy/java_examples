import java.awt.event.*;
import javax.swing.*;
public class Swing2 extends JFrame{
    Swing2(){
        JTextField jf=new JTextField();
        jf.setBounds(50, 50, 300, 30);
        JButton jb=new JButton("Click Me");
        jb.setBounds(50, 100, 100, 30);
        add(jf);
        add(jb);
        jb.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e){
            jf.setText("Are you Fool?? Don't Listen Anyone...");
           } 
        });
        setLayout(null);
        setVisible(true);
        setSize(500,500);
    }
    public static void main(String[] args) {
        new Swing2();
    }
}
