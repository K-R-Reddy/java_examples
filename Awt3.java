import java.awt.*;
public class Awt3 extends Frame{
    Awt3(){
        Button b=new Button();
        b.setLabel("Click me");
        b.setBounds(110,140,80,20);
        b.setBackground(Color.green);
        add(b);
        setSize(300,300);
        setBackground(Color.black);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Awt3();
    }
}
