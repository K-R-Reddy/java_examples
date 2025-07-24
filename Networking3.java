import java.net.*;
public class Networking3 {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket();
        String message = "Hello, this is a test message!";
        InetAddress ip = InetAddress.getByName("127.0.0.1");
        DatagramPacket dp = new DatagramPacket(message.getBytes(), message.length(), ip, 3000);
        ds.send(dp);
        System.out.println("Message sent: " + message);
        ds.close();
    }
}
