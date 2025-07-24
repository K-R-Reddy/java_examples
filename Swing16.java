import javax.swing.*;
public class Swing16 extends JFrame {
    Swing16() {
        setTitle("JSlider Example");
        JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 100, 50);
        JPanel panel = new JPanel();
        panel.add(slider);
        add(panel);
        pack();
        setSize(400, 400);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Swing16();
    }
    
}
