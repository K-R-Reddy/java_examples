import java.awt.*;
public class Awt2 {
    public static void main(String[] args) {
    Frame frame=new Frame("My Frame");
        frame.setSize(500,500);
        frame.setBackground(Color.red);
        frame.setLayout(null);
        Panel p=new Panel();
        p.setSize(300,300);
        p.setBackground(Color.blue);
        frame.add(p);
        frame.setVisible(true);
    }
}
