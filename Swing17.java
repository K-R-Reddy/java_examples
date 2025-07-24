import javax.swing.*;
public class Swing17 {
public static void main(String[] args) {
    JFrame frame = new JFrame("JSpinner Example");
    JSpinner spinner = new JSpinner(new SpinnerNumberModel(0, 0, 1000, 5));
    JPanel panel = new JPanel();
    panel.add(spinner);
    frame.add(panel);
    frame.setLayout(new java.awt.FlowLayout());
    frame.setSize(300, 200);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
}    
}
