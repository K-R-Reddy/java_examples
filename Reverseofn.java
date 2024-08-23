import java.util.Scanner;

public class Reverseofn {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter any Number : ");
        int n=s.nextInt();
        s.close();
        int r,rev=0;
        while(n>0)
        {
           r=n%10;
           rev=(rev*10)+r;
           n/=10;
        }
        System.out.println("Reverse of the number is : "+rev);
    }
}
