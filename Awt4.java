import java.awt.*;
public class Awt4 extends Frame{
     Awt4(){
        Label l1=new Label("Gender ::");
        l1.setBounds(30, 70, 55, 15);
        l1.setBackground(Color.LIGHT_GRAY);
        Checkbox c1=new Checkbox("Male");
        c1.setBounds(30, 100, 45, 15);
        c1.setBackground(Color.green);
        Checkbox c2=new Checkbox("Female");
        c2.setBounds(100,100,60,15); 
        c2.setBackground(Color.red);
        Checkbox c3=new Checkbox("Others");
        c3.setBounds(185,100,60,15); 
        c3.setBackground(Color.yellow);
        add(l1);
        add(c1);
        add(c2);
        add(c3);
        setBackground(Color.black);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
     }
     public static void main(String[] args) {
        new Awt4();
     }
}
