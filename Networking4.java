import java.net.*;
import java.io.DataInputStream;
public class Networking4 {
    public static void main(String[] args) {
        try{
            ServerSocket ss=new ServerSocket(6666);
            Socket s=ss.accept();
            DataInputStream dis=new DataInputStream(s.getInputStream());
            String str=(String)dis.readUTF();
            System.out.println("Message received: " + str);
            ss.close();
            s.close();
            dis.close();
        }catch(Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
