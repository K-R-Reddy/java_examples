import java.io.*;
class Bread
{
public static void main(String args[])
{try{
File obj = new File("info1.txt");
FileInputStream fi= new FileInputStream(obj);
int b=fi.read();
fi.close();
System.out.println(b);
}
catch(Exception e)
{
System.out.println(e);
}
}
}