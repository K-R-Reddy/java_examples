import java.util.Scanner;

public class ForEachLoop {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a[]=new int[15];
        int sum=0;
        System.out.println("Enter Array size : ");
        int n=s.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter Element : ");
            a[i]=s.nextInt();
        }
        s.close();
        for (int i : a) {
           sum+=i; 
        }
        System.out.println("Sum of Elements :"+sum);

    }
}
