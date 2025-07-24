import java.net.*;
import java.io.*;
public class Networking7 {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("localhost", 3333);
        DataInputStream dis = new DataInputStream(s.getInputStream());
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = "", str2 = "";
        while (!str1.equals("stop")) {
            str2 = br.readLine();
            dos.writeUTF(str2);
            dos.flush();
            str1 = dis.readUTF();
            System.out.println("Server says: " + str1);
        }
        s.close();
        dis.close();
        dos.close();
        System.out.println("Client closed.");
    }
}
