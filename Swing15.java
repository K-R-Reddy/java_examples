import javax.swing.*;
public class Swing15 {
    JFrame f;
    Swing15() {
        f = new JFrame("JTabbedPane Example");
        JTextArea ta = new JTextArea("This is the main tab content.");
        JPanel p1= new JPanel();
        p1.add(ta);
        JPanel p2= new JPanel();
        JPanel p3= new JPanel();
        JTabbedPane tp = new JTabbedPane();
        tp.setBounds(50, 50, 200, 200);
        tp.addTab("Main", p1);
        tp.addTab("Settings", p2);
        tp.addTab("About", p3);
        f.add(tp);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new Swing15();
    }
}
