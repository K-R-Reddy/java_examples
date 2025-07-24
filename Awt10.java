import java.awt.*;
public class Awt10 extends Frame{
    Awt10(){
        Button b1=new Button("1");
        b1.setBackground(Color.green);
        add(b1); 
        Button b2=new Button("2");
        b2.setBackground(Color.blue);
        add(b2);
        Button b3=new Button("3");
        b3.setBackground(Color.green);
        add(b3);
        Button b4=new Button("4");
        b4.setBackground(Color.blue);
        add(b4);
        Button b5=new Button("5");
        b5.setBackground(Color.orange);
        add(b5);
        Button b6=new Button("6");
        b6.setBackground(Color.blue);
        add(b6); 
        Button b7=new Button("7");
        b7.setBackground(Color.orange);
        add(b7);
        Button b8=new Button("8");
        b8.setBackground(Color.yellow);
        add(b8);
        Button b9=new Button("9");
        b9.setBackground(Color.orange);
        add(b9);
        Button b10=new Button("10");
        b10.setBackground(Color.yellow);
        add(b10);
        Button b11=new Button("11");
        b11.setBackground(Color.green);
        add(b11);
        setSize(300,400);
        setBackground(Color.black);
        setLayout(new GridLayout(4,3,5,5));
        setVisible(true);
    }
    public static void main(String[] args) {
        new Awt10();
    }
}
