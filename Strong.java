import java.util.Scanner;

public class Strong {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter any Number : ");
        int n=s.nextInt();
        s.close();
        int temp,sum=0;
        int i;
        temp=n;
        while(n>0)
        {
            int r=0;
            int fact=1;
            r=n%10;
            for(i=1;i<=r;i++)
            {
              fact=fact*i;
            }
            sum+=fact;
            n=n/10;
        }
        if(sum==temp)
        {
            System.out.println(sum+" is a Strong Number");
        }
        else 
        {
            System.out.println(temp+" is not a Strong Number");
        }
    }
    
}
