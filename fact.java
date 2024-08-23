import java.util.*;
public class fact {
public static void main(String args[])
{
    Scanner f=new Scanner(System.in);
    int a,i,fac=1;
    System.out.println("Enter a number : ");
    a=f.nextInt();
    f.close();
    for(i=1;i<=a;i++)
    {
        fac*=i;
    }
    System.out.println("Factorial of "+a+" is "+fac);
}    
}
