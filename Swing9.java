import javax.swing.*;
import java.awt.event.*;
class Swing9{
    public static void main(String[] args) {
        JFrame f=new JFrame("PopupMenu Example") ;
        JPopupMenu pm=new JPopupMenu();
        JMenuItem i1=new JMenuItem("Open");
        JMenuItem i2=new JMenuItem("Copy");
        JMenuItem i3=new JMenuItem("Cut");
        JMenuItem i4=new JMenuItem("Paste");
        JMenuItem i5=new JMenuItem("New");
        pm.add(i1);
        pm.add(i2);
        pm.add(i3);
        pm.add(i4);
        pm.add(i5);
        f.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                pm.show(f, e.getX(), e.getY());
            }
        });
        f.add(pm);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    } 
}