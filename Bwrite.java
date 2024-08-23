import java.io.*;
import java.util.*;
class Bwrite
{
public static void main(String args[])
{try{
FileOutputStream fo= new FileOutputStream("info1.txt");
byte s;
Scanner si=new Scanner(System.in);
System.out.println("Enter byte to write file");
s=si.nextByte();
si.close();
fo.write(s);
System.out.println("Sucussful");
fo.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}