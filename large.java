import java.util.*;
public class large {
    public static void main(String args[])
{
    Scanner l=new Scanner(System.in);
    int a,b,c;
    System.out.println("Enter any three numbers");
    a=l.nextInt();
    b=l.nextInt();
    c=l.nextInt();
    if(a>=b && a>=c)
    {
        System.out.println(a+" is large");
    }
    else if(b>=c)
    {
        System.out.println(b+" is large");
    }
    else
    {
        System.out.println(c+" is large");
    }
    l.close();
}}
