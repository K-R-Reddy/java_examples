import java.util.*;
public class perfect {
public static void main(String args[])
{
    Scanner p = new Scanner(System.in);
    int a,i,per=0;
    System.out.println("Enter number : ");
    a=p.nextInt();
    p.close();
    for(i=1;i<a;i++)
    {
        if(a%i==0)
        {
            per+=i;
        }
    }
    if(per==a)
    {
        System.out.println(a+" is perfect number");
    }
    else
    {
        System.out.println(a+" is not perfect number");
     }
   }
 }