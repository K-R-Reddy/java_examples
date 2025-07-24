import java.awt.*;
public class Awt7 {
public static void main(String[] args) {
    Frame frame=new Frame("My Frame");
    Scrollbar s1=new Scrollbar(Scrollbar.HORIZONTAL);
    s1.setBounds(50, 100, 200, 20);
    Scrollbar s2=new Scrollbar();
    s2.setBounds(130, 150, 20, 200);
    frame.add(s1);
    frame.add(s2);
    frame.setSize(500,500);
    frame.setBackground(Color.red);
    frame.setLayout(null);
    frame.setVisible(true);
}
}
