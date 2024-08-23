import java.util.Scanner;

/**
 * Palindrome
 */
public class Palindrome {

     public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter any Number : ");
        int n=s.nextInt();
        s.close();
        int r,rev=0;
        int temp=n;
        while(n>0)
        {
           r=n%10;
           rev=(rev*10)+r;
           n/=10;
        }
    if(temp==rev)
    {
        System.out.println(rev+" is a Palindrome");
    }
    else
    {
        System.out.println(temp+" is not a Palindrome");
    }
}
}