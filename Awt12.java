import java.awt.*;
import java.awt.event.MouseEvent;

import javax.swing.event.MouseInputListener;
public class Awt12 extends Frame implements MouseInputListener{
    Label l;
    Awt12(){
        addMouseListener(this);
        l=new Label();
        l.setBounds(20, 50, 100, 20);
        add(l);
        setSize(500,500);
        setLayout(null);
        setVisible(true);
    }
    public void mouseClicked(MouseEvent e){l.setText("Mouse Clicked");}
    public void mouseEntered(MouseEvent e){l.setText("Mouse Entered");}
    public void mouseExited(MouseEvent e){l.setText("Mouse Exited");}
    public void mousePressed(MouseEvent e){l.setText("Mouse Pressed");}
    public void mouseReleased(MouseEvent e){l.setText("Mouse Released");}
    public static void main(String[] args) {
        new Awt12();
    }
    @Override
    public void mouseDragged(MouseEvent e) {
        throw new UnsupportedOperationException("Mouse Dragged");
    }
    @Override
    public void mouseMoved(MouseEvent e) {
        throw new UnsupportedOperationException("Mouse Moved");
    }
}
