import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
public class Swing13 {
    JFrame f;
    Swing13(){
        f= new JFrame("JTree Example");
        DefaultMutableTreeNode style = new DefaultMutableTreeNode("Style");
        DefaultMutableTreeNode color = new DefaultMutableTreeNode("Color");
        DefaultMutableTreeNode font = new DefaultMutableTreeNode("Font");
        style.add(color);
        style.add(font);
        DefaultMutableTreeNode red = new DefaultMutableTreeNode("Red");
        DefaultMutableTreeNode green = new DefaultMutableTreeNode("Green");
        DefaultMutableTreeNode blue = new DefaultMutableTreeNode("Blue");
        color.add(red);
        color.add(green);
        color.add(blue);
        DefaultMutableTreeNode arial = new DefaultMutableTreeNode("Arial");
        DefaultMutableTreeNode times = new DefaultMutableTreeNode("Times New Roman");
        DefaultMutableTreeNode verdana = new DefaultMutableTreeNode("Verdana");
        font.add(arial);
        font.add(times);
        font.add(verdana);
        JTree tree = new JTree(style);
        tree.setBounds(20, 20, 150, 200);
        JScrollPane sp = new JScrollPane(tree);
        sp.setBounds(20, 20, 150, 200);
        f.add(sp);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new Swing13();
    }
}
