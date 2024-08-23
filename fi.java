import java.io.*;
import java.util.*;
public class fi
{
public static void main(String[] args)
{
try{
    Scanner s=new Scanner(System.in);
FileOutputStream fs=new FileOutputStream("new.txt");
FileInputStream fw=new FileInputStream("new.txt");
System.out.println("Enter any value into file : ");
int b=s.nextInt();
s.close();
fs.write(b);
fs.close();
int c=fw.read();
fw.close();
System.out.println(c);
}
catch(Exception e)
{
System.out.println(e);
}
}
}
