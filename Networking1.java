import java.io.InputStream;
import java.net.*;
public class Networking1 {
    public static void main(String[] args) {
        try {
            @SuppressWarnings("deprecation")
            URL url = new URL("https://www.example.com:8080/path/to/resource?query=123#section");
            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Host: " + url.getHost());
            System.out.println("Port: " + url.getPort());
            System.out.println("File: " + url.getFile());
            System.out.println("Path: " + url.getPath());
            System.out.println("Query: " + url.getQuery());
            System.out.println("Ref: " + url.getRef());
            System.out.println("Authority: " + url.getAuthority());
            System.out.println("User Info: " + url.getUserInfo());
            InetAddress inet = InetAddress.getByName("www.nptel.com");
            System.out.println("Host Name: " + inet.getHostName());
            System.out.println("IP Address: " + inet.getHostAddress());
            HttpURLConnection httpcon = (HttpURLConnection) url.openConnection();
            for (int i = 1; i <= 5; i++) {
                System.out.println("Header Field " + httpcon.getHeaderFieldKey(i) + ": " + httpcon.getHeaderField(i));
            }
            httpcon.disconnect();
            URLConnection urlcon=url.openConnection();
            InputStream is=urlcon.getInputStream();
            int ch;
            while((ch=is.read())!=-1) {
                System.out.print((char)ch);
            }
            is.close();
        }catch(Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
