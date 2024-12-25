import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class bytewr {
    public static void main(String[] args) throws IOException{
        FileInputStream fis=new FileInputStream("testbyte.bin");
        FileOutputStream fos=new FileOutputStream("testbyte.bin");
        String s="Hello! This is Rajesh";
        byte b[]=s.getBytes();
        fos.write(b);
        fos.flush();
        fos.close();
        int c;
        while(( c=fis.read())!=-1){
        System.out.print((char)c);
        }
        fis.close();
    }
    
}
