import javax.swing.*;
public class Swing6 {
    public static void main(String[] args) {
        JFrame f=new JFrame("Table Example");
        String data[][]={{"12","Raja","100000"},{"57","Rakesh","80000"},{"26","Sai","50000"}};
        String col[]={"Roll No","Name","Salary"};
        JTable tb=new JTable(data, col);
        tb.setBounds(30, 100, 300, 400);
        JScrollPane sp=new JScrollPane(tb);
        f.add(sp);
        f.setSize(400,400);
        f.setVisible(true);
        f.setLayout(null);
    }
}
