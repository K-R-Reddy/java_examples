import java.util.*;
class Stud
{  Scanner s=new Scanner(System.in);
        int count=0;
    void read()
    {  
        System.out.println("Enter Name : ");
        String sname=s.next();
        count++;
        System.out.println(count+". "+sname);
        
    }
}

public class Objmet {

    public static void main(String[] args) {
        Stud s1=new Stud();
        for(int i=0;i<10;i++)
        s1.read();
          }
}