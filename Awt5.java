import java.awt.*;
public class Awt5 {
public static void main(String[] args) {
    Frame frame=new Frame("My Frame");
    TextField t1=new TextField("This is K.RajeswaraReddy");
    t1.setBackground(Color.orange);
    t1.setBounds(100, 100, 300, 20);
    TextField t2=new TextField();
    t2.setBackground(Color.orange);
    t2.setBounds(100, 150, 300, 20);
    TextArea a1=new TextArea("This is Text Area");
    a1.setBackground(Color.green);
    a1.setBounds(100, 200, 300, 100);
    TextArea a2=new TextArea();
    a2.setBackground(Color.green);
    a2.setBounds(100, 350, 300, 100);
    frame.add(t1);
    frame.add(t2);
    frame.add(a1);
    frame.add(a2);
    frame.setLayout(null);
    frame.setSize(500,500);
    frame.setBackground(Color.black);
    frame.setVisible(true);
}
}