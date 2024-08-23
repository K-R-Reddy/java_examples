import java.util.*;
/**
 * Armstrong
 */
public class Armstrong {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter any Number : ");
        int n=s.nextInt();
        s.close();
        int sum=0;
        int r;
        int temp=n;
        int count=0;
        while(temp!=0)
        {
           temp=temp/10;
           count++;
        }
        temp=n;
        while(temp!=0)
        {
            r=temp%10;
            sum+=(Math.pow(r, count));
            temp/=10;
        }
        if(sum==n)
        {
            System.out.println(n+" is an Armstrong Number");
        }
        else
        {
            System.out.println(n+" is not an Armstrong Number");
        }
    }
}