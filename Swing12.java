import javax.swing.*;
public class Swing12 extends JFrame {
    JProgressBar jb;int i=0,num=0;
    public Swing12() {
        jb = new JProgressBar(0, 2000);
        jb.setBounds(40, 40, 160, 30);
        jb.setValue(0);
        jb.setStringPainted(true);
        JButton b = new JButton("Start");
        b.setBounds(40, 80, 80, 30);
        b.addActionListener(e -> {
            Thread t = new Thread(() -> {
                while (i <= 2000) {
                    jb.setValue(i);
                    i += 10;
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
            });
            t.start();
        });
        add(b);
        add(jb);
        setSize(300, 200);
        setLayout(null);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new Swing12();
    }
    
}
