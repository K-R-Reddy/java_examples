import java.util.Scanner;

public class SumofN {
     public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Number : ");
        int n=s.nextInt();
        int sum=0;
        s.close();
        for(int i=1;i<=n;i++)
        sum+=i;
        System.out.println("Sum of first "+n+" natural numbers is "+sum);
    }
}
