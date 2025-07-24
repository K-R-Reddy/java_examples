import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Swing19 extends JFrame implements ItemListener {
    JToggleButton button;
    Swing19() {
        setTitle("JToggleButton Example");
        setLayout(new FlowLayout());
        setJToggleButton();
        setAction();
        setSize(200,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void setJToggleButton() {
        button = new JToggleButton("ON");
        add(button);
    }
    public void setAction() {
        button.addItemListener(this);
    }
    public void itemStateChanged(ItemEvent e) {
        if (button.isSelected()) {
            button.setText("OFF");
        } else {
            button.setText("ON");
        }
    }
    public static void main(String[] args) {
        new Swing19();
    }
    
}
