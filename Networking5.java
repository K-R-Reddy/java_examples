import java.io.*;
import java.net.*;
public class Networking5 {
    public static void main(String[] args) {
        try{
            Socket s = new Socket("localhost", 6666);
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());
            dos.writeUTF("Hello Server!");
            dos.flush();
            dos.close();
            s.close();
            System.out.println("Message sent to server.");
        }catch(Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
