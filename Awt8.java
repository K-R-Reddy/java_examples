import java.awt.*;
public class Awt8 extends Frame{
    Awt8(){
        Button b1=new Button("1");
        b1.setBackground(Color.green);
        add(b1); 
        Button b2=new Button("2");
        b2.setBackground(Color.blue);
        add(b2);
        Button b3=new Button("3");
        b3.setBackground(Color.orange);
        add(b3);
        Button b4=new Button("4");
        b4.setBackground(Color.yellow);
        add(b4);
        Button b5=new Button("5");
        b5.setBackground(Color.lightGray);
        add(b5);
        setSize(100,200);
        setBackground(Color.black);
        setLayout(new FlowLayout(FlowLayout.RIGHT));
        setVisible(true);
    }
    public static void main(String[] args) {
        new Awt8();
    }
}
