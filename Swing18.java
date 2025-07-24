import javax.swing.*;
import java.awt.event.*;
import java.io.*;
public class Swing18 extends JFrame implements ActionListener{
    JMenuBar mb;
    JMenu file, edit, help;
    JMenuItem open, save, exit, cut, copy, paste, about;
    JTextArea textArea;
    Swing18(){
        setTitle("JFileChooser Example");
        open = new JMenuItem("Open File");
        save = new JMenuItem("Save File");
        exit = new JMenuItem("Exit");
        cut = new JMenuItem("Cut");
        copy = new JMenuItem("Copy");
        paste = new JMenuItem("Paste");
        about = new JMenuItem("About");
        open.addActionListener(this);
        save.addActionListener(this);
        exit.addActionListener(this);
        cut.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);
        about.addActionListener(this);
        file = new JMenu("File");
        edit = new JMenu("Edit");
        help = new JMenu("Help");
        file.add(open);
        file.add(save);
        file.add(exit);
        edit.add(cut);
        edit.add(copy);
        edit.add(paste);
        help.add(about);
        mb = new JMenuBar();
        mb.setBounds(0, 0, 800, 30);
        mb.add(file);
        mb.add(edit);
        mb.add(help);
        textArea = new JTextArea();
        textArea.setBounds(0, 30, 800, 570);
        add(mb);
        add(textArea);
        setLayout(null);
        setSize(800, 600);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==open){
            JFileChooser fileChooser = new JFileChooser();
            int result = fileChooser.showOpenDialog(this);
            if(result == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                try (BufferedReader reader = new BufferedReader(new FileReader(selectedFile))) {
                    textArea.read(reader, null);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this, "Error opening file: " + ex.getMessage());
                }
            }
        } else if(e.getSource()==save){
            JFileChooser fileChooser = new JFileChooser();
            int result = fileChooser.showSaveDialog(this);
            if(result == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(selectedFile))) {
                    textArea.write(writer);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this, "Error saving file: " + ex.getMessage());
                }
            }
        } else if(e.getSource()==exit){
            System.exit(0);
        } else if(e.getSource()==cut){
            textArea.cut();
        } else if(e.getSource()==copy){
            textArea.copy();
        } else if(e.getSource()==paste){
            textArea.paste();
        } else if(e.getSource()==about){
            JOptionPane.showMessageDialog(this, "JFileChooser Example\nCreated by OpenAI");
        }
    }
    public static void main(String[] args) {
        new Swing18();
    }
}