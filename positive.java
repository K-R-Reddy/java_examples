import java.util.Scanner;

public class positive
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter any number : ");
        int a=s.nextInt();
        s.close();
        if(a>0)
        {
            System.out.println(a+" is Positive Number");
        }
        else if(a<0)
        {
             System.out.println(a+" is Negative Number");
        }
        else
        {
            System.out.println(a+" is equal to Zero");
        }
    }
} 