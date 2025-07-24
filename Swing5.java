import javax.swing.*;
public class Swing5 {
public static void main(String[] args) {
    JFrame f=new JFrame("Radio Button");
    JRadioButton rb1=new JRadioButton("A) Male");
    JRadioButton rb2=new JRadioButton("B) Female");
    JRadioButton rb3=new JRadioButton("Others");
    ButtonGroup bg=new ButtonGroup();
    bg.add(rb1);bg.add(rb2);bg.add(rb3);
    rb1.setBounds(75, 50, 100, 30);
    rb2.setBounds(75,100,100,30);
    rb3.setBounds(75, 150, 100, 30);
    f.add(rb1);
    f.add(rb2);
    f.add(rb3);
    f.setSize(300,300);
    f.setLayout(null);
    f.setVisible(true);
}  
}
