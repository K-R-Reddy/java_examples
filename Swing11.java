import javax.swing.*;
class Swing11{
    JMenu menu,submenu;
    JMenuItem i1,i2,i3,i4,i5;
    Swing11(){
        JFrame f=new JFrame("Separator Example");
        JMenuBar mb=new JMenuBar();
        menu=new JMenu("File");
        submenu=new JMenu("Edit");
        
        i1=new JMenuItem("New");
        i2=new JMenuItem("Open");
        i3=new JMenuItem("Save");
        i4=new JMenuItem("Cut");
        i5=new JMenuItem("Copy");
        
        menu.add(i1);
        menu.addSeparator(); 
        menu.add(new JMenuItem("Paste")); 
        menu.addSeparator(); 
        menu.add(new JMenuItem("Delete")); 
        menu.addSeparator(); 
        menu.add(submenu); 
        submenu.addSeparator(); 
        submenu.add(new JMenuItem("Select All")); 
        submenu.add(new JMenuItem("Find")); 
        submenu.addSeparator(); 
        submenu.add(new JMenuItem("Replace"));
        menu.add(i2);
        menu.addSeparator();
        menu.add(i3);
        
        submenu.add(i4);
        submenu.add(i5);
        
        mb.add(menu);
        mb.add(submenu);
        
        f.setJMenuBar(mb);
        
        f.setSize(400,400);
        f.setVisible(true);
    }
    public static void main(String args[]){
        new Swing11();
    }
}