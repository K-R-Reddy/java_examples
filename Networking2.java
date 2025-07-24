import java.net.*;
public class Networking2 {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds=new DatagramSocket(3000);
        byte[] buf = new byte[1024];
        DatagramPacket dp = new DatagramPacket(buf, buf.length);
        ds.receive(dp);
        String received = new String(dp.getData(), 0, dp.getLength());
        System.out.println("Received: " + received);
        ds.close();
    }
}
