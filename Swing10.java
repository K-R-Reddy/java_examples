import javax.swing.*;
public class Swing10 {
    public static void main(String args[]){
        JFrame f=new JFrame();
        String names[]={"Raja","Teja","Kiran","Sridhar"};
        JList<String> jl=new JList<>(names);
        jl.setBounds(30,50,150,220);
        JComboBox<String> jcb=new JComboBox<>(names);
        jcb.setBounds(30,270,100,30);
        f.add(jcb);
        f.add(jl);
        f.setSize(600,600);
        f.setVisible(true);
        f.setLayout(null);
    }
}
