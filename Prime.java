import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter any Number : ");
        int a=s.nextInt();
        s.close();
        int factor=0;
        for(int i=2;i<a;i++)
        {
            if(a%i==0)
            {
                factor++;
                break;
            }
        }
        if(factor==0)
        {
            System.out.println(a+" is a Prime Number");
        }
        else
        {
            System.out.println(a+" is not a Prime Number");
        }
    }
}
