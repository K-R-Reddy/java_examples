import java.awt.*;
public class Awt9 extends Frame{
    Awt9(){
        Button b1=new Button("NORTH");
        b1.setBackground(Color.green);
        add(b1,BorderLayout.NORTH); 
        Button b2=new Button("SOUTH");
        b2.setBackground(Color.blue);
        add(b2,BorderLayout.SOUTH);
        Button b3=new Button("EAST");
        b3.setBackground(Color.orange);
        add(b3,BorderLayout.EAST);
        Button b4=new Button("WEST");
        b4.setBackground(Color.yellow);
        add(b4,BorderLayout.WEST);
        Button b5=new Button("CENTER");
        b5.setBackground(Color.lightGray);
        add(b5,BorderLayout.CENTER);
        setSize(500,500);
        setBackground(Color.black);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Awt9();
    }
}
