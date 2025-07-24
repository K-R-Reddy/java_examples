import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Swing3 implements ActionListener{
    JLabel l1,l2,l3,l4;
    JTextField tf1,tf2,tf3;
    JButton b1,b2,b3;
    Swing3(){
    JFrame f=new JFrame();
    l1=new JLabel("Enter Number 1 ::");
    l1.setBounds(5, 50, 100, 30);
    tf1=new JTextField();
    tf1.setBounds(120,50,100,30);
    l2=new JLabel("Enter Number 2 ::");
    l2.setBounds(5,90,100,30);
    tf2=new JTextField();
    tf2.setBounds(120,90,100,30);
    l3=new JLabel("Result ::");
    l3.setBounds(5,130,100,30);
    tf3=new JTextField();
    tf3.setEditable(false);
    tf3.setBounds(120, 130, 100, 30);
    l4=new JLabel("Operations ::");
    l4.setBounds(5,175,100,30);
    b1=new JButton("+");
    b1.setBounds(100,175,50,30);
    b2=new JButton("-");
    b2.setBounds(200,175,50,30);
    b3=new JButton("*");
    b3.setBounds(300,175,50,30);
    f.add(l1);
    f.add(l2);
    f.add(l3);
    f.add(l4);
    f.add(tf1);
    f.add(tf2);
    f.add(tf3);
    f.add(b1);
    f.add(b2);
    f.add(b3);
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    f.setSize(800,800);
    f.setLayout(null);
    f.setVisible(true);
    }
    public static void main(String[] args) {
        new Swing3();
    }
    @Override
    public void actionPerformed(ActionEvent e) { 
        String n1=tf1.getText();
        String n2=tf2.getText();
        int num1=Integer.parseInt(n1);
        int num2=Integer.parseInt(n2);
        int ans=0;
        if(e.getSource()==b1){
          ans=num1+num2;
        }else if(e.getSource()==b2){
          ans=num1-num2;
        }else if(e.getSource()==b3){
            ans=num1*num2;
        }
        String res=String.valueOf(ans);
        tf3.setText(res);
    }
}
