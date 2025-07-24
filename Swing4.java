import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Swing4 implements ActionListener{
    JTextArea ta;
    JLabel l1,l2;
    JButton jb;
    Swing4(){
        JFrame f=new JFrame();
        l1=new JLabel();
        l1.setBounds(50,30,100,30);
        l2=new JLabel();
        l2.setBounds(170, 30, 100, 30);
        ta=new JTextArea("Write Something...");
        ta.setBounds(50,80,300,250);
        jb=new JButton("Count Words");
        jb.setBounds(130,350,130,30);
        f.add(ta);
        f.add(l1);
        f.add(l2);
        f.add(jb);
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
        jb.addActionListener(this);
    }
    public static void main(String args[]){
        new Swing4();
    }
    @Override
    public void actionPerformed(ActionEvent e){
       String str=ta.getText();
       String words[]=str.split("\\s");
       l1.setText("Words : "+words.length);
       l2.setText("Characters : "+str.length());
    }
}
