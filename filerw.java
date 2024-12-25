import java.io.*;
public class filerw {
    public static void main(String[] args) throws IOException {
    FileWriter fw=new FileWriter("example1.txt");
    fw.write("This is my first file program");
    fw.close();
    
    FileReader fr=new FileReader("example1.txt");
    BufferedReader br=new BufferedReader(fr);
    String line;
    while((line=br.readLine())!=null){
        System.out.println(line);
    }
    br.close();
    }
    
}
