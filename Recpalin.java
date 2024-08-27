import java.util.*;
public class Recpalin {
    static int r=0;
    static int rev=0;
    static int palin(int n)
    {
        if(n==0)
        {
            return rev;
        }
        else
        {
            r=n%10;
            rev=(rev*10)+r;
            n=n/10;
            return palin(n);
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Number : ");
        int num=s.nextInt();
        s.close();
        int reversed=palin(num);
        if(num==reversed){
            System.out.println(num+" is a Palindrome number");
        }
        else{
            System.out.println(num+" is not a Palindrome number");
        }
    }
}
