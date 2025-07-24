import java.awt.*;
public class Awt6 {
public static void main(String[] args) {
    Frame frame=new Frame("My Frame");
    Label c=new Label("Select Your Course :: ");
    c.setBounds(30, 100, 150, 20);
    List l=new List();
    l.add("CSE");
    l.add("ECE");
    l.add("EEE");
    l.add("MECH");
    l.setBounds(30, 122, 150, 40);
    l.setBackground(Color.LIGHT_GRAY);
    List l1=new List();
    l1.add("CSE");
    l1.add("ECE");
    l1.add("EEE");
    l1.add("MECH");
    l1.setBounds(30, 180, 150, 80);
    l1.setBackground(Color.LIGHT_GRAY);
    Choice c1=new Choice();
    c1.add("CSE");
    c1.add("ECE");
    c1.add("EEE");
    c1.add("MECH");
    c1.setBounds(30, 280, 0, 0);
    c1.setBackground(Color.LIGHT_GRAY);
    frame.add(c);
    frame.add(l);
    frame.add(l1);
    frame.add(c1);
    frame.setSize(500,500);
    frame.setBackground(Color.blue);
    frame.setLayout(null);
    frame.setVisible(true);
}
}
